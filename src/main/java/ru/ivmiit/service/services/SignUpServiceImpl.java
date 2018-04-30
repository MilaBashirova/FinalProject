package ru.ivmiit.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.ivmiit.service.forms.UserForm;
import ru.ivmiit.service.models.Role;
import ru.ivmiit.service.models.State;
import ru.ivmiit.service.models.User;
import ru.ivmiit.service.repositories.UsersRepository;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(UserForm userForm) {

        String hashPassword = passwordEncoder.encode(userForm.getPassword());

        User user = User.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .hashPassword(hashPassword)
                .login(userForm.getLogin())
                .role(Role.USER)
                .state(State.ACTIVE)
                .build();

        usersRepository.save(user);
    }

    @Override
    public Boolean checkLogin(String login) {
        if (!usersRepository.findOneByLogin(login).isPresent()) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean checkNullfield(UserForm userForm) {
        if (userForm.getLogin() == null || userForm.getFirstName() == null || userForm.getLastName() == null && userForm.getPassword() == null) {
            return true;
        }
        return false;
    }
}