package creational.singleton;

public class ThreadSage {
    //volatile đọc dữ liệu từ main memory thay vì cache CPU
    private static volatile ThreadSage instance;

    private ThreadSage() {};

    public static synchronized ThreadSage getInstance(){
        if(instance == null) {
            instance = new ThreadSage();
        }
        return instance;
    }
}
