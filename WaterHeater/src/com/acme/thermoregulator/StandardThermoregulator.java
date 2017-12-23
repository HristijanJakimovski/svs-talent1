package com.acme.thermoregulator;

import com.acme.adapters.AcmeHeaterAdapter;
import com.acme.adapters.AcmeThermometerAdapter;

public class StandardThermoregulator extends AcmeThermoregulator {
	
	public StandardThermoregulator (AcmeHeaterAdapter heaterAdapter, AcmeThermometerAdapter thermometerAdapter) {
		super(heaterAdapter, thermometerAdapter);
		setWaitTime(3000);
	}

}