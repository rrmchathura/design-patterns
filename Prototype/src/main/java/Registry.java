import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<MobileType, Mobile> mobiles = new HashMap<>();

    public Registry() {
        initialize();
    }

    public Mobile getMobile(MobileType mobileType) {
        Mobile mobile = null;
        try {
            mobile = (Mobile) mobiles.get(mobileType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mobile;
    }

    private void initialize() {
        Samsung samsung = new Samsung();
        samsung.setPrice(2000);
        samsung.setVersion("android 5");
        samsung.setName("Samsung");

        Iphone iphone = new Iphone();
        iphone.setOS("IOS");
        iphone.setPrice(300000);
        iphone.setName("iphone 13");

        mobiles.put(MobileType.LOW_PRICE, samsung);
        mobiles.put(MobileType.EXPENSIVE, iphone);
    }
}
