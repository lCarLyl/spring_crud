package me.carly.crud.service;

import me.carly.crud.model.User;

import java.util.List;

public interface UserService {


    void addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);

    User getUserByID(Long id);

    List<User> getUsers();

}
