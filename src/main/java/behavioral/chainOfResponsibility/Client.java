package behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        ChainApproverProvider.makeChainApproverProvider().approverLeave(new LeaveRequest(2));
        System.out.println("-----");

        ChainApproverProvider.makeChainApproverProvider().approverLeave(new LeaveRequest(5));
        System.out.println("-----");

        ChainApproverProvider.makeChainApproverProvider().approverLeave(new LeaveRequest(6));
        System.out.println("-----");
    }
}
