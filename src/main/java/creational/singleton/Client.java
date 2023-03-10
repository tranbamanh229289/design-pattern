package creational.singleton;

public class Client {
    public static void main(String[] args) {
        // Eager
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("Eager Initialization");
        System.out.println(eager1.getName());

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println(eager2.getName());

        // Lazy
        LazyInitialization lazy1 = LazyInitialization.getInstance();
        lazy1.setName("Lazy Initialization");
        System.out.println(lazy1.getName());

        LazyInitialization lazy2 = LazyInitialization.getInstance();
        System.out.println(lazy2.getName());
    }
}
