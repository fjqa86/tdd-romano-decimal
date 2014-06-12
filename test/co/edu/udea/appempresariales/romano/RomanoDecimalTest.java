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
	
	@Test
	public void nineRoman() {
		String numeroPrueba = "9";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("IX", resultado);	
	}
	
	@Test
	public void tenRoman() {
		String numeroPrueba = "10";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("X", resultado);	
	}
	
	@Test
	public void quinceRoman() {
		String numeroPrueba = "15";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("XV", resultado);	
	}
	
	@Test
	public void doceRoman() {
		String numeroPrueba = "12";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("XII", resultado);	
	}
	
	@Test
	public void dieciochoRoman() {
		String numeroPrueba = "18";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("XVIII", resultado);	
	}
	
	@Test
	public void diecinuevoRoman() {
		String numeroPrueba = "19";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("XIX", resultado);	
	}

	@Test
	public void veinteRoman() {
		String numeroPrueba = "20";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("XX", resultado);	
	}
	
	@Test
	public void veintiseisRoman() {
		String numeroPrueba = "26";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("XXVI", resultado);	
	}
	
	@Test
	public void treintaRoman() {
		String numeroPrueba = "30";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("XXX", resultado);	
	}
	
	@Test
	public void cuarentaytresRoman() {
		String numeroPrueba = "43";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("XLIII", resultado);	
	}
	
	@Test
	public void cincuentaRoman() {
		String numeroPrueba = "50";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("L", resultado);	
	}
	
	@Test
	public void ochentaytresRoman() {
		String numeroPrueba = "83";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("LXXXIII", resultado);	
	}
	
	@Test
	public void cienRoman() {
		String numeroPrueba = "100";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("C", resultado);	
	}
	
	@Test
	public void quinientosRoman() {
		String numeroPrueba = "501";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("DI", resultado);	
	}
	
	@Test
	public void novecientosTreintaTresRoman() {
		String numeroPrueba = "936";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("CMXXXVI", resultado);	
	}
	
	@Test
	public void tresMilRoman() {
		String numeroPrueba = "3000";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("MMM", resultado);	
	}
	
	@Test
	public void finalRoman() {
		String numeroPrueba = "3998";
		RomanoDecimal romano = new RomanoDecimal();
		String resultado = romano.convertirDecimal(numeroPrueba);
		Assert.assertEquals("MMMCMXCVIII", resultado);	
	}
	
}
