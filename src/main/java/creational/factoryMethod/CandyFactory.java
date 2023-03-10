package creational.factoryMethod;

public class CandyFactory {
    public static Candy getInstance(CandyType type){
        switch (type) {
            case HARD:
                return new HardCandy();
            case MINTY:
                return new MintyCandy();
            default: return null;
        }
    }
}
