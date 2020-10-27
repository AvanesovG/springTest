package com.avanes.springboot.repository;

import com.avanes.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User>findUserByLastName(String lastname);

}
