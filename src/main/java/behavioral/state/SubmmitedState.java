package behavioral.state;

public class SubmmitedState implements State {
    @Override
    public void handleState() {
        System.out.println("Submmited state");
    }
}
