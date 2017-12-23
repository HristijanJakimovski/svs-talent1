package com.ventoelectrics.heater;

import com.ventoelectrics.powerswitch.PoweredDevice;

public class Heater implements PoweredDevice {
	
	private boolean powerEnabled=false;
	
	
	public void startHeating() {
		System.out.println("Heater.startHeating()");
	}
	
	public void stopHeating() {
		System.out.println("Heater.stopHeating()");
	}

	@Override
	public void enablePower() {
		powerEnabled=true;
		
	}

	@Override
	public void disablePower() {
		powerEnabled=false;
		
	}

}
