public class Application {

    public static void main(String[] args){

        Registry registry = new Registry();

        Samsung samsung = (Samsung) registry.getMobile(MobileType.LOW_PRICE);
        System.out.println(samsung);

        samsung.setName("Samsung J5");
        System.out.println(samsung);

        Samsung samsung1 = (Samsung) registry.getMobile(MobileType.LOW_PRICE);
        System.out.println(samsung1.toString());
    }
}
