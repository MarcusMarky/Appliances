package appliances;

public class Blender extends Appliances implements CanSpin{
    
private int rpm;

public Blender () {
    super();
    rpm = 0;
}
//HW3:
public Blender(int powerConsumption) {
    super(powerConsumption);
    rpm = 0;
}
public  Blender(int powerConsumption, int rpm) {
    super(powerConsumption);
    setRpm(rpm);
}

public int getRpm() {
    return rpm;
}

public void setRpm(int rpm) {
    this.rpm = rpm;
}

public void spin(){
rpm = 2000;
}

}
