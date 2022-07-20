public class Customs_Package {

    private int packageNumber;
    private double amount;
    private double tax;

    protected void setTax(double tax) {
        this.tax = tax;
    }

    public Customs_Package(int packageNumber, double amount) {
        this.packageNumber = packageNumber;
        this.amount = amount;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }
}
