package LambdaObserver;

import java.util.ArrayList;
import java.util.List;

public class TechNews implements Subject {
    private final List< Observer > observers = new ArrayList< >();
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }
    public void notifyObservers(String news) {
        observers.forEach(o -> o.notify(news));
    }
}