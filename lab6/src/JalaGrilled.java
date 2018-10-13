public class JalaGrilled implements Component{
    String s;
    public JalaGrilled(String name){
        s = "\t ->|"+ name + "\n";
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
