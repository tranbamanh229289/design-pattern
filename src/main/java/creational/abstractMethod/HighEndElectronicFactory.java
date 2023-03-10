package creational.abstractMethod;

public class HighEndElectronicFactory extends ElectronicAbstractFactory {
    @Override
    public HighEndLaptop getLaptop() {
        return new HighEndLaptop();
    }

    @Override
    public HighEndPhone getPhone() {
        return new HighEndPhone();
    }
}
