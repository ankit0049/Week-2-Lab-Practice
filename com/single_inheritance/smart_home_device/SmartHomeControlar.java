package com.single_inheritance.smart_home_device;

public class SmartHomeControlar
{
    public static void main(String[] args)
    {
        // Creating a Thermostat object with device details
        Thermostat thermostatObject = new Thermostat("Ank049", true, 27);

        // Displaying the details of the thermostat via calling the displayStatus
        thermostatObject.displayStatus();
    }
}
