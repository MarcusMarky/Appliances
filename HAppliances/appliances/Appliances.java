package appliances;

public abstract class Appliances {
   
    private int powerConsumption;

    public Appliances() {
        powerConsumption = 0;
    }

    public Appliances(int powerConsumption) {
              setPowerConsumption(powerConsumption);

    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
      //HW1: 
        if (powerConsumption >= 1 && powerConsumption <= 10_000 )
        this.powerConsumption = powerConsumption;
    }
    
}
