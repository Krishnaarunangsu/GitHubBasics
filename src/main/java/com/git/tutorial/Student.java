/**
 * 
 */
package com.git.tutorial;

import java.io.Serializable;

/**
 * @author arunangsu.sahu
 *
 */
public class Student implements Serializable {

	private String studentId;
	private String studentName;
	/**
	 * 
	 */
	public Student() {
		// No-argument Constructor
	}
	
	/**
	 * @param studentId
	 * @param studentName
	 */
	public Student(String studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}
