package com.acme.adapters;

import com.ventoelectrics.heater.Heater;

public class AcmeHeaterAdapter {
	
	private Heater heater;

	public AcmeHeaterAdapter(Heater heater) {
		this.heater=heater;
		
	}

	public void enableHeater() {	
		heater.startHeating();
	}

	public void disableHeater() {
		heater.stopHeating();
	}

}
