//package bees.joro.bees.services.services.implementations;
//
//import bees.joro.bees.data.models.base.User;
//import bees.joro.bees.data.models.repositories.ProfileRepository;
//import bees.joro.bees.services.services.ProfileService;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ProfileServiceImpl implements ProfileService {
//
//    private final ProfileRepository profileRepository;
//    private final ModelMapper modelMapper;
//
//    @Autowired
//    public ProfileServiceImpl(ProfileRepository profileRepository, ModelMapper modelMapper) {
//        this.profileRepository = profileRepository;
//        this.modelMapper = modelMapper;
//    }
//
//    // Extract single user from the users table
//    @Override
//    public User getUser(String nickname) {
//        String nick = "taipan";
//
//        return profileRepository.getOneUser(nick);
//    }
//}
