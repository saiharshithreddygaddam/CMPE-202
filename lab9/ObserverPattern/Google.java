package ObserverPattern;

public class Google implements Observer{

    @Override
    public void notify(String news) {
        if (news != null && news.contains("Pixel")) {
            System.out.println("Review on Pixel: " + news);
        }
    }
}
