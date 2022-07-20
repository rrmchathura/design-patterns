public class FactoryDemo {

    public static void main(String[] args){
        PhoneFactory phoneFactory = new PhoneFactory();

        Phone phone = phoneFactory.getPhone("Expensive price");
        phone.showSpec();
    }
}
