package technology;

public class Laptop extends Computer {
    //Properties
    private double batteryLevel;

    //Constructors
    public Laptop (double batteryLife, String brand, double storage){
        super(brand, storage);
        batteryLevel = batteryLife;
    }

    //Getters and Setters


    //Methods
    public void laptopCharge(){
        if (batteryLevel <100){
            batteryLevel += 5;
            if (batteryLevel > 100){
                batteryLevel = 100;}}
    }
    @Override
    void assignAndSetEntityID() {
        this.getEntityID();
        this.setEntityID(this.getEntityID()+1);
    }
}
