package br.com.fiap.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import br.com.fiap.utilities.Calculadora;

class TesteCalculadora {

/**
	 * Teste de somar na Calculadora.
	 */
	@Test
	public void testeSomar() {
		int nro1 = 5;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 10;
		int resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeSomar2() {
		int nro1 = 15;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 20;
		int resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	
	/**
	 * Teste de subtrair na Calculadora.
	 */
	@Test
	public void testeSubtrair1() {
		int nro1 = 5;
		int nro2 = 15;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 10;
		int resultadoReal = calc.subtrair(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeDividir1() {
		int nro1 = 5;
		int nro2 = 15;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 3;
		int resultadoReal = calc.dividir(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
