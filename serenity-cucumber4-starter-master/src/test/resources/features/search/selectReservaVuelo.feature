#Author: dianakrog
#Feature: flight reservation
#Scenario: Reserva de vuelo solo ida para adulto, niñi y bebe

@tag
Feature: Flight reservation

  @tag1
  Scenario: flight reservation, one way for adults, one child and one baby
    Given into to the webside Avianca espanol
	  When into to the section Reserva tu vuelo
    And select option Solo ida
    And Select Desde CLO
    And Select Hacia BOG
    And select fecha ¿cuando viaja? actual day
    And into to the ¿como viaja? two adults, one child, one baby
    And click in Buscar vuelo
    Then show me section tarifa