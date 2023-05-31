package appliances;

public class Boiler extends Appliances implements CanHeatWater{
    private byte temeperature;

    public Boiler() {
        super();
        temeperature = 0; 
    }

    public Boiler(int powerConsumption) {
        super(powerConsumption);
    }

    public  Boiler(int powerConsumption, byte temeperature) {
        super(powerConsumption);
        setTemeperature(temeperature);
    }
    
    public byte getTemperature() {
        return temeperature; 
    }  


    public void setTemeperature(byte temeperature) {
        this.temeperature = temeperature;
    }

   
    public void heat() {
        temeperature = 60;
    }
}
