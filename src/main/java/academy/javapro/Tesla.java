package cus1168;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // Constructor
    public Tesla(String model, int year) {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }

    // Implementing Vehicle methods
    @Override
    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(make + " " + model + " started");
        } else {
            System.out.println(make + " " + model + " is already running");
        }
    }

    @Override
    public void stopEngine() {
        if (isRunning) {
            isRunning = false;
            System.out.println(make + " " + model + " stopped");
        } else {
            System.out.println(make + " " + model + " is already off");
        }
    }

    @Override
    public void accelerate() {
        if (isRunning) {
            System.out.println(make + " " + model + " is accelerating...");
        } else {
            System.out.println("Start the car first before accelerating.");
        }
    }

    @Override
    public void brake() {
        System.out.println(make + " " + model + " is braking...");
    }

    // Implementing Electric methods
    @Override
    public void charge() {
        charging = true;
        System.out.println(make + " " + model + " is now charging");
    }

    @Override
    public boolean isCharging() {
        return charging;
    }

    // Implementing Autonomous methods
    @Override
    public void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled");
    }

    @Override
    public void disableAutopilot() {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled");
    }

    @Override
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }

    // Method to display Tesla's status
    public void displayStatus() {
        System.out.println(make + " " + model + " " + year);
        System.out.println("Running: " + isRunning);
        System.out.println("Autopilot: " + autopilotEnabled);
        System.out.println("Charging: " + charging);
    }
}
