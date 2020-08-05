package bees.joro.bees.services.services;

import bees.joro.bees.services.models.auth.RegisterUserServiceModel;

public interface AuthService {
    void register(RegisterUserServiceModel model);

    void login (RegisterUserServiceModel serviceModel);
}
