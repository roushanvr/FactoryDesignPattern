package factorydesignpattern;

public class IosButton implements Button{
    @Override
    public void changeButtonSize() {
        System.out.println("Ios Button...");
    }
}
