package com.dcgc.prueba.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	
	AviancaColHomePage homePage;
	
	@Step
	public void goHome()
	{
		homePage.open();
		
	}
	
	@Step
	public void clicReservaV()
	{
		homePage.selecOpcReserva();
	}
	
	
	@Step
	public void clicSoloIda()
	{
		homePage.selecSoloIda();
	}
	
	@Step
	public void selectOrigen() {
		
		homePage.selectOrigen();
	}
	
	@Step
	public void selectDestino() {
		
		homePage.selectDestino();
	}
	
	@Step
	public void selectFechaVuelo() {
		
		homePage.selectFechaVuelo();
	}
	
	@Step
	public void selectPasajero() {
		
		homePage.selectPasajero();
	}
	
	@Step
	public void buscarVuelo() {
		
		homePage.buscarVuelo();
		
	}
	

}
