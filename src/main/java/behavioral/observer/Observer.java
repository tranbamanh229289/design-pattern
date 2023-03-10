package behavioral.observer;

public interface Observer {
    void sendMessage(String topic, String content);
    void receiveMessage(Message message);

    void subcribeTopic(String topic);

    void unSubcribeTopic(String topic);
}
