// Create a class pateint to manage the patient details
public class Patient
{

    // Static variable shared among all patients
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    // Final variable to uniquely identify each patient
    final String patientID;

    // Instance variables to store patient's name, age, and ailment
    String name;
    int age;
    String ailment;

    // Constructor to initialize patient details
    public Patient(String name, int age, String ailment, String patientID) {
        // Initializing name using 'this' keyword
        this.name = name;

        // Initializing age using 'this' keyword
        this.age = age;

        // Initializing ailment using 'this' keyword
        this.ailment = ailment;

        // Initializing patientID using 'this' keyword
        this.patientID = patientID;

        // Increment totalPatients whenever new patient came
        totalPatients++;
    }

    // Static method to count the total number of patients admitted
    public static void getTotalPatients() {
        // Displaying the total number of patients admitted to the hospital
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Instance method to display the details of the patient
    public void displayPatientDetails() {
        // Displaying the hospital name for all patients
        System.out.println("Hospital Name: " + hospitalName);

        // Displaying the patient's name
        System.out.println("Patient Name: " + name);

        // Displaying the patient's age
        System.out.println("Patient Age: " + age);

        // Displaying the patient's ailment
        System.out.println("Patient Ailment: " + ailment);

        // Displaying the unique patient ID
        System.out.println("Patient ID: " + patientID);
    }

    public static void main(String[] args) {
        // Creating a new patient object and initializing its details
        Patient patient1 = new Patient("ABC", 25, "Fever", "P12345");

        // Checking if the current object is an instance of the Patient class
        if (patient1 instanceof Patient) {
            // Displaying the details of patient1 if it is an instance of Patient class
            patient1.displayPatientDetails();
        }

        // Calling the static method to display the total number of patients
        getTotalPatients();
    }
}