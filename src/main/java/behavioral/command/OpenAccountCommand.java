package behavioral.command;

public class OpenAccountCommand implements Command {
    private AccountReceiver accountReceiver;

    OpenAccountCommand(AccountReceiver accountReceiver){
        this.accountReceiver = accountReceiver;
    }
    @Override
    public void execute() {
        accountReceiver.open();
    }
}
