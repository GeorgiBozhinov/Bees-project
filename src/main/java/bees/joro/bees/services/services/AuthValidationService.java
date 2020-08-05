package bees.joro.bees.services.services;

import bees.joro.bees.services.models.auth.RegisterUserServiceModel;

public interface AuthValidationService {
    boolean isValid(RegisterUserServiceModel model);
}
