public class CreditCardNumDecorator implements ICardDecorator {
    @Override
    public String getDecorated(String s) {
        String num = "";
        for(int i=0;i<s.length();i++){
            if(i==4 || i ==8 || i==12)
                num += " "+s.charAt(i);
            else
                num += s.charAt(i);
        }
        return num;
    }
}
