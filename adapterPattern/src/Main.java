public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet lapAdapter = new LaptopAdapter(laptop);
        PowerOutlet refAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet spAdapter = new SmartphoneAdapter(smartphoneCharger);

        System.out.println("---TESTING ADAPTERS---");
        System.out.println(lapAdapter.plugIn());
        System.out.println(refAdapter.plugIn());
        System.out.println(spAdapter.plugIn());
    }
}
