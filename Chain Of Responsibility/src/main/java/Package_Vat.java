public class Package_Vat extends Handler {
    @Override
    public double applyTax(Customs_Package customs_package) {
        customs_package.setTax(customs_package.getTax() + customs_package.getAmount()*10);
        System.out.println("Package VAT calculated");
        if (customs_package.getAmount() > 100.0 && customs_package.getAmount() <=300.0){
            return customs_package.getTax();
        }else {
            return successor.applyTax(customs_package);
        }
    }
}
