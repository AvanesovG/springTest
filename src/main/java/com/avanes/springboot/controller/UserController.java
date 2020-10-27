package com.avanes.springboot.controller;

import com.avanes.springboot.model.User;
import com.avanes.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping( value = "/users",method =RequestMethod.GET)
    public String findAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/users-create")
    public String createUserForm(User user) {
        return "/user-create";
    }

    @PostMapping
    public String createUser(User user) {
        userService.createUser(user);
        return "/redirect:/users";
    }

    @GetMapping( value = "user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "/redirect:/users";

    }
}
