package vehicle_application.context;

import vehicle_application.strategies.Drive;

public class PublicVehicle extends Vehicle{
    public PublicVehicle(Drive driveCapability)
    {
        super(driveCapability);
    }
    public void drive()
    {
        super.drive();
    }
}
