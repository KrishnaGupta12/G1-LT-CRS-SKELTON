package com.lt.business;
import com.lt.bean.Roles;
import com.lt.dao.UserDaoInterface;
import com.lt.dao.UserDaoImpl;
import com.lt.exception.CourseFoundException;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.ProfessorExistedException;
import com.lt.exception.RoleNotFoundException;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.sql.SQLException;
/**
 * @author User Implementation with DAO Layer
 */
public class UserImplServiceInterface {
    private static Logger logger = Logger.getLogger(UserImplServiceInterface.class);
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

    public void getUserMenu(int role, String userName) throws SQLException, IOException, CourseNotFoundException {
        try {
            userDao.getUserMenu(role, userName);
        } catch (RoleNotFoundException e) {
            logger.error(e.getMessage());
        }
    }
}