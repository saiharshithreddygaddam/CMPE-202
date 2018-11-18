public final class Client {

	public static void main(final String[] args) {
		Macro macro = new Macro();
		Screen so = new MusicPlayer();
		Command openCommand = new Play(so);
		Command saveCommand = new Pause(so);

		macro.record(openCommand);
		macro.record(saveCommand);

		macro.run();
	}

}