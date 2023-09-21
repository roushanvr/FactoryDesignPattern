package factorydesignpattern;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton(){
     return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu(){
      return new AndroidMenu();
    }
}

