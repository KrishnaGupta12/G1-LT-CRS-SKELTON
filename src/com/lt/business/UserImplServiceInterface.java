package com.lt.business;

import com.lt.bean.Roles;
import com.lt.dao.UserDaoInterface;
import com.lt.dao.UserDaoImpl;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author User Implementation with DAO Layer
 */
public class UserImplServiceInterface {

    //    @Override
//    public void getUserName() {
//
//    }
//
//    @Override
//    public void gatPassword() {
//
//    }
    UserDaoImpl userDao = UserDaoImpl.getInstance();


    public int login(String username, String password) throws SQLException {
        return userDao.login(username, password);
    }


    public void getUserMenu(int role, String userName) throws SQLException, IOException {
        userDao.getUserMenu(role, userName);
    }
}
