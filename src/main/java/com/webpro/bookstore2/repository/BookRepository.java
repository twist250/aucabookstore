package com.webpro.bookstore2.repository;


import java.util.List;

import com.webpro.bookstore2.domain.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findByCategory(String category);
	
	List<Book> findByTitleContaining(String title);
}
