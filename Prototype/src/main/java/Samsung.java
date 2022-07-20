public class Samsung extends Mobile {

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "version='" + version + '\'' +
                "name='" + name + '\'' +
                "price='" + price + '\'' +
                '}';
    }
}
