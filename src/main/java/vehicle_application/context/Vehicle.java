package vehicle_application.context;

import vehicle_application.strategies.Drive;

public class Vehicle {
    Drive driveCapability;
    public Vehicle(Drive driveCapability)
    {
        this.driveCapability = driveCapability;
    }
    public void drive()
    {
        driveCapability.drive();
    }
}
