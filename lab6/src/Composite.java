import java.util.ArrayList;

public class Composite implements Component{
    protected  String printDesc="";
    protected ArrayList<Component> components = new ArrayList<Component>();

    //public Composite ( String d )
    //{
    //    description = d ;
   // }

    public String printItemDescription() {
        //String printDesc = "\n" + description;
        for (Component obj  : components)
        {
            printDesc += " " + obj.printItemDescription() + "\n";
        }
        return printDesc;
    }

    public void addChild(Component c){
        components.add(c);
    }

    public void removeChild(Component c){
        components.remove(c);
    }



} 