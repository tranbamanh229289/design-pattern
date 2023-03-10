package behavioral.interepter;

public class Client {
    public static void main(String[] args) {
        Parent c = new Child();
        System.out.println(c.getClass());
        System.out.println(c instanceof Parent);
        System.out.println(c instanceof Child);
    }
}
