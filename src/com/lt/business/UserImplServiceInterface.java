package com.lt.business;

import com.lt.bean.Roles;
import com.lt.dao.UserDaoInterface;
import com.lt.dao.UserDaoImpl;
import com.lt.exception.RoleNotFoundException;
import com.lt.exception.UserNotFoundException;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author User Implementation with DAO Layer
 */
public class UserImplServiceInterface {


    UserDaoImpl userDao = new UserDaoImpl();


    public int login(String username, String password) throws SQLException, UserNotFoundException {
        return userDao.login(username, password);
    }


    public void getUserMenu(int role, String userName) throws SQLException, IOException{
        userDao.getUserMenu(role, userName);
    }
}
