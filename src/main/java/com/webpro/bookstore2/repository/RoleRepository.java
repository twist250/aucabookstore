package com.webpro.bookstore2.repository;

import com.webpro.bookstore2.domain.security.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
