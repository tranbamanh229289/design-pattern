package behavioral.command;

public class CloseAccountCommand implements Command {
    private AccountReceiver accountReceiver;

    public CloseAccountCommand(AccountReceiver accountReceiver) {
        this.accountReceiver = accountReceiver;
    }

    @Override
    public void execute() {
        accountReceiver.close();
    }
}
