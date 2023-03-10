package behavioral.state;

public class RejectedState implements State {
    @Override
    public void handleState() {
        System.out.println("Rejected state");
    }
}
