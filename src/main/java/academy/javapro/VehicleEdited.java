package cus1168;

public abstract class VehicleEdited {
    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning;

    // TODO: Create constructor that takes make, model, and year
    public VehicleEdited(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        
    // TODO: Initialize isRunning to false
        
        this.isRunning = false;
    }

    // Abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate();
    public abstract void brake();

    // TODO: Create getters and setters for all fields
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
