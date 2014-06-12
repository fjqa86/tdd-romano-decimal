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
		if (numero==4){
			resultado=resultado+"IV";	
		}
		if (numero==5){
			resultado=resultado+"V";	
		}
		if (numero>5 && numero < 9) {
			resultado=resultado+"V";
			for (int i=0;i<numero-5;i++){
				resultado=resultado+"I";
			}	
		}
		return resultado;
	}

}
