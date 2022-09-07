package com.dilanlongla.code.repository;

import org.springframework.data.repository.CrudRepository;

import com.dilanlongla.code.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
