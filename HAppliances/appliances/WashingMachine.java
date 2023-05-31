package appliances;

public class WashingMachine extends Appliances implements CanHeatWater, CanSpin{
    private int rpm;
    private byte temperature;

    public WashingMachine() {
        super();
        rpm = 0;
        temperature = 0;

    }
    //HW4:
    public WashingMachine(int powerConsumption) {
        super(powerConsumption);
        rpm = 0;
        temperature = 0;
    }
    public WashingMachine(int powerConsumption, int rpm, byte temperature) {
        super(powerConsumption);
        this.rpm = rpm;
        this.temperature = temperature;
    }
    public int getRpm() {
        return rpm;
    }
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    public byte getTemperature() {
        return temperature;
    }
    public void setTemperature(byte temperature) {
        this.temperature = temperature;
    }
public void heat() {
    temperature = 40;
}
public void spin() {
    rpm = 1000;
}
}
