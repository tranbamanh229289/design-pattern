package behavioral.observer;

public class User implements Observer {
    private String name;
    private String phoneNumber;

    private static Broker subject = Broker.getInstance();

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass().equals(this.getClass())) {
            return false;
        }
        User user = (User) obj;
        return user.getName().equals(this.getName());
    }

    @Override
    public void sendMessage(String topic, String content) {
        this.subject.send(topic, new Message(this.getName(), content));
    }

    @Override
    public void receiveMessage(Message message) {
        this.subject.receive(message);
    }

    public void subcribeTopic(String topic) {
        this.subject.subcribe(this, topic);
    }

    public void unSubcribeTopic(String topic) {
        this.subject.unSubcribe(this, topic);
    }

}
