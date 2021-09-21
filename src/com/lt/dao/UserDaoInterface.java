package com.lt.dao;

import com.lt.bean.Roles;
import com.lt.exception.RoleNotFoundException;
import com.lt.exception.StudentDetailsNotFoundException;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

public interface UserDaoInterface {
    public int login(String username, String password) throws SQLException;

    public Roles getRoleDetails(int roleId) throws SQLException;

    public void getUserMenu(int role, String userName) throws SQLException, IOException, RoleNotFoundException, StudentDetailsNotFoundException;

    public String getLoginTime();


}
