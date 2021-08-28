
public class Calcular {
	// variáveis
	public double parte1 = 0;
	public double parte2 = 0;
	public final String SOMAR = "+";
	public final String SUBTRAIR = "-";
	public final String DIVIDIR = "/";
	public final String MULTIPLICAR = "*";

	public double somar() {
		return parte1 + parte2;
	}
	
	public double subtrair() {
		return parte1 + parte2;
	}
	
	public double dividir() {
		return parte1 + parte2;
	}
	
	public double multiplicar() {
		return parte1 + parte2;
	}
	
	public String igual(String sinal) {
		String retorno = "";
		if(sinal.equals(SOMAR)){
			retorno = String.valueOf(somar());
		}
		if(sinal.equals(SUBTRAIR)){
			retorno = String.valueOf(subtrair());
		}
		if(sinal.equals(DIVIDIR)){
			retorno = String.valueOf(dividir());
		}
		if(sinal.equals(MULTIPLICAR)){
			retorno = String.valueOf(multiplicar());
		}
		return retorno;
	}

}