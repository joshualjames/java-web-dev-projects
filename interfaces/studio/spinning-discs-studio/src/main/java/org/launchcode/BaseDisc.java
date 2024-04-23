package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private String diskType;
    private int capacity;
    private int storedCapacity;
    private String contents;

    //constructor

    public BaseDisc(String name, String diskType, int capacity, int storedCapacity) {
        this.name = name;
        this.diskType = diskType;
        this.capacity = capacity;
        this.storedCapacity = storedCapacity;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStoredCapacity() {
        return storedCapacity;
    }

    public void setStoredCapacity(int storedCapacity) {
        this.storedCapacity = storedCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    //Methods

    public void storeData(int dataSize) {
        int remainingCapacity = capacity - storedCapacity;
        if (dataSize < remainingCapacity) {
            System.out.println(this.getName() +" Storage successful!");
        } else {
            System.out.println("UhOh. Data size " + dataSize + " is greater than storage capacity.");
        }
    }

    public void writeData(int dataSize, String contents){
        int remainingCapacity = capacity - storedCapacity;
        if(dataSize< remainingCapacity){
            this.contents = contents;
            System.out.println("Contents: " +contents);
        }else {
            System.out.println("Unable to write content.");
        }
    }

    public void diskInfo(){
        System.out.println("Name: "+name+"\nDisk Type: "+diskType);
    }
}

