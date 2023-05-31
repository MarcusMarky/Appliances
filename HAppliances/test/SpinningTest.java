package test;

import appliances.WashingMachine;
import appliances.Blender;
import appliances.CanSpin;

public class SpinningTest implements Test{
    public boolean test() {
        return testSpinning(new Blender()) && testSpinning(new WashingMachine());
    }
  
    public boolean testSpinning(CanSpin testable){
        int spinningBefore = testable.getRpm();
        testable.spin();
        int spinningAfter = testable.getRpm();
        
        if (spinningAfter > spinningBefore) {
            System.out.println("Spinning test: Passed!\n");
            return true;
        } else {
            System.out.println("Spinning test: Failed\nReason: Spinning before test: " + spinningBefore +
            "\nspinning after test: " + spinningAfter);
            return false;
        }
    }
}

