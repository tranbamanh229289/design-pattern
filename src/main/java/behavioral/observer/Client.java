package behavioral.observer;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        User a = new User("Manh Tran", "0123456789");
        User b = new User("Nguyen Anh", "0987654321");
        User c = new User("Antony", "086868686");

        a.subcribeTopic("mytopic");
        b.subcribeTopic("mytopic");
        c.subcribeTopic("mytopic");

        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            a.sendMessage("mytopic", s);
        }
    }
}
