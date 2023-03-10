package creational.abstractMethod.strategy;

import java.util.List;

public interface SortStrategy {
    <T> void handleSort(List<T> ls);
}
