package co.edu.udea.appempresariales.romano;

public class RomanoDecimal {

	public String convertirDecimal(String numeroPrueba) {
        int[] decimal =   {50 , 40 ,10 , 9 , 5 ,   4 , 1};
		String[] romano = {"L","LX","X","IX","V", "IV","I" };
		
		String resultado="";
		int numero = Integer.parseInt(numeroPrueba);
		for (int i=0;i<decimal.length;i++){
			if (numero==decimal[i]){
				resultado=resultado+romano[i];
				break;
			}else{
				if (numero>decimal[i]){
					resultado=resultado+romano[i];
					numero = numero - decimal[i];
					if (numero < decimal[i]){
						i=0;
						continue;
					}else{
						
					for (int j=0;j<numero;j++){
						resultado=resultado+romano[i];
					}
					break;}
				}
			}		
		}
		return resultado;
	}

}
