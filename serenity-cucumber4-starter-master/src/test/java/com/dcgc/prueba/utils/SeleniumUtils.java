package com.dcgc.prueba.utils;

public class SeleniumUtils {
	
	public static void esperarAnimacionElemento() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
