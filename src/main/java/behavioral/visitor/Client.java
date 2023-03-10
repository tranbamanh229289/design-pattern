package behavioral.visitor;

import java.awt.print.Book;

public class Client {
    public static void main(String[] args) {
        IBook programing = new ProgramingBook();
        IBook economic = new EconomicBook();
        Visitor visitor = new Visitor();
        programing.accept(visitor);
        economic.accept(visitor);
    }
}
