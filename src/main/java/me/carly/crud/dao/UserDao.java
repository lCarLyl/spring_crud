package me.carly.crud.dao;

import me.carly.crud.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);

    User getUserByID(Long id);

    List<User> getUsers();

}
