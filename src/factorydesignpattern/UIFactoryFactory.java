package factorydesignpattern;
//Thus is practical factory as we have moved our if else from flutter to a new class.
public class UIFactoryFactory {
    public static UIFactory getUIFactoryByPlatform(String platform){
         if(platform.equals ("Android")){
             return new AndroidUIFactory();
         }
         else if (platform.equals("Ios")){
             return new IosUIFactory();
         }
         return null;
    }
}
