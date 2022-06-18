package me.carly.crud.controller;

import me.carly.crud.model.User;
import me.carly.crud.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private static final String REDIRECT = "redirect:/list";

    @GetMapping("/list")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getUsers());

        return "list";
    }

    @GetMapping("/create")
    public String getCreateUser(Model model, User user) {
        model.addAttribute("user", user);

        return "create";
    }

    @PostMapping("/create")
    public String createUser(User user) {
        userService.addUser(user);

        return REDIRECT;
    }

    @GetMapping("/delete/{id}")
    public String removeUser(@PathVariable("id") Long id) {
        userService.removeUser(id);

        return REDIRECT;
    }

    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUserByID(id));

        return "update";
    }

    @PostMapping("/update")
    public String postUpdateUser(User user) {
        userService.updateUser(user);

        return REDIRECT;
    }
}
