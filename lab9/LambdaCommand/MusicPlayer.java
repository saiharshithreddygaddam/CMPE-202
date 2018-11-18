import java.util.List;
import java.util.ArrayList;

public final class MusicPlayer implements Screen {



    @Override
    public void close() {
        System.out.println("Closing the music player");
    }

    @Override
    public void play() {
        System.out.println("Playing song");

    }

    @Override
    public void pause() {
        System.out.println("Song is paused");
    }
}