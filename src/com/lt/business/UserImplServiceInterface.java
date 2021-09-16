package com.lt.business;

import com.lt.dao.UserDaoInterface;
import com.lt.dao.UserDaoImpl;

import java.sql.SQLException;

public class UserImplServiceInterface implements UserDaoInterface {

//    @Override
//    public void getUserName() {
//
//    }
//
//    @Override
//    public void gatPassword() {
//
//    }
    UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public String login(String username, String password) throws SQLException {
        return userDao.login(username,password);
    }
}
