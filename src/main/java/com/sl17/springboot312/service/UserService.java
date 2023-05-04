package com.sl17.springboot312.service;



import com.sl17.springboot312.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUserById(long id);

    void removeUser(long id);
}
