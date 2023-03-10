package behavioral.state;

public class Client {
    public static void main(String[] args) {
        DocumentContext documentContext = new DocumentContext();
        documentContext.setState(new NewState());
        documentContext.applyState();

        documentContext.setState(new SubmmitedState());
        documentContext.applyState();

        documentContext.setState(new RejectedState());
        documentContext.applyState();

        documentContext.setState(new ApprovedState());
        documentContext.applyState();
    }
}
