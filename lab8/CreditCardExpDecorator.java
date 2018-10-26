public class CreditCardExpDecorator implements ICardDecorator {
    @Override
    public String getDecorated(String s) {
        String exp = "";
        for(int i=0; i<s.length();i++){
            if(i==2)
                exp += "/" +s.charAt(i);
            else
                exp += s.charAt(i);
        }
        return exp;
    }
}
