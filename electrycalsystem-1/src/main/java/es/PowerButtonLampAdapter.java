package es;
import es.Lamp.Lamp;
import es.powerbutton.PoweredDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Lamp")
public class PowerButtonLampAdapter implements PoweredDevice {

    private Lamp lamp;

    @Autowired
    public PowerButtonLampAdapter(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void enable() {
        lamp.turnOn();
    }

    @Override
    public void disable() {
        lamp.turnOff();
    }
}