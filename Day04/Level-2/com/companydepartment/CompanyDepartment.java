package com.companydepartment;

// Main class to demonstrate the Company-Department-Employee relationship
class CompanyDepartment {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Capgemini");

        // Create departments
        Department itDepartment = new Department("IT Department");
        Department hrDepartment = new Department("HR Department");

        // Create employees for IT Department
        Employee ajeet = new Employee("Ajeet", "Software Engineer");
        Employee amit = new Employee("Amit", "System Administrator");

        // Create employees for HR Department
        Employee abhishek = new Employee("Abhishek", "HR Manager");
        Employee ankit = new Employee("Ankit", "Recruiter");

        // Add employees to departments
        itDepartment.addEmployee(ajeet);
        itDepartment.addEmployee(amit);
        hrDepartment.addEmployee(abhishek);
        hrDepartment.addEmployee(ankit);

        // Add departments to the company
        company.addDepartment(itDepartment);
        company.addDepartment(hrDepartment);

        // Display company details
        company.showDepartments();

        // Delete the company and demonstrate composition
        company.deleteCompany();

        company.showDepartments();



    }
}

