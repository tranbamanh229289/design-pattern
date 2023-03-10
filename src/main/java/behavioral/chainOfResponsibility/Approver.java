package behavioral.chainOfResponsibility;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover;
    }

    public void approverLeave(LeaveRequest request) {
        if(this.isApprover(request.getNumberDay())){
            this.doApprover(request);
        } else {
            if(nextApprover != null) {
                nextApprover.approverLeave(request);
            }
        }
    }
    public abstract boolean isApprover(int numberDay);
    public abstract void doApprover(LeaveRequest request);
}
