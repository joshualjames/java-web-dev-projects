package technology;

public class Computer extends AbstractEntity{
    //Properties
    private double storageSpaceInGB;
    private double screenSize;
    private String brandName;
    private boolean isOn = true;


    //Constructors
    public Computer(String brand, double storage){
//        super();
        brandName = brand;
        storageSpaceInGB = storage;
    }

    //Getters
    public double getStorageSpaceInGB() {
        return storageSpaceInGB;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public String getBrandName() {
        return brandName;
    }

    //Methods
    public void powerButton(){
        isOn= !isOn;
    }
    public void download(Double downloadSize){
        storageSpaceInGB -= downloadSize;
    }

    @Override
    void assignAndSetEntityID() {
        this.getEntityID();
        this.setEntityID(this.getEntityID()+1);
    }
}
