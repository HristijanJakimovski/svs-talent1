import java.util.concurrent.TimeUnit;

import com.acme.adapters.AcmeHeaterAdapter;
import com.acme.adapters.AcmeThermometerAdapter;
import com.acme.thermoregulator.EfficientThermoregulator;
import com.acme.thermoregulator.StandardThermoregulator;
import com.ventoelectrics.heater.Heater;
import com.ventoelectrics.powerswitch.PowerSwitch;
import com.ventoelectrics.thermometer.Thermometer;
import com.ventoelectrics.thermoregulator.Thermoregulator;


import WaterHeater.WaterHeater;

public class WaterHeaterApplication {

    public static void main(String[] args) throws Exception {
        PowerSwitch powerSwitch = new PowerSwitch();
        Heater heater = new Heater();
        Thermometer thermometer = new Thermometer();
        
        //standard thermoregulator
        Thermoregulator thermoregulator = new StandardThermoregulator(new AcmeHeaterAdapter(heater), new AcmeThermometerAdapter(thermometer)); // Standard or efficient thermoregulator.

        WaterHeater waterHeater = new WaterHeater(powerSwitch, heater, thermometer, thermoregulator);

        simulateRun(waterHeater);
        
        //efficient thermoregulator
        thermoregulator = new EfficientThermoregulator(new AcmeHeaterAdapter(heater), new AcmeThermometerAdapter(thermometer)); // Standard or efficient thermoregulator.

        waterHeater = new WaterHeater(powerSwitch, heater, thermometer, thermoregulator);

        simulateRun(waterHeater);
    }

    private static void simulateRun(WaterHeater waterHeater) {
        waterHeater.getThermoregulator().setTemperature(20);
        waterHeater.getPowerSwitch().turnOn();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
        }

        waterHeater.getThermoregulator().setTemperature(40);

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
        }

        waterHeater.getPowerSwitch().turnOff();
    }
}