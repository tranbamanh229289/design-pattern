package behavioral.visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(ProgramingBook book) {
        book.getBestLanguagePrograming();
    }

    @Override
    public void visit(EconomicBook book) {
        book.getBestRichCountries();
    }
}
