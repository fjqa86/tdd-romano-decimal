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
	
	//Caso para el 2 y 3 equivalente a II y III
	@Test
	public void twoRoman() {
		String numeroPrueba = "2";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("II", resultado);	
	}
	
	@Test
	public void threeRoman() {
		String numeroPrueba = "3";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("III", resultado);	
	}
	
	// caso para 4 equivalente IV
	@Test
	public void fourRoman() {
		String numeroPrueba = "4";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("IV", resultado);	
	}
	
	// caso para 5 equivalente V
	@Test
	public void fiveRoman() {
		String numeroPrueba = "5";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("V", resultado);	
	}
	
	// caso para 6 a 8 equivalente VI
	@Test
	public void sixRoman() {
		String numeroPrueba = "6";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("VI", resultado);	
	}
	@Test
	public void eigthRoman() {
		String numeroPrueba = "8";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("VIII", resultado);	
	}

}
