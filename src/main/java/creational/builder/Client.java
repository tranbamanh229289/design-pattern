package creational.builder;

public class Client {
    public static void main(String[] args) {
        House house = HouseBuilder.builder()
                .setBedrooms(4)
                .setBathrooms(2)
                .setColor("blue")
                .setIsPool(true)
                .build();
    }
}
