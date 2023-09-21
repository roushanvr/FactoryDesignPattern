package factorydesignpattern;

public class Client {
    public static void main(String[] args){
        Flutter flutter=new Flutter();
        UIFactory androidOrIosUIFactory=flutter.createUIFactory("Ios");
        Button button=androidOrIosUIFactory.createButton();
        button.changeButtonSize();
        Menu menu=androidOrIosUIFactory.createMenu();
        menu.changeMenu();
    }
}
