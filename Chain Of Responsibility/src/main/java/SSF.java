public class SSF extends Handler {
    @Override
    public double applyTax(Customs_Package customs_package) {
        customs_package.setTax(customs_package.getTax() + customs_package.getAmount() * .04);
        System.out.println("SSF Calculated");
        return customs_package.getTax();
    }
}
