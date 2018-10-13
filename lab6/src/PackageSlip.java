public class PackageSlip implements Printbill {


    @Override
    public void printItemDescription(Burger burger) {
        System.out.println("Package Slip");
        System.out.println("1\tLBB");
        System.out.println(burger.printItemDescription());
        System.out.println("1\tLTL CAJ");

    }
}
