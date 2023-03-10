package creational.abstractMethod;

public class MidRangElectronicFactory extends ElectronicAbstractFactory {
    @Override
    public MidRangLaptop getLaptop() {
        return new MidRangLaptop();
    }

    @Override
    public MidRangPhone getPhone() {
        return new MidRangPhone();
    }
}
