package me.carly.crud.service;

import lombok.RequiredArgsConstructor;
import me.carly.crud.model.User;
import me.carly.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {


    @Autowired
    private final UserRepository userRepository;

    public User findByID(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteByID(Long id) {
        userRepository.deleteById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
