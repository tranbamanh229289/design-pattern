package behavioral.iterator;

public class Item {
    private String name;
    private int age;

    public Item(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Item: [title= " + this.name + ", age= " + this.age + "]";
    }
}
