package com.lt.dao;

import java.sql.SQLException;

public interface UserDao {
    public String login (String username, String password) throws SQLException;
}
