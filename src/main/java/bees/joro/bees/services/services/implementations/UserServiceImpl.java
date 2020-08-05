package bees.joro.bees.services.services.implementations;

import bees.joro.bees.data.models.repositories.UsersRepository;
import bees.joro.bees.services.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


}
