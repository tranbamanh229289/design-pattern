package creational.factoryMethod;

public class Client {
    public static void main(String[] args) {
        HardCandy hardCandy = (HardCandy) CandyFactory.getInstance(CandyType.HARD);
        MintyCandy mintyCandy = (MintyCandy) CandyFactory.getInstance(CandyType.MINTY);

        System.out.println(hardCandy.getCandyName());
        System.out.println(mintyCandy.getCandyName());
    }
}
