package com.furniturestore.dao;

import com.furniturestore.model.UsersDetail;

import java.util.List;


public interface UsersDetailDao {

    void addUser (UsersDetail usersDetail);

    UsersDetail getUserById (int userId);

    List<UsersDetail> getAllUsers();

    UsersDetail getUserByUsername (String username);

}
