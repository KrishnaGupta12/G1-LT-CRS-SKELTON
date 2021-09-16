package com.lt.dao;

import java.sql.SQLException;

public interface UserDaoInterface {
    public String login (String username, String password) throws SQLException;
}
