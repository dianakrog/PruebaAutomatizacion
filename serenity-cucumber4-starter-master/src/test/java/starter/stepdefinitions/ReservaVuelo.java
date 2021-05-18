package starter.stepdefinitions;

import com.dcgc.prueba.pages.Dashboard;
import com.dcgc.prueba.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;

public class ReservaVuelo {

	
	@Steps
	HomePage Home;
	
	@Steps
	Dashboard dash;
	
	@Given("into to the webside Avianca espanol")
	public void into_to_the_webside_avianca_espanol() 
	{
		Home.goHome();

	}

	@When("into to the section Reserva tu vuelo")
	public void into_to_the_section_reserva_tu_vuelo() 
	{
		Home.clicReservaV();
	}

	@When("select option Solo ida")
	public void select_option_solo_ida() 
	{
		Home.clicSoloIda();
	}

	@When("Select Desde CLO")
	public void select_desde_clo() 
	{
		Home.selectOrigen();
	}

	@When("Select Hacia BOG")
	public void select_hacia_bog() 
	{
		Home.selectDestino();
	}

	@When("select fecha ¿cuando viaja? actual day")
	public void select_fecha_cuando_viaja_actual_day() 
	{
		Home.selectFechaVuelo();
	}

	@When("into to the ¿como viaja? two adults, one child, one baby")
	public void into_to_the_como_viaja_two_adults_one_child_one_baby() {
	   
		Home.selectPasajero();
	}

	@When("click in Buscar vuelo")
	public void click_in_buscar_vuelo() 
	{
		Home.buscarVuelo();	    
	}

	@Then("show me section tarifa")
	public void show_me_section_tarifa() {
		
		dash.verifyTarifa();
	    
	}


}
