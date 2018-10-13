public class Main {


    public static void main(String args[]){
        Burger burger = new Burger();

        Component tomato = new Tomato ("TOMATO");
        Component bacon = new Bacon("BACON");
        Component lettuce = new Lettuce("LETTUCE");
        Component Gonion = new GOnion("G ONION");
        Component jalagrilled = new JalaGrilled("JALA GRILLED");
        //Composite c = new Composite();

        //System.out.println("Customer Receipt");
        //System.out.println("LBB \t \t \t \t 5.59");
        burger.addChild(bacon);
        burger.addChild(lettuce);
        burger.addChild(tomato);
        burger.addChild(Gonion);
        burger.addChild(jalagrilled);



        CustomerReceipt Receipt = new CustomerReceipt();
        Receipt.printItemDescription(burger);
        Burger burger2 = new Burger();
        burger2.addChild(lettuce);
        burger2.addChild(tomato);
        burger2.addChild(Gonion);
        burger2.addChild(jalagrilled);
        burger2.addChild(bacon);

        //System.out.println(burger.printItemDescription());
        PackageSlip slip = new PackageSlip();
        slip.printItemDescription(burger2);

        //String customerreceipt = burger.printItemDescription();
        //System.out.println(customerreceipt);
        //System.out.println("LTL CAJ \t \t \t 2.79");
        //System.out.println("Sub Total: \t \t \t 8.38\n");
        /*
        System.out.println("Packing Slip");
        System.out.println("LBB");
        Composite cmp = new Composite();
        cmp.addChild(lettuce);
        cmp.addChild(tomato);
        cmp.addChild(Gonion);
        cmp.addChild(jalagrilled);
        cmp.addChild(bacon);
        String packagereceipt = cmp.printItemDescription();
        System.out.println(packagereceipt);
        System.out.println("LTL CAJ");
    */
    }



}
