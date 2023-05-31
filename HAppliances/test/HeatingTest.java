package test;

import appliances.Boiler;
import appliances.CanHeatWater;
import appliances.WashingMachine;

public class HeatingTest implements Test{
    public boolean test() {
        return testHeating(new Boiler()) && testHeating(new WashingMachine());
    }
    public boolean testHeating(CanHeatWater testable){
        byte tempBefore = testable.getTemperature();
        testable.heat();
        byte tempAfter = testable.getTemperature();
        
        if (tempAfter > tempBefore) {
            System.out.println("Heating test: Passed!\n");
            return true;
        } else {
            System.out.println("Heating test: Failed\nReason: Temp before test: " + tempBefore +
            "\ntemp after test: " + tempAfter);
            return false;
        }
    }
}
