package structural.adapter;

public class Client {
    public static void main(String[] args) {
        Developer dev = new Developer();
        BussinessAnalystAdapter ba = new BussinessAnalystAdapter(dev);
        ba.sendRequest("I need new feature");
    }
}
