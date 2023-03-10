package creational.abstractMethod.strategy;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    private List<String> ls = new ArrayList<>();
    private SortStrategy strategy;

    public void add(String item) {
        ls.add(item);
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        this.strategy.handleSort(ls);
    }
}
