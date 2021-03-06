package bees.joro.bees.services.services;

import bees.joro.bees.data.models.base.User;
import bees.joro.bees.services.models.UserServiceModel;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User register(UserServiceModel model);

    //UserServiceModel findUserByUserName(String username);

}
