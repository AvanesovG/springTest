package com.avanes.springboot.service;

import com.avanes.springboot.model.User;
import com.avanes.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findById(Long id) {
        return repository.getOne(id);

    }

    public List<User> findAll() {
        return repository.findAll();

    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);

    }
}
