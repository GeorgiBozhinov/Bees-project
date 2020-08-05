package bees.joro.bees.web.view.controllers;

import bees.joro.bees.services.services.AuthService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    private final AuthService authService;
    private final ModelMapper mapper;

    public  AuthController(AuthService authService,
                           ModelMapper mapper){
        this.authService = authService;
        this.mapper = mapper;
    }

    @GetMapping("/login")
    public String getLoginForm() {
        return "auth/login.html";
    }

    @GetMapping("/register")
    public String getRegisterForm() {
        return "auth/register.html";
    }

//    @PostMapping("/register")
//    public String register(@ModelAttribute RegisterUserModel model){
//        RegisterUserServiceModel serviceModel = mapper.map(model, RegisterUserServiceModel.class);
//        authService.register(serviceModel);
//        return "redirect:/";
//    }
}
