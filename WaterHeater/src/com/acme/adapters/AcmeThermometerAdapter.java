package com.acme.adapters;

import com.ventoelectrics.thermometer.Thermometer;

public class AcmeThermometerAdapter {
	
	private Thermometer thermometer;

	public AcmeThermometerAdapter(Thermometer thermometer) {
		this.thermometer=thermometer;
		
	}

	public Integer getTemperature() {
		return thermometer.getTemperature();
	}

}