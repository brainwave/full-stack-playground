package com.departments;

public class AdminDepartment extends SuperDepartment {
	public AdminDepartment() {
		System.out.println("Welcome to "+this.departmentName());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}
	public String departmentName( ) {
		return "Admin Department";
	}
	public String getTodaysWork( ) {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline( ) {
		return "Complete by EOD";
	}	
}
