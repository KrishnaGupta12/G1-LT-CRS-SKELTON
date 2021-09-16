package com.lt.dao;

import com.lt.constants.SqlConstants;
import com.lt.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDaoInterface {
    Connection con = DBUtil.getConnection();
    PreparedStatement smt = null;

    @Override
    public String login(String username, String password) throws SQLException {
        smt = con.prepareStatement(SqlConstants.USER_TABLE_DATA);
        smt.setString(1,username);
        smt.setString(2,password);
        String role = "";
       ResultSet rs = smt.executeQuery();
       while (rs.next()){
           role = rs.getString(1);
       }
        return role;
    }
}
