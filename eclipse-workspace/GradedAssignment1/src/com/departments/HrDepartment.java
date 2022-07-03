package com.departments;

public class HrDepartment extends SuperDepartment {
	public HrDepartment() {
		System.out.println("Welcome to "+this.departmentName());
		System.out.println(this.doActivity());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}
	public String departmentName( ) {
		return "Hr Department";
	}
	public String getTodaysWork( ) {
		return "Fill today's worksheet and mark your attendance";
	}
	public String getWorkDeadline( ) {
		return "Complete by EOD";
	}	
	public String doActivity( ) {
		return "team Lunch";
	}	
}
