package structural.adapter;

public class BussinessAnalystAdapter implements Customer {
    private Developer dev;

    BussinessAnalystAdapter(Developer dev){
        this.dev = dev;
    }

    @Override
    public void sendRequest(String request) {
        System.out.println("Sending request ... : " + request);
        String info = this.translateRequest(request);
        System.out.println("Receiving info ... : " + info);
        dev.receiveInfo(info);
    }

    public String translateRequest(String request) {
        System.out.println("Translating request ... : " + request);
        System.out.println("Translated request success !");
        return "Create new feature";
    }
}
