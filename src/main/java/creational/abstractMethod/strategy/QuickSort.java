package creational.abstractMethod.strategy;

import java.util.List;

public class QuickSort implements SortStrategy {
    @Override
    public <T> void handleSort(List<T> ls) {
        System.out.println("quick sort");
    }
}
