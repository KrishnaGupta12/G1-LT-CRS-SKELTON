package com.lt.business;


import com.lt.dao.UserDaoImpl;
import com.lt.exception.RoleNotFoundException;
import com.lt.exception.StudentDetailsNotFoundException;
import org.apache.log4j.Logger;


import java.io.IOException;
import java.sql.SQLException;
/**
 * @author User Implementation with DAO Layer
 */
public class UserImplServiceInterface {


    private static Logger logger = Logger.getLogger(UserImplServiceInterface.class);


    UserDaoImpl userDao = UserDaoImpl.getInstance();

    public int login(String username, String password) throws SQLException {
        return userDao.login(username, password);
    }

    public void getUserMenu(int role, String userName) throws SQLException, IOException, StudentDetailsNotFoundException, RoleNotFoundException {
        userDao.getUserMenu(role, userName);
    }

}