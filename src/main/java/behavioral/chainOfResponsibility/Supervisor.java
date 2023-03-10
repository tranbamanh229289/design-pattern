package behavioral.chainOfResponsibility;

public class Supervisor extends Approver {
    @Override
    public boolean isApprover(int numberDay) {
        return numberDay <= 3;
    }

    @Override
    public void doApprover(LeaveRequest request) {
        System.out.println("Leave request approved " + request.getNumberDay() + " days by Supervisor" );
    }
}
