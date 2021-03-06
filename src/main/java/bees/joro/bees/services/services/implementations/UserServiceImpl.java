package bees.joro.bees.services.services.implementations;

import bees.joro.bees.data.models.base.User;
import bees.joro.bees.data.models.repositories.RoleRepository;
import bees.joro.bees.data.models.repositories.UserRepository;
import bees.joro.bees.error.Constants;
import bees.joro.bees.services.models.UserServiceModel;
import bees.joro.bees.services.services.RoleService;
import bees.joro.bees.services.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleService roleService;
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleService roleService,
                           RoleRepository roleRepository, ModelMapper modelMapper,
                           BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleService = roleService;
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public User register(UserServiceModel model) {

        User user = this.modelMapper.map(model, User.class);

        if (this.userRepository.count() == 0) {
            roleService.seedRolesInDb();

            user.setAuthorities(new HashSet<>(this.roleRepository.findAll()));
        } else {
            user.setAuthorities(new HashSet<>(Set.of(this.roleRepository.findByAuthority("USER"))));
        }

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        return this.userRepository.saveAndFlush(user);
    }

//    @Override
//    public UserServiceModel findUserByUserName(String username) {
//        return this.userRepository.findByUsername(username)
//                .map(u -> this.modelMapper.map(u, UserServiceModel.class))
//                .orElseThrow(() -> new UsernameNotFoundException(Constants.USERNAME_NOT_FOUND));
//    }

}
