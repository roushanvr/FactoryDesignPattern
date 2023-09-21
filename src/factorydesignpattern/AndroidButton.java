package factorydesignpattern;

public class AndroidButton implements Button{
    @Override
    public void changeButtonSize() {
        System.out.println("Android Button...");
    }
}
