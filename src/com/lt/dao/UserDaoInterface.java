package com.lt.dao;

import com.lt.bean.Roles;

import java.sql.SQLException;

public interface UserDaoInterface {
    public int login (String username, String password) throws SQLException;
    public Roles getRoleDetails(int roleId) throws SQLException;
    public void getUserMenu(int role,String userName) throws SQLException;
}
