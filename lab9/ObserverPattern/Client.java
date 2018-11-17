package ObserverPattern;

public class Client {
    public static void main(String[] args) {
        TechNews f = new TechNews();
        f.registerObserver(new Microsoft());
        f.registerObserver(new Apple());
        f.registerObserver(new Google());
        f.notifyObservers("The new Pixel 3 camera is top notch. The new night sight feature takes amazing low light pictures.");
    }
}
