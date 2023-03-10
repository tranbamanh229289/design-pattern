package behavioral.chainOfResponsibility;

public class ChainApproverProvider {
    public static Approver makeChainApproverProvider() {
        Supervisor supervisor = new Supervisor();
        DeliveryManager deliveryManager = new DeliveryManager();
        Director director = new Director();
        supervisor.setNextApprover(deliveryManager);
        deliveryManager.setNextApprover(director);
        return supervisor;
    }
}
