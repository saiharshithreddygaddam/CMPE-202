public class CustomerReceipt implements Printbill {
    @Override
    public void printItemDescription(Burger burger) {
        System.out.println("Customer Receipt");
        System.out.println("1\tLBB \t \t \t \t 5.59");
        System.out.println(burger.printItemDescription());
        System.out.println("1\tLTL CAJ \t \t \t 2.79");
        System.out.println("\tSub Total \t \t \t 8.38\n");
    }
}
