package com.webpro.bookstore2.repository;

import com.webpro.bookstore2.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;


public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
