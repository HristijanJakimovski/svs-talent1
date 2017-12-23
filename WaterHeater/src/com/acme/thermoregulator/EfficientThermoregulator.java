package com.acme.thermoregulator;

import com.acme.adapters.AcmeHeaterAdapter;
import com.acme.adapters.AcmeThermometerAdapter;

public class EfficientThermoregulator extends AcmeThermoregulator {
	
	public EfficientThermoregulator (AcmeHeaterAdapter heaterAdapter, AcmeThermometerAdapter thermometerAdapter) {
		super(heaterAdapter, thermometerAdapter);
		setWaitTime(1000);
	}
}
