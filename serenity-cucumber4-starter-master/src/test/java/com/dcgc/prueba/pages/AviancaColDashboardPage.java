package com.dcgc.prueba.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class AviancaColDashboardPage extends PageObject{
	
	public void tarifaVerify() {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//Validación de elemento de salida
		getDriver().findElement(By.cssSelector("calendar-container-heading")).getText().contains("Selecciona tu vuelo de ida");
		
	}
	

}
