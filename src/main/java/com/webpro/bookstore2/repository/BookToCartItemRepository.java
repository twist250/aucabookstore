package com.webpro.bookstore2.repository;

import com.webpro.bookstore2.domain.BookToCartItem;
import com.webpro.bookstore2.domain.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
