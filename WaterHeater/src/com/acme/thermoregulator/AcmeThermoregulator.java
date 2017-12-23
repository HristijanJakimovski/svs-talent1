package com.acme.thermoregulator;
import com.acme.adapters.AcmeHeaterAdapter;
import com.acme.adapters.AcmeThermometerAdapter;
import com.ventoelectrics.thermoregulator.Thermoregulator;

public abstract class AcmeThermoregulator implements Thermoregulator, Runnable {
	
	private AcmeHeaterAdapter heaterAdapter;
	private AcmeThermometerAdapter thermometerAdapter;
	private boolean enablePower=false;
	private Integer tempRegulation;
	private long waitTime;
	
	public AcmeThermoregulator (AcmeHeaterAdapter heaterAdapter, AcmeThermometerAdapter thermometerAdapter) {
		this.heaterAdapter=heaterAdapter;
		this.thermometerAdapter=thermometerAdapter;
	}
	
	public void run() {
		while(true) {
			if(!enablePower) {
				try {
					Thread.sleep(waitTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					int temp=thermometerAdapter.getTemperature();
					if(temp>tempRegulation) {
						disablePower();
					}
					else {
						enablePower();
					}
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		
	}

	@Override
	public void setTemperature(Integer temperature) {	
		this.tempRegulation=temperature;
	}
	
	@Override
	public void enablePower() {
		heaterAdapter.enableHeater();
	}

	@Override
	public void disablePower() {
		heaterAdapter.disableHeater();
	}
	
	public void setWaitTime(long waitTime) {
		this.waitTime = waitTime;
	}
}
