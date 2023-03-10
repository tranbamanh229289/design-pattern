package behavioral.mediator;

import java.util.HashSet;
import java.util.Set;

public class LightMediator {
    private Set<Light> lightSet = new HashSet<>();

    public void registerLight(Light light) {
        this.lightSet.add(light);
    }

    public void unRegisterLight(Light light) {
        this.lightSet.remove(light);
    }
    public void notifyLight(Light light) {
        if (light.getCurrentState() == StateLight.ON) {
           this.turnOffOtherLight(light);
        }
    }

    public void turnOffOtherLight(Light light) {
        for (Light lightItem : lightSet) {
            if(! light.equals(lightItem)){
                lightItem.turnOff();
            }
        }
    }
}
