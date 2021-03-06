package bees.joro.bees.web.view.controllers.profile;

//import bees.joro.bees.data.models.base.User;
//import bees.joro.bees.data.models.repositories.ProfileRepository;
//import bees.joro.bees.services.services.ProfileService;
//import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

//    private final ProfileService profileService;
//    private final ModelMapper modelMapper;
//
//    public ProfileController(ProfileService profileService, ModelMapper modelMapper) {
//        this.profileService = profileService;
//        this.modelMapper = modelMapper;
//    }

    @GetMapping("/profile")
    public String getProfile() {
        return "profile/profile.html";
    }

//    @GetMapping("/profile")
//    public User singleUser(ModelMapper modelMapper) {
//        String n = "taipan";
//
//        User oneUser = profileService.getUser(n);
//
//        return oneUser;
//    }
}
