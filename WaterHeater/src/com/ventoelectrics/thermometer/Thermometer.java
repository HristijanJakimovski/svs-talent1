package com.ventoelectrics.thermometer;

import java.util.Random;

import com.ventoelectrics.powerswitch.PoweredDevice;

public class Thermometer implements PoweredDevice {
	
	private boolean powerEnabled=false;
	
	private Random random=new Random(System.currentTimeMillis());
	
	public Integer getTemperature() {
		return random.nextInt(60);
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
