package behavioral.mediator;

import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        LightMediator lightMediator = new LightMediator();
        Light redLight = new Light("red", lightMediator);
        Light yellowLight = new Light("yellow", lightMediator);
        Light greenLight = new Light("green", lightMediator);

        Light[] lights = {redLight, yellowLight, greenLight};
        Light currentLight;
        int indexLight = 0;
        while(true) {
            if(indexLight >= lights.length) {
                indexLight = 0;
            }
            currentLight = lights[indexLight];
            currentLight.turnOn();
            timer();
            indexLight ++;
        }
    }

    public static void timer() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
