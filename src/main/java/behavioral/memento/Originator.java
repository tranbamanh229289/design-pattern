package behavioral.memento;

public class Originator {
   private double x;
   private double y;

    public Originator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Memento save() {
        return new Memento(x, y);
    }

    public void undo(Memento memento) {
        this.setX(memento.getX());
        this.setY(memento.getY());
    }

    @Override
    public String toString() {
        return "X: "+ this.getX() + "; Y: " + this.getY() ;
    }
}
