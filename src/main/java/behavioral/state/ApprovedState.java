package behavioral.state;

public class ApprovedState implements State {
    @Override
    public void handleState() {
        System.out.println("Approved state");
    }
}
