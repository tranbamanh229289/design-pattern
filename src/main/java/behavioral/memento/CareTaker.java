package behavioral.memento;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CareTaker {
    private Map<String, Memento> states = new HashMap<>();
    public void saveMemeto(Memento memento, String key){
        states.put(key, memento);
    }
    public Memento getMemeto(String key) {
        return states.get(key);
    }
}
