package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, String diskType, int capacity, int storedCapacity) {
        super(name, diskType, capacity, storedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void readData() {

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
