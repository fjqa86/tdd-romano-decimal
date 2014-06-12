package co.edu.udea.appempresariales.romano;

public class RomanoDecimal {

	public String convertirDecimal(String numeroPrueba) {
		String resultado="";
		int numero = Integer.parseInt(numeroPrueba);
		if (numero<4){
			for (int i=0;i<numero;i++){
				resultado=resultado+"I";
			}			
		}
		return resultado;
	}

}
