package technology;

public class SmartPhone extends Computer{
    //Properties
    private String carrier;
    private double batteryLevel;

    //Constructors
    public SmartPhone(String aCarrier, String brand, double storage){
        super(brand, storage);
        carrier = aCarrier;
    }

    //Getters and Setters

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        if (batteryLevel>100){batteryLevel=100;}
        this.batteryLevel = batteryLevel;
    }

    //Methods
    public void phoneCharge(){
        if (batteryLevel <100){
            batteryLevel += 10;
            if (batteryLevel > 100){
                batteryLevel = 100;}}
    }
    @Override
    void assignAndSetEntityID() {
        this.getEntityID();
        this.setEntityID(this.getEntityID()+1);
    }
}
