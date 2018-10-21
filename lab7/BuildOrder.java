

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite("Order");
        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;

        Burger burger = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        burger.setOptions( bo ) ;


        Cheese cheese = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        cheese.setOptions( co ) ;
        cheese.wrapDecorator( burger ) ;

        PremiumCheese Pcheese = new PremiumCheese( "PremiumCheese Options" ) ;
        String[] pco = { "Danish Blue Cheese" } ;
        Pcheese.setOptions( pco ) ;
        Pcheese.wrapDecorator( cheese) ;

        Sauce sauce = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise" , "Thai Peanut Sauce"} ;
        sauce.setOptions( so ) ;
        sauce.wrapDecorator( Pcheese ) ;

        Toppings toppings = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickle"} ;
        toppings.setOptions( to ) ;
        toppings.wrapDecorator( sauce ) ;


        Premium premium = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        premium.setOptions( po ) ;
        premium.wrapDecorator( toppings ) ;


        Bun bn = new Bun("Bun Options");
        String[] bns = { "Ciabatta (Vegan)"} ;
        bn.setOptions( bns ) ;
        bn.wrapDecorator( premium ) ;





        Side side = new Side("Side Options");
        String[] s_side =  { "Shoesstring Fries"} ;
        side.setOptions( s_side ) ;
        side.wrapDecorator( bn ) ;


        customBurger1.setDecorator( side ) ;
        customBurger1.addChild( burger ) ;//burger
        customBurger1.addChild( cheese ) ;//cheese
        customBurger1.addChild( Pcheese ) ;//preminum cheese
        customBurger1.addChild( sauce ) ;//sause
        customBurger1.addChild( toppings ) ;//topping
        customBurger1.addChild( premium ) ;//Pcheese
        customBurger1.addChild( bn ) ;//bun
        customBurger1.addChild( side ) ;//side


        order.addChild( customBurger1 );



        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;


        Burger burger2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Harmone and Antibiotic free beef", "1/3lb.", "On A Bun" } ;
        burger2.setOptions( bo2 ) ;


        Cheese cheese2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        cheese2.setOptions( co2 ) ;
        cheese2.wrapDecorator( burger2 ) ;


        Toppings toppings2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanut"} ;
        toppings2.setOptions( to2 ) ;
        toppings2.wrapDecorator( cheese2 ) ;

        Premium premium2 = new Premium( "Premium Options" ) ;
        String[] po2 = {"Sunny Side up Egg", "Marinated Tomatoes", } ;
        premium2.setOptions( po2 ) ;
        premium2.wrapDecorator( toppings2 ) ;




        PremiumCheese Pcheese2 = new PremiumCheese( "PremiumCheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella" } ;
        Pcheese2.setOptions( pco ) ;
        Pcheese2.wrapDecorator( premium2) ;



        Sauce sauce2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" , } ;
        sauce2.setOptions( so2 ) ;
        sauce2.wrapDecorator( Pcheese2 ) ;


        Bun bn2 = new Bun("Bun Options");
        String[] bns2 = { "Gluten-Free Bun"} ;
        bn2.setOptions( bns2 ) ;
        bn2.wrapDecorator( sauce2 ) ;


        Side side2 = new Side("Side Options");
        String[] side_s = { "Shoesstring Fries"} ;
        side2.setOptions( side_s ) ;
        side2.wrapDecorator( bn2) ;

        customBurger2.setDecorator( side2 ) ;

        customBurger2.addChild( burger2 ) ;
        customBurger2.addChild( cheese2 ) ;
        customBurger2.addChild( premium2 ) ;
        customBurger2.addChild( sauce2 ) ;
        customBurger2.addChild( toppings2 ) ;
        customBurger2.addChild( Pcheese2 ) ;
        customBurger2.addChild( bn2 ) ;
        customBurger2.addChild( side2 ) ;


        order.addChild( customBurger2 );

        return order ;
    }

}