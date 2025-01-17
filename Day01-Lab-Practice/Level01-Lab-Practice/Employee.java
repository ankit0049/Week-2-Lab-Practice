import java.util.Scanner;

// Created public class Employee to manage states and behaviours of employees
public class Employee
{
    // Create instance variable for manage the state and behaviour of the Employee
    private String employeeId=" ", employeeName = " ";

    // Create instance variable employeeSalary to manage the salary state
    private int employeeSalary = 0;

    // Employee constructor instantiate and assign the value in Instance variables
    Employee(String employeeId , String employeeName , int employeeSalary)
    {
        // Assigning the employee Details
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // employeeDetails method to display the employeeDetails
    private void employeeDetails()
    {
        System.out.println("Employee name :"+ employeeName);
        System.out.println("Employee Id :" + employeeId);
        System.out.println("Employee Salary :"+ employeeSalary);
    }
    public static void main(String[] args)
    {
        // Create a Scanner input object  to get the user input
        Scanner input = new Scanner(System.in);

        // Enter the details of employee  name , Id , salary
        System.out.print("Enter the employee Name : ");
        String employeeName = input.nextLine();

        System.out.print("Enter the employee Id : ");
        String employeeId = input.nextLine();

        System.out.print("Enter the employee Salary : ");
        int employeeSalary = input.nextInt();


        // Create Employee class object and assign the Id,name and salary to employee
        Employee employeeOne = new Employee( employeeId , employeeName, employeeSalary);

        // Display the employee details
        employeeOne.employeeDetails();

        // close the scanner object
        input.close();

    }
}
