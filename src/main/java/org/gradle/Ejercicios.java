package org.gradle;

public class Ejercicios {

	public int sumar(int numero1, int numero2) {
		// TODO Auto-generated method stub
		return numero1 + numero2;
	}

	public int sumarUnoAUno(int numero1) {
		// TODO Auto-generated method stub
		return ++numero1;
	}

	public int restar(int numero1, int numero2) {
		// TODO Auto-generated method stub
		return numero1 - numero2;
	}

	public int multiplicar(int numero1, int numero2) {
		// TODO Auto-generated method stub
		return numero1 * numero2;
	}

	public int dividir(int numero1, int numero2) {
		// TODO Auto-generated method stub
		return numero1 / numero2;
	}

	public String imprimirPalabra(String palabra) {
		return palabra;
		// TODO Auto-generated method stub
		
	}
	
	public int imprimirNumero(int numero) {
		return numero;
		// TODO Auto-generated method stub
		
	}
		
	public boolean validarSiUnNumeroEsCinco(int numero) {
		
		boolean test = false;
		if(numero == 5 ) {
			test = true;
		}		
		return test;
		// TODO Auto-generated method stub
		
	}
	
	public boolean validarNumeroMayorOMenorACero(int numero) {
		
		boolean test = false;
		if(numero > 0 ) {
			test = true;
		}		
		return test;
		// TODO Auto-generated method stub
		
	}
	
	public boolean validarUnNumeroPar(int numero) {
		
		boolean test = false;
		if(numero %2== 0 ) {
			test = true;
		}		
		return test;
		// TODO Auto-generated method stub
		
	}
	
	public int validarValorAbsoluto(int numero) {
			
		
		return Math.abs(numero);
		// TODO Auto-generated method stub
		
	}

	public boolean calcularAnd(boolean valor1, boolean valor2) {
		return valor1 && valor2;
		
	}
	
	public boolean calcularOr(boolean valor1, boolean valor2) {
		return valor1 || valor2;
		
	}

	public String compararStrings(String valor1, String valor2) {
		
		String resultado="";
		
		if(valor1.equals("Rojo") && valor2.equals("Verde")) {
			resultado ="Navidad";
			
		}else if (valor1.equals("Verde") && valor2.equals("Rojo")){
			resultado="Halloween";
			
		}else if (valor1.equals("Rojo") && valor2.equals("Naranja")){
			resultado="Pascua";
			
		}
		
		return resultado;
	}

	
	public boolean sacarUltimoValorDeUnNumero(int valor1, int valor2) {
		
		if(valor2%10 == valor1) {
			return true;
		}		
		return false;
	}

	public int extraerNumeroMasAlto(int valor1, int valor2, int valor3) {
		return Math.max(valor1,Math.max(valor2, valor3));
		
	}

	
	public String consultarNotaBimestral(int nota1, int nota2) {
		// TODO Auto-generated method stub
		String resultado="";
		
		int notaFinal= nota1 + nota2;

		if(nota1+nota2>= 14) {
			
			resultado="Aprobado";
			
		}else if(notaFinal >= 10 && notaFinal<= 13 ) {
			
			resultado= "Supletorio";
			
		}else if ( notaFinal < 10) {
			resultado="Reprobado";
			
		}
		
		return resultado;
	}

	public int multiplicarSinOperar(int valor1, int valor2) {
		
		int resultado=0;
		
		for (int i = 0; i < valor2; ++i) {
			resultado= resultado + valor1;
		}
		
		return resultado;
	}
	
	
}
