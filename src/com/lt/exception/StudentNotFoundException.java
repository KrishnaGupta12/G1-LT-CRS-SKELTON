package com.lt.exception;

public class StudentNotFoundException extends Exception {
	
private long professorId;
private long studentId;
private long semesterId;
	
	
	public StudentNotFoundException(long professorId) {
	
	this.professorId = professorId;
}
	


	public StudentNotFoundException(long studentId, long semesterId) {
		
		this.studentId = studentId;
		this.semesterId = semesterId;
	}



	public String getMessage(long professorId){
		return "Student With "+ professorId +"Is Not Found!!!";
	}
	
	public String getMessage(long studentId,long semesterId){
		return "Student Id " + studentId + "for the semester" + semesterId + "is not found....";
	}

}