package technology;

public class Program {
    public static void main(String[] args) {
        SmartPhone iPhone = new SmartPhone("AT&T", "Apple", 64);
        iPhone.setBatteryLevel(105);
        System.out.println(iPhone.getBatteryLevel());
        System.out.println(iPhone.getID());
        Laptop mac = new Laptop(100, "Apple", 128);
        System.out.println(mac.getBrandName());
        System.out.println(mac.getID());
        Laptop mac2 = new Laptop(55.5, "Apple", 256);
        System.out.println(mac2.getID());
        System.out.println(mac.getID());
        System.out.println(mac2.getID());
    }
}
