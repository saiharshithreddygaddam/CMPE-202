package ObserverPattern;

public class Apple implements Observer {

    @Override
    public void notify(String news) {
        if (news != null && news.contains("iPhone")) {
            System.out.println("About iPhone: " + news);
        }
    }
}