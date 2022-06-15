package observer_pattern.serverside;

import java.io.IOException;

public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String message) throws IOException;
    void notifyObserver();
}