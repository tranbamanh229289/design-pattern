package behavioral.state;

public class NewState implements State {
    @Override
    public void handleState() {
        System.out.println("New State");
    }
}
