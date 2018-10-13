public class GOnion implements Component {
    String s;
    public GOnion (String name){
        s = "\t ->|"+name + "\n";

    }

    @Override
    public void addChild(Component c) {

    }

    @Override
    public void removeChild(Component c) {

    }

    @Override
    public String printItemDescription() {
        return s;
    }
}
