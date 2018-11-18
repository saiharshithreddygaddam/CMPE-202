public final class Play implements Command {

    private Screen sc;

    public Play(Screen sc) {
        super();
        this.sc = sc;
    }

    @Override
    public void perform() {

        this.sc.play();
    }

}