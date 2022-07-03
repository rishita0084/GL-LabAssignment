package com.GreatLearning.GradedAssignment1;

public class Main {

    public static void main(String[] args) {
	    HrDepartment hr = new HrDepartment();
        TechDepartment tech = new TechDepartment();
        AdminDepartment admin = new AdminDepartment();

        admin.display();
        System.out.println();
        hr.display();
        System.out.println();
        tech.display();
    }
}
