package creational.abstractMethod.strategy;

import java.util.List;

public class MergeSort implements SortStrategy {
    @Override
    public <T> void handleSort(List<T> ls) {
        System.out.println("merge sort");
    }
}
