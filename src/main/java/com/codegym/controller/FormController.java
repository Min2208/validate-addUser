package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController{
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ModelAndView formAdd(){
        ModelAndView modelAndView = new ModelAndView("index", "user",new User());
        return modelAndView;

    }


    @PostMapping("/")
    public ModelAndView addUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("index");
        }else {
            userService.save(user);

            return new ModelAndView("result");
        }

    }



}
