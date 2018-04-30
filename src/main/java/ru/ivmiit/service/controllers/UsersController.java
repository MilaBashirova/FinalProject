package ru.ivmiit.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ivmiit.service.services.UsersService;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        model.addAttribute("usersFromServer", usersService.findAll());
        return "users";
    }

    @GetMapping("/functions")
    public String functionAdmin() {
        return "functions";
    }


}
