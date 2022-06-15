package observer_pattern.serverside;

import java.io.IOException;

public interface IObserver {
    void update(String msg) throws Exception;
}
