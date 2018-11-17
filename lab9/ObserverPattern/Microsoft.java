package ObserverPattern;

public class Microsoft implements Observer {

    @Override
    public void notify(String news) {
        if (news != null && news.contains("Lumia")) {
            System.out.println("Lumia still exists: " + news);
        }
    }
}
