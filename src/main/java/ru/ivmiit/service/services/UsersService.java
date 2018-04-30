package ru.ivmiit.service.services;

import ru.ivmiit.service.models.User;

import java.util.List;

public interface UsersService {
    List<User> findAll();
}
