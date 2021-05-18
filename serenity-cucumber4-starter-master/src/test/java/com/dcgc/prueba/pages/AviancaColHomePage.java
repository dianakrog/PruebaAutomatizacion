package com.dcgc.prueba.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.dcgc.prueba.utils.*;
import com.ibm.icu.util.Calendar;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class AviancaColHomePage extends PageObject{
	
	public void selecOpcReserva() {
		$(By.name("cookies-confirm")).click();
		$(By.id("reservatuvuelo")).click();
		$(By.cssSelector(".innertab:nth-child(2) > a")).click();

	}
	
	public void selecSoloIda() 
	{
		$(By.cssSelector(".innertab:nth-child(2) > a")).click();
	}
	
	public void selectOrigen()
	{
		//Selección del Origen
		SeleniumUtils.esperarAnimacionElemento();
		$(By.xpath("//*[contains(@name, 'pbOrigen_2')]")).click();
		$(By.xpath("//*[contains(@name, 'pbOrigen_2')]")).sendKeys("CLO");
		$(By.cssSelector(".form-group:nth-child(1) .name")).click();
	}
	
	public void selectDestino()
	{
		//Selección del Destino
		$(By.xpath("//*[contains(@id, 'pbDestino_2')]")).click();
		$(By.xpath("//*[contains(@id, 'pbDestino_2')]")).sendKeys("BOG");
		$(By.cssSelector(".form-group:nth-child(2) .name")).click();
	}
	
	
	public void selectFechaVuelo()
	{
		Calendar fecha = Calendar.getInstance();
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		String diaS = String.valueOf(dia);
		
		//Selección de fecha de salida
		$(By.xpath("//div[2]/fieldset/div/div/div/label/div/input")).click();
		SeleniumUtils.esperarAnimacionElemento();
		WebElement dateWidget = $(By.cssSelector(".calendar-container.hidden-xs.right.new-calendar-pos.calendar-home"));
		List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
		SeleniumUtils.esperarAnimacionElemento();
		SeleniumUtils.esperarAnimacionElemento();
		for (WebElement element : columns) {
			if (element.getText().equals(diaS))
            {
				element.click();
				break;
            }
        }
	}
	
	
	public void selectPasajero(){
		
		SeleniumUtils.esperarAnimacionElemento();
		SeleniumUtils.esperarAnimacionElemento();
		//Seleccion de pasajeros		
		$(By.xpath("//*[contains(@id, 'pbPasajeros_2')]")).click();
		$(By.cssSelector(".float > .adults .plus > .material-icons")).click();
		$(By.cssSelector(".float > .controls:nth-child(5) .plus > .material-icons")).click();
		$(By.cssSelector(".float > .controls:nth-child(6) .plus > .material-icons")).click();
		$(By.cssSelector(".float > .btn")).click();

	}
	
	public void buscarVuelo() {
		//Busqueda de vuelo con las anteriores condiciones
		SeleniumUtils.esperarAnimacionElemento();	
		waitForRenderedElementsToBePresent(By.cssSelector(".btn.primary.btn-codepromo.pull-btn.rojo"));
		//WebElement elementHovered = $(By.cssSelector(".btn.primary.btn-codepromo.pull-btn.rojo"));
		//Actions builder = new Actions(getDriver());
		//builder.moveToElement(elementHovered).build().perform();
		$(By.cssSelector(".col-xs-12.text-right.col-sm-4.col-md-6.especial-padding-3.noPadl.boton-container > button")).click();
		SeleniumUtils.esperarAnimacionElemento();

	}
		

}
