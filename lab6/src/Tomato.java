public class Tomato implements Component {
    public String s ;
    public Tomato(String name){

        s = "\t "+name + "\n";
    }

    @Override
    public void addChild(Component c) {
        // Do nothing
    }

    @Override
    public void removeChild(Component c) {

    }

    @Override
    public String printItemDescription() {

        return s;
    }
}
