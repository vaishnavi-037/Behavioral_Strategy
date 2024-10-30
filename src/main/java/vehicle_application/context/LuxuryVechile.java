package vehicle_application.context;

import vehicle_application.strategies.Drive;

public class LuxuryVechile extends Vehicle{
    public LuxuryVechile(Drive driveCapability) {
        super(driveCapability);
    }
    public void drive()
    {
        super.drive();
    }
}
