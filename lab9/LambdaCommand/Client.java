public final class Client {

	public static void main(final String[] args) {
		Macro macro = new Macro();
		Screen so = new MusicPlayer();


		// 1st way
		macro.record(() -> so.play());
		macro.record(() -> so.pause());



		macro.record(so::play);
		macro.record(so::pause);

		macro.run(); // 2nd way
	}

}