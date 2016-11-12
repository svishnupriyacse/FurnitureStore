package com.furniturestore.service;

import com.furniturestore.model.UsersDetail;

import java.util.List;


public interface UsersDetailService {

    void addUser (UsersDetail usersDetail);

    UsersDetail getUserById (int userId);

    List<UsersDetail> getAllUsers();

    UsersDetail getUserByUsername (String username);
}
