package com.lt.exception;

public class CourseFoundException extends Exception {
	
	/***
	 * Constructor
	 * @param courseCode
	 */
	public CourseFoundException() {
		
	}
	

	
	public String getMessage(long courseId) {
		return "Course with courseCode: " + courseId + " already present in catalog.";
	}
}
