package LambdaObserver;
public interface Subject {
    void registerObserver(Observer o);

    void notifyObservers(String news);
}