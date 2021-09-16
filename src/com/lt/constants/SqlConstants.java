package com.lt.constants;

public interface SqlConstants {

    //User table queries
    public final static String USER_TABLE_DATA = "select role from User where username =? && password=?";
    public final static String INSERT_TO_USER = "insert into user values (?,?,?)";

    //Student Table queries
    public final static String INSERT_TO_STUDENT = "insert into Student values (?,?,?,?,?,?,?)";
    public final static String GET_STUDENT_DATA = "select stud_id from Student where stud_email = ?";

    //Professor Table queries
    public final static String INSERT_TO_PROFESSOR = "insert into Professor values (?,?,?,?,?,?,?)";
    public final static String VIEW_COURSE = "select * from course";
    public final static  String ADD_GRADES=" insert into grade values (?,?,?) ";
    public final static String VIEW_REG_STUDENT =

    //Semester Table queries

    //Course Table queries
    public final static String AVAILABLE_COURSES = "select course_id,course_name,course_fee, course_duration, " +
            "course_type,course_details from Course where course_id IN (Select course_id from CourseCatalog where isAvailable = 'true')"+
            "and course_semester_id = ?";
    //public final static String LIST_REGISTERED_COURSES = "select course_id,course_name,course_fee, course_duration,course_type,course_details from Course where course_id IN (Select reg_course_id from RegisterCourses where reg_stud_id = ? and reg_semester_id = ?)";
    public static String LIST_REGISTERED_COURSES ="select c.course_id,c.course_name,c.course_fee, c.course_duration,c.course_type,c.course_details,r.payment_status,r.reg_semester_Id,r.reg_stud_id from Course c INNER JOIN RegisterCourses r ON c.course_id =r.reg_course_id ";

    //RegisterCourse Table queries
    public final static String REGISTER_COURSE = "insert into RegisterCourses values (?,?,?,'pending')";
    public final static String REMOVE_COURSE= "delete from RegisterCourses where reg_course_id =?";
    //public final static String PENDING_PAYMENT_LIST = "select c.course_id,c.course_name,c.course_fee, c.course_duration,c.course_type,c.course_details,r.payment_status from Course c INNER JOIN RegisterCourses r ON c.course_id IN ( Select reg_course_id from RegisterCourses where payment_status = 'pending' )";
    public final static String PENDING_PAYMENT_LIST = "select c.course_id,c.course_name,c.course_fee, c.course_duration,c.course_type,c.course_details,r.payment_status,r.reg_stud_id from Course c INNER JOIN RegisterCourses r ON c.course_id = r.reg_course_id ";

    public final static String UPDATE_PAYMENT_STATUS = "Update RegisterCourses set payment_status='Success' where reg_course_id = ?";

    //
    public final static String INSERT_PAYMENT_STATUS = "insert into payment values (?,?,?)";

    //Admin Table queries

    //CourseCatalog Table queries

    //GradeCard Table queries


}
