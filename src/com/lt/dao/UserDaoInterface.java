package com.lt.dao;

import com.lt.bean.Roles;

import com.lt.exception.CourseNotAssignedToProfessorException;
import com.lt.exception.CourseNotFoundException;
import com.lt.exception.GradeNotAddedException;
import com.lt.exception.ProfessorNotFoundException;
import com.lt.exception.StudentNotFoundException;
import com.lt.exception.UserNotFoundException;

import com.lt.exception.RoleNotFoundException;
import com.lt.exception.StudentDetailsNotFoundException;


import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

public interface UserDaoInterface {
	public int login(String username, String password) throws SQLException, UserNotFoundException;

    public Roles getRoleDetails(int roleId) throws SQLException, RoleNotFoundException;

    public void getUserMenu(int role, String userName) throws SQLException, IOException, CourseNotFoundException, StudentNotFoundException, GradeNotAddedException, ProfessorNotFoundException, CourseNotAssignedToProfessorException, RoleNotFoundException;

    public String getLoginTime();


}
