package com.lt.business;

import com.lt.dao.UserDao;
import com.lt.dao.UserDaoImpl;

import java.sql.SQLException;

public class UserImplService  implements UserDao {

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
