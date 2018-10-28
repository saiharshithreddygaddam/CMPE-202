/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.HashSet;

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count=0;




    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        num.addDecorator(new CreditCardNumDecorator());
        exp = new CreditCardExp();
        exp.addDecorator(new CreditCardExpDecorator());
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;


    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {

        if(ch.length() == 1) {
            if (ch.equals("X") && count > 0) {
                count--;
                System.err.println(count);
                screen.key(ch, count + 1);
            } else if (!ch.equals("X") && count < 23) {
                count++;
                System.err.println(count);
                screen.key(ch, count);
            }
        }
    }


}

