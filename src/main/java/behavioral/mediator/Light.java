package behavioral.mediator;

public class Light {
    private String color;
    private StateLight currentState;
    private LightMediator lightMediator;

    public Light(String color, LightMediator lightMediator) {
        this.color = color;
        this.currentState = StateLight.OFF;
        this.lightMediator = lightMediator;
        lightMediator.registerLight(this);
    }

    public void turnOn() {
        System.out.println("turn on " + this.color + " light");
        this.currentState = StateLight.ON;
        lightMediator.notifyLight(this);
    }

    public void turnOff() {
        System.out.println("turn off " + this.color + " light");
        this.currentState = StateLight.OFF;
    }

    public String getColor() {
        return color;
    }

    public StateLight getCurrentState() {
        return currentState;
    }


    @Override
    public boolean equals(Object obj) {
        if ((obj == null) && (this.getClass() != obj.getClass())) {
            return false;
        }
        Light light = (Light) obj;
        return this.getColor().equals(light.getColor());
    }
}
