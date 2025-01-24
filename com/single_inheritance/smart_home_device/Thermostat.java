package com.single_inheritance.smart_home_device;

// Defining the subclass Thermostat extending Device
class Thermostat extends Device
{
    // Declaring the temperature setting of the thermostat
    private int temperatureSetting;

    // Constructor to initialize Thermostat object
    public Thermostat(String deviceId, boolean status, int temperatureSetting)
    {
        // Calling the superclass constructor to set deviceId and status
        super(deviceId, status);

        // Intializing the instance variable and set the parameter value
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus method to include Thermostat-specific details
    @Override
    public void displayStatus()
    {
        // Calling the superclass method to display common device details
        super.displayStatus();

        // displaying the temprature details
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
