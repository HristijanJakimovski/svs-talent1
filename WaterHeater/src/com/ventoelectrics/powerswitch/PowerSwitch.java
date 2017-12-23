package com.ventoelectrics.powerswitch;

import java.util.ArrayList;

public class PowerSwitch {
	
	private ArrayList<PoweredDevice> poweredDevices= new ArrayList<PoweredDevice>();
	
	public void controlPowerFor(PoweredDevice powerDevice) {
			poweredDevices.add(powerDevice);
	}
	
	public void turnOn() {
		for(PoweredDevice device: poweredDevices) {
			device.enablePower();
		}
	}
	
	public void turnOff() {
		for(PoweredDevice device:poweredDevices) {
			device.disablePower();
		}
	}

}
