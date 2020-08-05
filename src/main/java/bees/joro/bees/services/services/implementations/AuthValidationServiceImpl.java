package bees.joro.bees.services.services.implementations;

import bees.joro.bees.data.models.repositories.UsersRepository;
import bees.joro.bees.services.models.auth.RegisterUserServiceModel;
import bees.joro.bees.services.services.AuthValidationService;
import org.springframework.stereotype.Service;

@Service
public class AuthValidationServiceImpl implements AuthValidationService {

    private final UsersRepository usersRepository;

    public AuthValidationServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public boolean isValid(RegisterUserServiceModel user) {
        return this.isEmailValid(user.getEmail())
                && this.arePasswordsValid(user.getPassword(), user.getConfirmPassword())
                && this.isNameValid(user.getName());
    }

    private boolean isNameValid(String name) {
        return usersRepository.existsByUsername(name);
    }

    private boolean isEmailValid(String email) {
        return false;
    }

    private boolean arePasswordsValid(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
}



