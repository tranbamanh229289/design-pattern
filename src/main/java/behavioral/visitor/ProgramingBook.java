package behavioral.visitor;

public class ProgramingBook implements IBook{
    public void accept(Visitor v) {
        v.visit(this);
    }
    public void getBestLanguagePrograming() {
        System.out.println("Java");
    }
}
