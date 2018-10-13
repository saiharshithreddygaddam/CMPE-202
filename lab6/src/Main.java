public class Main {


    public static void main(String args[]){
        Composite obj = new Composite();

        Component tomato = new Tomato ("TOMATO");
        Component bacon = new Bacon("BACON");
        Component lettuce = new Lettuce("LETTUCE");
        Component Gonion = new GOnion("G ONION");
        Component jalagrilled = new JalaGrilled("JALA GRILLED");

        System.out.println("Customer Receipt");
        System.out.println("LBB \t \t \t \t 5.59");
        obj.addChild(bacon);
        obj.addChild(lettuce);
        obj.addChild(tomato);
        obj.addChild(Gonion);
        obj.addChild(jalagrilled);
        String customerreceipt = obj.printItemDescription();
        System.out.println(customerreceipt);
        System.out.println("LTL CAJ \t \t \t 2.79");
        System.out.println("Sub Total: \t \t \t 8.38\n");

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
    }



}
