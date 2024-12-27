package com.creatio.crm.language.assignments;

// Class to store the employee data in arrays and display it
public class Assignment3_EmpGroups {
	public String[] empNames; // Array to store employee names
	public int[] empIds;      // Array to store employee IDs

    // Constructor that takes an Employees object and initializes the arrays
    public Assignment3_EmpGroups(Assignment3_Employees employees) {
        this.empNames = employees.getNames();
        this.empIds = employees.getIds();
    }

    // Method to display employee names and IDs
    public void displayEmployees() {
        // Loop through the arrays and print each employee's name and ID
        for (int i = 0; i < empNames.length; i++) {
            System.out.println("Employee Name: " + empNames[i] + ", Employee ID: " + empIds[i]);
        }
    }
}
