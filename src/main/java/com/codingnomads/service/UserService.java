package com.codingnomads.service;

import com.codingnomads.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
