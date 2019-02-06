package com.webpro.bookstore2.repository;

import com.webpro.bookstore2.domain.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, Long>{

}
