package com.creatio.crm.language.assignments;

// Main class to run the program
public class Assignment3_Main {
    public static void main(String[] args) {
        // Create an instance of Employees
    	Assignment3_Employees employees = new Assignment3_Employees();

        // Create an instance of EmpGroups and pass the Employees instance to it
        Assignment3_EmpGroups empGroups = new Assignment3_EmpGroups(employees);

        // Display the employee names and IDs
        empGroups.displayEmployees();
    }
}
