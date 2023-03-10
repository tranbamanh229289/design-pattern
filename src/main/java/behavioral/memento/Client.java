package behavioral.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator(3,4);
        CareTaker careTaker = new CareTaker();
        careTaker.saveMemeto(originator.save(), "#STATE1");
        originator.setX(10);
        originator.setY(20);
        System.out.println(originator);
        originator.undo(careTaker.getMemeto("#STATE1"));
        System.out.println(originator);

    }
}
