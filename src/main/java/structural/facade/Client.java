package structural.facade;

public class Client {
    public static void main(String[] args) {
        FunitureFacade funitureFacade = FunitureFacade.getInstance();
        funitureFacade.makeChairAndTable();
        System.out.println("=============");
        funitureFacade.makeTableAndTelevision();
        System.out.println("=============");
        funitureFacade.makeTelevisionAndChair();
    }
}
