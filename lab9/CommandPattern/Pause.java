public final class Pause implements Command {

    private Screen sc;

    public Pause(Screen sc) {
        super();
        this.sc = sc;
    }

    @Override
    public void perform() {

        this.sc.pause();
    }

}