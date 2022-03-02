package com.ylmz.BookSeller.service;

import com.ylmz.BookSeller.Model.User;

import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
