// Create a Employee class and its attribute are employeeId and department and salary
class Employee
{

    // Create a employeeId Instance variable of type int
    public int employeeID;

    // Create a department Instance variable of type String
    protected String department;

    // Create a salary Instance variable of type double
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary)
    {
        // Assigning values to instance variables
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to set the salary (since salary is private)
    public void setSalary(double salary)
    {
        // Updating the salary value
        this.salary = salary;
    }

    public void displayManagerDetails()
    {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee
{
    public Manager(int employeeID, String department, double salary)
    {
        super(employeeID, department, salary);
    }

}

class Main
{
    public static void main(String[] args)
    {
     // Creating the object of employee class  and intialize the attribute
     Employee employeeOne = new Employee(2010, "IT", 89000);

     // Creating the object of Manager class and intialize the attribute
        Manager employeeTwo = new Manager(1021, "HR", 100200);

        // Displaying the result of the employeeOne obejct
        employeeOne.displayManagerDetails();

        // displaying the result of the employeeTwo object
        employeeTwo.displayManagerDetails();
    }
}