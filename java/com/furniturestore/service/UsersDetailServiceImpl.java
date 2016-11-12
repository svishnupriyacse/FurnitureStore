package com.furniturestore.service;

import com.furniturestore.dao.UsersDetailDao;
import com.furniturestore.model.UsersDetail;
import com.furniturestore.service.UsersDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UsersDetailServiceImpl implements UsersDetailService{

    @Autowired
    private UsersDetailDao usersDetailDao;

    public void addUser (UsersDetail usersDetail) {
    	usersDetailDao.addUser(usersDetail);
    }

    public UsersDetail getUserById(int userId) {
        return usersDetailDao.getUserById(userId);
    }

    public List<UsersDetail> getAllUsers() {
        return usersDetailDao.getAllUsers();
    }

    public UsersDetail getUserByUsername (String username) {
        return usersDetailDao.getUserByUsername(username);
    }
}
