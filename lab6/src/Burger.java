public class Burger extends Composite {



    @Override
    public String printItemDescription() {


        for (Component obj  : components)
        {
            printDesc +=  obj.printItemDescription();
        }
        return printDesc;
    }
}
