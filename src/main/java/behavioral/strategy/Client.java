package behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        SortList list = new SortList();
        list.add("Java");
        list.add("Python");
        list.add("Typescript");
        list.add("Golang");
        list.setStrategy(new QuickSort());
        list.sort();
    }
}
