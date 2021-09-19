package com.lt.dao;

import com.lt.bean.Roles;
import com.lt.exception.RoleNotFoundException;
import com.lt.exception.UserNotFoundException;

import java.io.IOException;
import java.sql.SQLException;

public interface UserDaoInterface {
    public int login(String username, String password) throws SQLException, UserNotFoundException;

    public Roles getRoleDetails(int roleId) throws SQLException, RoleNotFoundException;

    public void getUserMenu(int role, String userName) throws SQLException, IOException, UserNotFoundException, RoleNotFoundException;
}
