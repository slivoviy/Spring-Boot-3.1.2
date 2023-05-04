package com.sl17.springboot312.controller;

import com.sl17.springboot312.model.User;
import com.sl17.springboot312.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String showUsers(ModelMap model) {
        List<User> users = service.getUsers();
        model.addAttribute("users", users);

        return "users";
    }

    @GetMapping("addUser")
    public String addUser(ModelMap model) {
        User user = new User();
        model.addAttribute("user", user);

        return "user-info";
    }

    @PostMapping("saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        service.addUser(user);

        return "redirect:/";
    }

    @GetMapping("updateUser")
    public String updateUser(@RequestParam("id") long id, ModelMap model) {
        User user = service.getUserById(id);
        model.addAttribute("user", user);

        return "user-info";
    }

    @GetMapping("removeUser")
    public String removeUser(@RequestParam("id") long id) {
        service.removeUser(id);

        return "redirect:/";
    }
}
