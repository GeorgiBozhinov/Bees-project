package bees.joro.bees.web.view.controllers;

import bees.joro.bees.data.models.base.bindings.UserProfileViewModel;
import bees.joro.bees.services.models.UserServiceModel;
import bees.joro.bees.services.services.UserService;
import bees.joro.bees.web.view.annotations.PageTitle;
import bees.joro.bees.web.view.models.UserRegisterModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class UserController {

    private final UserService userService;
    private final ModelMapper modelMapper;

    @Autowired
    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/register")
    private String register() {
        return "auth/register.html";
    }

    @PostMapping("/auth/register")
    private String register(@ModelAttribute UserRegisterModel model) {
        if (!model.getPassword().equals(model.getConfirmPassword())) {
            return "/auth/register.html";
        }

        this.userService.register(this.modelMapper.map(model, UserServiceModel.class));

        return "redirect:/home";
    }

    @GetMapping("/login")
    private String login() {
        return "auth/login.html";
    }

//    @GetMapping("/unauthorized")
//    private String unauthorized() {
//        return "auth/unauthorized.html";
//    }

//    @GetMapping("/profile")
//    @PreAuthorize("isAuthenticated()")
//    @PageTitle("Profile")
//    public ModelAndView profile(Principal principal, ModelAndView modelAndView){
//        modelAndView
//                .addObject("model", this.modelMapper
//                        .map(this.userService.findUserByUserName(principal.getName()), UserProfileViewModel.class));
//
//        return super.view("user/profile", modelAndView);
//    }
}
