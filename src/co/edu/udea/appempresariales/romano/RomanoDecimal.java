package co.edu.udea.appempresariales.romano;

public class RomanoDecimal {

	public String convertirDecimal(String numeroPrueba) {
		String resultado="";
		int numero = Integer.parseInt(numeroPrueba);
		if (numero==1){
			resultado=resultado+"I";
		}
		return resultado;
	}

}
