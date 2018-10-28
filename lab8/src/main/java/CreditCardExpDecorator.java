public class CreditCardExpDecorator implements ICardDecorator {
    @Override
    public String getDecorated(String exp) {
        int len = exp.length();

        if(len >= 3)
        {
            StringBuffer buf = new StringBuffer();
            buf.append(exp.substring(0,2));
            buf.append("/");
            buf.append(exp.substring(2));

            exp = buf.toString();
        }

        return exp;
    }
}
