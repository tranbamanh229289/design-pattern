package behavioral.command;

public class AccountReceiver {
    private String name;

    AccountReceiver(String name){
        this.name = name;
    }
    public void open() {
        System.out.println("handle open account" + name);
    }

    public void close() {
        System.out.println("handle close account" + name);
    }
}
