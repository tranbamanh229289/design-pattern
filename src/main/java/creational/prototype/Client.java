package creational.prototype;

public class Client {
    public static void main(String[] args) {
        User user1 = new User("Tran Ba Manh", 23);
        User user2 = user1.clone();
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user1 == user2);
    }
}
