package com.single_inheritance.smart_home_device;

// Defining the superclass Device
class Device
{
    // Declaring the unique device ID
    protected String deviceId;

    // Declaring the status of the device (ON/OFF)
    protected boolean status;

    // Constructor to initialize Device object
    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device details
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}