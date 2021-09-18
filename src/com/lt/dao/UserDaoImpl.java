package com.lt.dao;

import com.lt.bean.Roles;
import com.lt.business.AdminImplService;
import com.lt.client.AdminMenu;
import com.lt.client.ProfessorMenu;
import com.lt.client.StudentMenu;
import com.lt.constants.SqlConstants;
import com.lt.util.DBUtil;

import javax.management.relation.Role;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author User DAO implementation method for login to interacts with DB
 */

public class UserDaoImpl implements UserDaoInterface {
    Connection con = DBUtil.getConnection();
    PreparedStatement smt = null;

    /**
     * User Login Method
     */
    @Override
    public int login(String username, String password) throws SQLException {
        smt = con.prepareStatement(SqlConstants.USER_TABLE_DATA);
        smt.setString(1, username);
        smt.setString(2, password);
        int role = 0;
        ResultSet rs = smt.executeQuery();
        while (rs.next()) {
            role = rs.getInt(1);
        }
        return role;
    }

    @Override
    public Roles getRoleDetails(int roleId) throws SQLException {
        smt = con.prepareStatement(SqlConstants.GET_ROLE);
        smt.setInt(1, roleId);
        ResultSet rs = smt.executeQuery();
        Roles role = null;
        while (rs.next()) {
            int role_id = rs.getInt(1);
            String role_name = rs.getString(2);
            role = new Roles(role_id, role_name);
        }
        return role;
    }

    @Override
    public void getUserMenu(int role, String userName) throws SQLException, IOException {
        Roles roles = getRoleDetails(role);
        if (roles.getRole_id() == role && roles.getRole_name().equalsIgnoreCase("STUDENT")) {
            StudentMenu studentmenu = new StudentMenu();
            StudentDaoImpl studentDao = new StudentDaoImpl();
            long stud_id = studentDao.getStudent(userName);
            studentmenu.studentSession(userName, stud_id);
        } else if (roles.getRole_id() == role && roles.getRole_name().equalsIgnoreCase("PROFESSOR")) {
            ProfessorMenu professorMenu = new ProfessorMenu();
            ProfessorDaoImpl professorDao = new ProfessorDaoImpl();
            long professorId = professorDao.getProfessorId(userName);
            professorMenu.professorSession(userName, professorId);
        } else if (roles.getRole_id() == role && roles.getRole_name().equalsIgnoreCase("ADMIN")) {
            AdminMenu admin = new AdminMenu();
            AdminDaoImpl adminDao = new AdminDaoImpl();

            admin.adminSession(userName);
        } else {
            System.out.println("Invalid user");
        }
    }
}
