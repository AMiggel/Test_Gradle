package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EjerciciosTest {
	
	Ejercicios ejercicios;
	
	@Before
	public void setUp (){
		
		ejercicios = new Ejercicios();
	}
	
	@Test
 	public void ingresoCincoYTresYReciboOcho(){
		
		//arrange
		int numero1 = 5;
		int numero2 = 3;
		
		//act
				
		int resultado =ejercicios.sumar(numero1,numero2);
		
		//assert
		assertEquals(8, resultado);
	}
	
	//sumar
	@Test
	public void ingresoCincoReciboSeis() {
		
		//arrange
		
		int numero1 = 5;
		
		//act
	
		int resultado =ejercicios.sumarUnoAUno(numero1);
			
		//assert
		assertEquals(6, resultado);
	}
	@Test
	public void ingresoCuatroYReciboCinco() {
		
		//arrange
		
		int numero1 = 4;
		
		//act
	
		int resultado =ejercicios.sumarUnoAUno(numero1);
			
		//assert
		assertEquals(5, resultado);
	}
	
	//restar
	@Test
	public void ingresoCincoYTresYReciboDos() {
		
		//arrange
		
		int numero1 = 5;
		int numero2 = 3;
		
		//act

		int resultado =ejercicios.restar(numero1,numero2);
			
		//assert
		assertEquals(2, resultado);
	}
	@Test
	public void ingresoOchoYCuatroYReciboCuatro() {
		
		//arrange
		
		int numero1 = 8;
		int numero2 = 4;
		
		//act
	
		int resultado =ejercicios.restar(numero1,numero2);
			
		//assert
		assertEquals(4, resultado);
	}
	@Test
	public void ingresoCuatroYDosReciboDos() {
		
		//arrange
		
		int numero1 = 4;
		int numero2 = 2;
		
		//act
	
		int resultado =ejercicios.restar(numero1,numero2);
			
		//assert
		assertEquals(2, resultado);
	}
	
	//multiplicar
	@Test
	public void ingresoDosYCincosReciboDiez() {
		
		//arrange
		
		int numero1 = 2;
		int numero2 = 5;
		
		//act

		int resultado =ejercicios.multiplicar(numero1,numero2);
			
		//assert
		assertEquals(10, resultado);
	}
	@Test
	public void ingresoSieteYTresReciboVentiUno() {
		
		//arrange
		
		int numero1 = 7;
		int numero2 = 3;
		
		//act

		int resultado =ejercicios.multiplicar(numero1,numero2);
			
		//assert
		assertEquals(21, resultado);
	}
	@Test
	public void ingresoDosYDosReciboCuatro() {
		
		//arrange
		
		int numero1 = 2;
		int numero2 = 2;
		
		//act

		int resultado =ejercicios.multiplicar(numero1,numero2);
			
		//assert
		assertEquals(4, resultado);
	}
	
	//Dividir
	@Test
	public void ingresoSeisYDosReciboTres() {
		
		//arrange
		
		int numero1 = 6;
		int numero2 = 2;
		
		//act

		int resultado =ejercicios.dividir(numero1,numero2);
			
		//assert
		assertEquals(3, resultado);
	}
	@Test
	public void ingresoDiezYCincoReciboDos() {
		
		//arrange
		
		int numero1 = 10;
		int numero2 = 5;
		
		//act
	
		int resultado =ejercicios.dividir(numero1,numero2);
			
		//assert
		assertEquals(2, resultado);
	}
	@Test
	public void ingresoDosYDosReciboUno() {
		
		//arrange
		
		int numero1 = 2;
		int numero2 = 2;
		
		//act
		
		int resultado =ejercicios.dividir(numero1,numero2);
			
		//assert
		assertEquals(1, resultado);
	}
	
	//Strings
	@Test
	public void ingresoHola() {
		
		//arrange
		
		String palabra = "hola";
		
		//act

		String resultado =ejercicios.imprimirPalabra(palabra);
			
		//assert
		assertEquals("hola", resultado);
	}
	@Test
	public void ingresoBancolombia() {
		
		//arrange
		
		String palabra = "Bancolombia";
		
		//act
	
		String resultado =ejercicios.imprimirPalabra(palabra);
			
		//assert
		assertEquals("Bancolombia", resultado);
	}
	@Test
	public void ingresoFuncional() {
		
		//arrange
		
		String palabra = "fUnCiOnAl";
		
		//act
	
		String resultado =ejercicios.imprimirPalabra(palabra);
			
		//assert
		assertEquals("fUnCiOnAl", resultado);
	}

	//Strings Vs enters
	@Test
	public void ingresoHolaReciboCuatro() {
	
		//arrange
		
		String numero = "hola";
		
		//act
	
		int resultado =ejercicios.imprimirNumero(numero.length());
			
		//assert
		assertEquals(4, resultado);
	}
	@Test
	public void ingresoBancolombiaReciboOnce() {
		
			//arrange
			
			String numero = "Bancolombia";
			
			//act
		
			int resultado =ejercicios.imprimirNumero(numero.length());
				
			//assert
			assertEquals(11, resultado);
			
		
	}
	@Test
	public void ingresofUnCiOnAlReciboNueve() {
		
			//arrange
			
			String numero = "fUnCiOnAl";
			
			//act
		
			int resultado =ejercicios.imprimirNumero(numero.length());
				
			//assert
			assertEquals(9, resultado);
			
		
	}

	//Boolean
	@Test
	public void ingresoCincoReciboTrue() {
		
			//arrange
			
			int numero = 5;
			
			//act
		
			boolean resultado =ejercicios.validarSiUnNumeroEsCinco(numero);
				
			//assert
			assertEquals(true,resultado);
}
	@Test
	public void ingresoCuatroReciboFalse() {
		
			//arrange
			int numero = 4;
			//act
			boolean resultado =ejercicios.validarSiUnNumeroEsCinco(numero);
			//assert
			assertEquals(false,resultado); //Assert.assertTrue
}
	@Test
	
	public void ingresoTresReciboFalse() {
		
			//arrange
			
			int numero = 3;
			
			//act
		
			boolean resultado =ejercicios.validarSiUnNumeroEsCinco(numero);
				
			//assert
			assertEquals(false,resultado);//Assert.assertFalse
}
	@Test
	public void ingresoDosReciboFalse() {
		
			//arrange
			
			int numero = 2;
			
			//act
		
			boolean resultado =ejercicios.validarSiUnNumeroEsCinco(numero);
				
			//assert
			assertEquals(false,resultado);
}
	
	// Numero mayor a 0 boolean
	@Test
	public void ingressoCincoReciboTrue() {
	
		//arrange
		
		int numero = 5;
		
		//act
	
		boolean resultado =ejercicios.validarNumeroMayorOMenorACero(numero);
			
		//assert
		assertEquals(true,resultado);
}
	@Test
	public void ingresoMenosTresReciboFalse() {
	
		//arrange
		
		int numero = -3;
		
		//act
	
		boolean resultado =ejercicios.validarNumeroMayorOMenorACero(numero);
			
		//assert
		assertEquals(false,resultado);
}
	@Test
	public void ingressoDosReciboTrue() {
	
		//arrange
		
		int numero = 2;
		
		//act
	
		boolean resultado =ejercicios.validarNumeroMayorOMenorACero(numero);
			
		//assert
		assertEquals(true,resultado);
}
	
	//Numeros pares
	@Test
	public void ingresoDosResciboTrue() {
	
		//arrange
		
		int numero = 2;
		
		//act
	
		boolean resultado =ejercicios.validarUnNumeroPar(numero);
			
		//assert
		assertEquals(true,resultado);
}
	@Test
	public void ingresoTresResciboFalse() {
	
		//arrange
		
		int numero = 3;
		
		//act
	
		boolean resultado =ejercicios.validarUnNumeroPar(numero);
			
		//assert
		assertEquals(false,resultado);
}
	@Test
	public void ingresoCuatroResciboTrue() {
	
		//arrange
		
		int numero = 4;
		
		//act
	
		boolean resultado =ejercicios.validarUnNumeroPar(numero);
			
		//assert
		assertEquals(true,resultado);
}
	@Test
	public void ingresoCincoResciboFalse() {
	
		//arrange
		
		int numero = 5;
		
		//act
	
		boolean resultado =ejercicios.validarUnNumeroPar(numero);
			
		//assert
		assertEquals(false,resultado);
}
	
	// valor absoluto
	@Test
	public void ingresoDosReciboDos() {
	
		//arrange
		
		int numero = 2;
		
		//act
	
		int resultado =ejercicios.imprimirNumero(numero);
			
		//assert
		assertEquals(2,resultado);
}
	@Test
	public void ingresoMenosCuatroReciboCuatro() {
	
		//arrange
		
		int numero = -4;
		
		//act
	
		int resultado =ejercicios.validarValorAbsoluto(numero);
			
		//assert
		assertEquals(4,resultado);
}
	@Test
	public void ingresoMenosSeisReciboSeis() {
	
		//arrange
		
		int numero = -6;
		
		//act
	
		int resultado =ejercicios.validarValorAbsoluto(numero);
			
		//assert
		assertEquals(6,resultado);
}
	@Test
	public void ingresoSieteReciboSiete() {
	
		//arrange
		
		int numero = 7;
		
		//act
	
		int resultado =ejercicios.validarValorAbsoluto(numero);
			
		//assert
		assertEquals(7,resultado);
}
	
	
	// Operadores lógicos AND
	@Test
	public void trueYTrueReciboTrue() {
		
		//arrange
		
		boolean valor1= true;
		boolean valor2= true;
		
		//act
	
		boolean resultado =ejercicios.calcularAnd(valor1,valor2);
			
		//assert
		assertEquals(true,resultado);
}	
	@Test
	public void trueYfalseReciboFalse() {
	
	//arrange
	
	boolean valor1= true;
	boolean valor2= false;
	
	//act

	boolean resultado =ejercicios.calcularAnd(valor1,valor2);
		
	//assert
	assertEquals(false,resultado);
}	
	@Test
	public void FalseYTrueReciboFalse() {
	
	//arrange
	
	boolean valor1= false;
	boolean valor2= true;
	
	//act

	boolean resultado =ejercicios.calcularAnd(valor1,valor2);
		
	//assert
	assertEquals(false,resultado);
}
	@Test
	public void FalseYFalseReciboFalse() {
	
	//arrange
	
	boolean valor1= false;
	boolean valor2= false;
	
	//act

	boolean resultado =ejercicios.calcularAnd(valor1,valor2);
		
	//assert
	assertEquals(false,resultado);
}
	
	// Operadores lógicos OR
	@Test
	public void FalseYFalseReciboFalseOr() {
		
		//arrange
		
		boolean valor1= false;
		boolean valor2= false;
		
		//act

		boolean resultado =ejercicios.calcularOr(valor1,valor2);
			
		//assert
		assertEquals(false,resultado);
	}
	@Test
	public void FalseYTrueReciboTrue() {
	
	//arrange
	
	boolean valor1= false;
	boolean valor2= true;
	
	//act

	boolean resultado =ejercicios.calcularOr(valor1,valor2);
		
	//assert
	assertEquals(true,resultado);
}
	@Test
	public void TrueYFalseReciboTrue() {
	
	//arrange
	
	boolean valor1= true;
	boolean valor2= false;
	
	//act

	boolean resultado =ejercicios.calcularOr(valor1,valor2);
		
	//assert
	assertEquals(true,resultado);
}
	@Test
	public void TrueYTrueReciboTrue() {
	
	//arrange
	
	boolean valor1= true;
	boolean valor2= true;
	
	//act

	boolean resultado =ejercicios.calcularOr(valor1,valor2);
		
	//assert
	assertEquals(true,resultado);
}
	
	//Comparar Strings
	@Test
	public void rojoYVerdeReciboNavidad() {
	
	//arrange
	
	String valor1= "Rojo";
	String valor2= "Verde";
	
	//act

	String resultado =ejercicios.compararStrings(valor1,valor2);
		
	//assert
	assertEquals("Navidad",resultado);
}
	@Test
	public void verdeYRojoReciboHalloween() {
	
	//arrange
	
	String valor1= "Verde";
	String valor2= "Rojo";
	
	//act

	String resultado =ejercicios.compararStrings(valor1,valor2);
		
	//assert
	assertEquals("Halloween",resultado);
}
	@Test
	public void verdeYNaranjaReciboPascua() {
	
	//arrange
	
	String valor1= "Rojo";
	String valor2= "Naranja";
	
	//act

	String resultado =ejercicios.compararStrings(valor1,valor2);
		
	//assert
	assertEquals("Pascua",resultado);
}

	//validar ultimo numero de un valor
	@Test
	public void ochoYDieciochoReciboTrue() {
	
	//arrange
	
	int valor1= 8;
	int valor2= 18;
	
	//act

	boolean resultado =ejercicios.sacarUltimoValorDeUnNumero(valor1,valor2);
		
	//assert
	assertEquals(true,resultado);
}
	@Test
	public void tresYCientotreceReciboTrue() {
		
		//arrange
		
		int valor1= 3;
		int valor2= 113;
		
		//act

		boolean resultado =ejercicios.sacarUltimoValorDeUnNumero(valor1,valor2);
			
		//assert
		assertEquals(true,resultado);
	}
	@Test
	public void seisYCientodiecisieteReciboFalse() {
		
		//arrange
		
		int valor1= 6;
		int valor2= 113;
		
		//act

		boolean resultado =ejercicios.sacarUltimoValorDeUnNumero(valor1,valor2);
			
		//assert
		assertEquals(false,resultado);
	}
	
	//Extraer numero mas alto
	@Test
	public void ExtraerNumeroMasAltoTreinta() {
		
		//arrange
		
		int valor1= 8;
		int valor2= 18;
		int valor3= 30;
		
		//act

		int resultado =ejercicios.extraerNumeroMasAlto(valor1,valor2,valor3);
			
		//assert
		assertEquals(30,resultado);
	}
	@Test
	public void ExtraerNumeroMasAltoVentiNueve() {
		
		//arrange
		
		int valor1= 29;
		int valor2= 5;
		int valor3= 15;
		
		//act

		int resultado =ejercicios.extraerNumeroMasAlto(valor1,valor2,valor3);
			
		//assert
		assertEquals(29,resultado);
	}
	@Test
	public void ExtraerNumeroMasAltoCincuenta() {
		
		//arrange
		
		int valor1= 10;
		int valor2= 50;
		int valor3= 5;
		
		//act

		int resultado =ejercicios.extraerNumeroMasAlto(valor1,valor2,valor3);
			
		//assert
		assertEquals(50,resultado);
	}

	//Problema enunciado
	@Test
	public void Aprobar() {
		
		//arrange
		
		int valor1= 7;
		int valor2= 7;
		
		//act

		String resultado =ejercicios.consultarNotaBimestral(valor1,valor2);
			
		//assert
		assertEquals("Aprobado",resultado);
	}
	@Test
	public void Supletorio() {
		
		//arrange
		
		int valor1= 4;
		int valor2= 6;
		
		//act

		String resultado =ejercicios.consultarNotaBimestral(valor1,valor2);
			
		//assert
		assertEquals("Supletorio",resultado);
	}
	@Test
	public void Reprobar() {
		
		//arrange
		
		int valor1= 5;
		int valor2= 4;
		
		//act

		String resultado =ejercicios.consultarNotaBimestral(valor1,valor2);
			
		//assert
		assertEquals("Reprobado",resultado);
	}
	
	//Multiplicar sin operar con multiplicación
	@Test
	public void MultiplicarDosYDos() {
		
		//arrange
		
		int valor1= 2;
		int valor2= 2;
		
		//act

		int resultado =ejercicios.multiplicarSinOperar(valor1,valor2);
			
		//assert
		assertEquals(4,resultado);
	}
	@Test
	public void MultiplicarTresYCuatro() {
		
		//arrange
		
		int valor1= 3;
		int valor2= 4;
		
		//act

		int resultado =ejercicios.multiplicarSinOperar(valor1,valor2);
			
		//assert
		assertEquals(12,resultado);
	}
	@Test
	public void MultiplicarCincoYCinco() {
		
		//arrange
		
		int valor1= 5;
		int valor2= 5;
		
		//act

		int resultado =ejercicios.multiplicarSinOperar(valor1,valor2);
			
		//assert
		assertEquals(25,resultado);
	}
}


