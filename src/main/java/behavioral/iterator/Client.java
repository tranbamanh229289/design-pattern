package behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        ItemIterator iterator = new ItemIterator();
        iterator.addItem(new Item("Manh", 23));
        iterator.addItem(new Item("Ha Anh", 19));
        iterator.addItem(new Item("Thu Hien", 21));

        while(iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item);
        }

    }

}
