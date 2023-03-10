package creational.abstractMethod;

public class ElectronicFactory {
    public static ElectronicAbstractFactory getElectronicFactory(PriceType type) {
        switch (type) {
            case MIDRANGE:
                return new MidRangElectronicFactory();
            case HIGHEND:
                return new HighEndElectronicFactory();
            default: return null;
        }
    }
}
