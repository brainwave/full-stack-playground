package com.departments;

public class TechDepartment extends SuperDepartment {
	public TechDepartment() {
		System.out.println("Welcome to "+this.departmentName());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(this.getTechStackInformation());
		System.out.println(super.isTodayAHoliday());
	}
	public String departmentName( ) {
		return "Tech Department";
	}
	public String getTodaysWork( ) {
		return "Complete coding of Module 1";
	}
	public String getWorkDeadline( ) {
		return "Complete by EOD";
	}	
	public String getTechStackInformation( ) {
		return "Core Java";
	}	
}
