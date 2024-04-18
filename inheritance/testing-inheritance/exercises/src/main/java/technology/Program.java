package technology;

public class Program {
    public static void main(String[] args) {
        SmartPhone iPhone = new SmartPhone("AT&T", "Apple", 64);
        iPhone.setBatteryLevel(105);
        System.out.println(iPhone.getBatteryLevel());
        iPhone.assignAndSetEntityID();
        Laptop mac = new Laptop(100, "Apple", 128);
        mac.assignAndSetEntityID();
        System.out.println(mac.getEntityID());
    }
}
