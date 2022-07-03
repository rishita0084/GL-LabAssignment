package com.GreatLearning.GradedAssignment1;

public class HrDepartment extends SuperDepartment{
    public String departmentName(){
        return "Hr Department";
    }
    public String getTodaysWork(){
        return "Fill today’s timesheet and mark your attendance";
    }
    public String getWorkDeadline(){
        return "Complete by EOD";
    }
    public String doActivity(){
        return "Team Lunch";
    }

    public void display(){
        System.out.println("Welcome to "+departmentName());
        System.out.println(doActivity());
        System.out.println(getTodaysWork());
        System.out.println(getWorkDeadline());
        System.out.println(isTodayAHoliday());
    }
}
