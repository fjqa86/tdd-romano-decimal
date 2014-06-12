package co.edu.udea.appempresariales.romano;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class RomanoDecimalTest {

	@Before
	public void setUp() throws Exception {
	}

	//Caso para el 1 equivalente a I
	@Test
	public void oneRoman() {
		String numeroPrueba = "1";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("I", resultado);	
	}

}
