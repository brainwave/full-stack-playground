package com.departments;

public class SuperDepartment {

	public String departmentName() {
		return "Super Department";
	};
	public String getTodaysWork() {
		return "No Work as of now";
	};
	public String getWorkDeadline() {
		return "Nil";
	};
	protected static String isTodayAHoliday() { //static so this method is generated once for all objects
		return "Today is not a holiday";
	}; 
	
}
