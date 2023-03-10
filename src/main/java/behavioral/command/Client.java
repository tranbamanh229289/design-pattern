package behavioral.command;

public class Client {
    public static void main(String[] args) {
        AccountReceiver accountReceiver = new AccountReceiver("Manh Tran");

        Command openAccountRequest = new OpenAccountCommand(accountReceiver);
        Command closeAccountRequest = new CloseAccountCommand(accountReceiver);

        BankInvoker invoker = new BankInvoker(openAccountRequest, closeAccountRequest);

        invoker.clickOpenAccount();
        invoker.clickCloseAccount();
    }
}
