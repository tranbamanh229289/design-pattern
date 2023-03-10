package behavioral.visitor;

public class EconomicBook implements IBook{
    public void accept(Visitor v) {
        v.visit(this);
    }
    public void getBestRichCountries() {
        System.out.println("America");
    }
}
