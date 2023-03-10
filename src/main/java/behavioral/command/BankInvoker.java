package behavioral.command;

public class BankInvoker {
    private Command openAccountRequest;
    private Command closeAccountRequest;

    BankInvoker(Command openAccountRequest, Command closeAccountRequest){
        this.openAccountRequest = openAccountRequest;
        this.closeAccountRequest = closeAccountRequest;
    }

    public void clickOpenAccount(){
        this.openAccountRequest.execute();
    }
    public void clickCloseAccount(){
        this.closeAccountRequest.execute();
    }
}
