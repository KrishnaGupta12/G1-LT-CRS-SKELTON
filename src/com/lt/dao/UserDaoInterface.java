package com.lt.dao;
import com.lt.bean.Roles;
import com.lt.exception.CourseFoundException;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.RoleNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
public interface UserDaoInterface {
    public int login(String username, String password) throws SQLException;
    public Roles getRoleDetails(int roleId) throws SQLException;
    public void getUserMenu(int role, String userName) throws SQLException, IOException, RoleNotFoundException, CourseNotFoundException;
    public String getLoginTime();

}