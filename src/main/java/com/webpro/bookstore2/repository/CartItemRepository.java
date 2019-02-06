package com.webpro.bookstore2.repository;

import java.util.List;

import com.webpro.bookstore2.domain.CartItem;
import com.webpro.bookstore2.domain.Order;
import com.webpro.bookstore2.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	List<CartItem> findByOrder(Order order);
}
