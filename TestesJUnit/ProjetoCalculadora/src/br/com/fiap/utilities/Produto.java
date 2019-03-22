package br.com.fiap.utilities;

public class Produto {

	private double peso;
	private double altura;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Produto(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public Produto() {
		super();
	}
	
	
}
