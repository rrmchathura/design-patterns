public class Application {

    public static void main(String[] args){

        Package_Vat package_vat = new Package_Vat();
        Customs_Tax customs_tax = new Customs_Tax();
        SSF ssf = new SSF();

        customs_tax.setSuccessor(package_vat);
        package_vat.setSuccessor(ssf);

        Customs_Package customs_package = new Customs_Package(1,50);
        System.out.println(customs_tax.applyTax(customs_package));

        Customs_Package customs_package1 = new Customs_Package(2,250);
        System.out.println(customs_tax.applyTax(customs_package1));
    }
}
