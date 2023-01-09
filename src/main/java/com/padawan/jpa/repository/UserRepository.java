package com.padawan.jpa.repository;

import com.padawan.jpa.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
