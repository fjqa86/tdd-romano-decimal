package co.edu.udea.appempresariales.romano;

public class RomanoDecimal {

	public String convertirDecimal(String numeroPrueba) {
        int[] decimal =   {1000, 900,  500, 400,  100, 90,   50,  40,   10,  9,    5,   4,    1 };
		String[] romano = {"M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		
		String resultado="";
		if(errores(numeroPrueba)){
			return resultado;
		}
		int numero = Integer.parseInt(numeroPrueba);
		for (int i=0;i<decimal.length;i++){
			if (numero==decimal[i]){
				resultado=resultado+romano[i];
				break;
			}else{
				if (numero>decimal[i]){
					resultado=resultado+romano[i];
					numero = numero - decimal[i];
					if (numero <= decimal[i]){
						i=-1;
						continue;
					}else{	
						if (numero > decimal[i]){
							numero = numero - decimal[i];
							if (numero < 2*decimal[i]){
								resultado=resultado+romano[i];
							}
							i=-1;
							continue;
						}
						break;
					}
				}
			}		
		}
		return resultado;
	}
	
	static private boolean errores(String numero){
		int a;
		try{
			a = Integer.parseInt(numero);
		}catch (Exception e){
			return true;
		}
		
		if (a>3999){
			return true;
		}	
		
		return false;
	}

}
