package LambdaObserver;
public class Client {

    public static void main(String[] args) {
        TechNews tn = new TechNews();
        tn.registerObserver((String news) -> {
            if (news != null && news.contains("Lumia")) {
                System.out.println("Lumia still exists: " + news);
            }
        });
        tn.registerObserver((String news) -> {
            if (news != null && news.contains("iPhone")) {
                System.out.println("About iPhone: " + news);
            }
        });
        tn.registerObserver((String news) -> {
            if (news != null && news.contains("Pixel")) {
                System.out.println("Review on Pixel: " + news);
            }
        });
        tn.notifyObservers("The new Pixel 3 camera is top notch. The new night sight feature takes amazing low light pictures.");
    }
}