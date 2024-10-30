package vehicle_application;

import vehicle_application.context.LuxuryVechile;
import vehicle_application.context.SportsVehicle;
import vehicle_application.context.Vehicle;
import vehicle_application.strategies.LuxuryDrive;
import vehicle_application.strategies.NormalDrive;

public class Application {
    public static void main(String[] args) {
        Vehicle mercedes = new LuxuryVechile(new LuxuryDrive());
        mercedes.drive();

        Vehicle audi = new SportsVehicle(new LuxuryDrive());
        audi.drive();

        Vehicle bmw = new LuxuryVechile(new NormalDrive());
        bmw.drive();
    }
}
