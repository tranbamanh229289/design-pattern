package behavioral.observer;

import java.util.*;

public class Broker {
    private static Broker subject;

    private Broker(){

    }
    private Map<String, Set<User>> broker = new HashMap<>();

    public void subcribe(User user, String topic) {
        Set<User> consumers = new HashSet<>();
        if (broker.containsKey(topic)) {
            consumers = broker.get(topic);
        }
        consumers.add(user);
        broker.put(topic, consumers);
    }

    public void unSubcribe(User user, String topic) {
        Set<User> consumers = new HashSet<>();;
        if (broker.containsKey(topic)) {
            consumers = broker.get(topic);
            consumers.remove(user);
        }
        broker.put(topic, consumers);
    }

    public static Broker getInstance() {
        if(subject == null) {
            return new Broker();
        }
        return subject;
    }
    public void send(String topic, Message message) {
        Set<User> users = new HashSet<>();

        if (broker.containsKey(topic)) {
            users = broker.get(topic);
            for (User user : users) {
                user.receiveMessage(message);
            }
        }
    }
    public void receive(Message message) {
        System.out.println(message.toString());
    }
}
