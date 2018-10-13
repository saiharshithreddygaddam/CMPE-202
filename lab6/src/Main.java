public class Main {


    public static void main(String args[]){
        Burger burger = new Burger();

        Component tomato = new Tomato ("TOMATO");
        Component bacon = new Bacon("BACON");
        Component lettuce = new Lettuce("LETTUCE");
        Component Gonion = new GOnion("G ONION");
        Component jalagrilled = new JalaGrilled("JALA GRILLED");
        
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
        PackageSlip slip = new PackageSlip();
        slip.printItemDescription(burger2);

        
    }



}
