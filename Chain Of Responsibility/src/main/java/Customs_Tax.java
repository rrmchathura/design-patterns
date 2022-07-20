public class Customs_Tax extends Handler {


    @Override
    public double applyTax(Customs_Package customs_package) {
        return successor.applyTax(customs_package);
    }
}
