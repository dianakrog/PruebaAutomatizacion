package com.dcgc.prueba.pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {
	
	AviancaColDashboardPage dashboard;
	
	@Step("Verificar información de tarifa")
	public void verifyTarifa() {
		
		dashboard.tarifaVerify();
		
	}

}
