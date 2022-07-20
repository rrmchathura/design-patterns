public class Iphone extends Mobile {
    private String OS;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "OS='" + OS + '\'' +
                "name='" + name + '\'' +
                "price='" + price + '\'' +
                '}';
    }
}
