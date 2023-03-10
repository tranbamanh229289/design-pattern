package creational.abstractMethod;

public class Client {
    public static void main(String[] args) {
        MidRangElectronicFactory midRangElectronicFactory = (MidRangElectronicFactory) ElectronicFactory.getElectronicFactory(PriceType.MIDRANGE);
        HighEndElectronicFactory highEndElectronicFactory = (HighEndElectronicFactory) ElectronicFactory.getElectronicFactory(PriceType.HIGHEND);

        MidRangLaptop midRangLaptop = midRangElectronicFactory.getLaptop();
        System.out.println(midRangLaptop.getNameLaptop());
        System.out.println("==========");

        MidRangPhone midRangPhone = midRangElectronicFactory.getPhone();
        System.out.println(midRangPhone.getNamePhone());
        System.out.println("==========");

        HighEndLaptop highEndLaptop = highEndElectronicFactory.getLaptop();
        System.out.println(highEndLaptop.getNameLaptop());
        System.out.println("==========");

        HighEndPhone highEndPhone = highEndElectronicFactory.getPhone();
        System.out.println(highEndPhone.getNamePhone());

    }
}
