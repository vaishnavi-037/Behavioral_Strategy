package vehicle_application.context;

import vehicle_application.strategies.Drive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(Drive driveCapability)
    {
        super(driveCapability);
    }
    public void drive()
    {
        super.drive();
    }
}
