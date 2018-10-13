import java.util.ArrayList;

public class Composite implements Component{
    protected  String name="";
    protected ArrayList<Component> components = new ArrayList<Component>();


    public String printItemDescription(){
        for(Component c: components )
            name += c.printItemDescription();
        return name;
    }

    public void addChild(Component c){
        components.add(c);
    }

    public void removeChild(Component c){
        components.remove(c);
    }



} 