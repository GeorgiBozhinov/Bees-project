package bees.joro.bees.services.services.implementations;

import bees.joro.bees.data.models.base.User;
import bees.joro.bees.data.models.repositories.UsersRepository;
import bees.joro.bees.services.models.auth.RegisterUserServiceModel;
import bees.joro.bees.services.services.AuthService;
import bees.joro.bees.services.services.AuthValidationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final UsersRepository usersRepository;
    private final ModelMapper mapper;
    private final AuthValidationService authValidationService;

    public AuthServiceImpl(AuthValidationService authValidationService,
                           UsersRepository usersRepository,
                           ModelMapper mapper) {

        this.authValidationService = authValidationService;
        this.usersRepository = usersRepository;
        this.mapper = mapper;
    }


    @Override
    public void register(RegisterUserServiceModel model) {
        if (!authValidationService.isValid(model)) {
            //do something
            return;
        }

        User user = mapper.map(model, User.class);
        usersRepository.saveAndFlush(user);
    }

    @Override
    public void login(RegisterUserServiceModel serviceModel) {
//        String passwordHash = hashingService.hash(serviceModel.getPassword());
//        if (usersRepository.existsByUsernameAndPassword(serviceModel.getName(), serviceModel.getPassword())) {
//            //do something
//        }
    }

}
