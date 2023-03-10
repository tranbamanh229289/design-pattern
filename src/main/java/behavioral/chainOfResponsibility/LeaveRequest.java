package behavioral.chainOfResponsibility;

public class LeaveRequest {
    private int numberDay;

    LeaveRequest(int numberDay) {
        this.numberDay = numberDay;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }
}
