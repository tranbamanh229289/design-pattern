package behavioral.chainOfResponsibility;

public class Director extends Approver {
    @Override
    public boolean isApprover(int numberDay) {
        return numberDay > 5;
    }

    @Override
    public void doApprover(LeaveRequest request) {
        System.out.println("Leave request approved " + request.getNumberDay() + " days by Director" );
    }
}
