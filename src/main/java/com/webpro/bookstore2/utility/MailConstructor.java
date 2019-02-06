package com.webpro.bookstore2.utility;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.webpro.bookstore2.domain.Order;
import com.webpro.bookstore2.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


@Component
public class MailConstructor {
	@Autowired
	private Environment env;
	
	@Autowired
	private TemplateEngine templateEngine;
	
	public SimpleMailMessage constructResetTokenEmail(
			String contextPath, Locale locale, String token, User user, String password
			) {
		
		String url = contextPath + "/newUser?token="+token;
		String message = "\nPlease click on this link to verify your email and edit your personal information. Your password is: \n"+password;
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(user.getEmail());
		email.setSubject("AUCA's Bookstore - New User");
		email.setText(url+message);
		email.setFrom(env.getProperty("support.email"));
		return email;
		
	}
	
	public MimeMessagePreparator constructOrderConfirmationEmail (User user, Order order, Locale locale) {
		Context context = new Context();
		context.setVariable("order", order);
		context.setVariable("user", user);
		context.setVariable("cartItemList", order.getCartItemList());
		String text = templateEngine.process("orderConfirmationEmailTemplate", context);
		
		MimeMessagePreparator messagePreparator = new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper email = new MimeMessageHelper(mimeMessage);
				email.setTo(user.getEmail());
				email.setSubject("Order Confirmation - "+order.getId());
				email.setText(text, true);
				email.setFrom(new InternetAddress("aucawebtech@gmail.com"));
			}
		};

		createPDF(text, order);

		return messagePreparator;
	}

	private void createPDF(String text, Order order) {
//		Document document = new Document();

		try {
			/*PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(order.getId() + ".pdf"));
			document.open();
			document.add(new Paragraph(text));
			document.close();*/
			FileOutputStream pdfStream = new FileOutputStream(order.getId() + ".pdf");
			HtmlConverter.convertToPdf(text, pdfStream);
			pdfStream.close();
			File file = new File(order.getId() + ".pdf");
			System.out.println(file.getAbsolutePath());
			Process p = Runtime
					.getRuntime()
					.exec("rundll32 url.dll,FileProtocolHandler D:\\projects\\webPro\\bookstore2\\"+order.getId() + ".pdf");
			p.waitFor();
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}
}
