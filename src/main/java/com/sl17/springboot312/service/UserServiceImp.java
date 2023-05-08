package com.sl17.springboot312.service;

import com.sl17.springboot312.dao.UserRepository;
import com.sl17.springboot312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

//    @Transactional
    @Override
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }

//    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

//    @Transactional(readOnly = true)
    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }

//    @Transactional
    @Override
    public void removeUser(long id) {
        userRepository.deleteById(id);
    }

}
