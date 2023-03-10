package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ItemIterator implements Iterator<Item> {
    private List<Item> ls = new ArrayList<>();
    private int currentIndex;
    @Override
    public boolean hasNext() {
        return this.currentIndex < ls.size();
    }

    @Override
    public Item next() {
        return ls.get(this.currentIndex ++);
    }

    public List<Item> getList() {
        return this.ls;
    }

    public void addItem(Item item) {
        this.ls.add(item);
    }
}
