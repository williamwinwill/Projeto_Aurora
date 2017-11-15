package main.model;

import java.util.concurrent.ThreadLocalRandom;

public class Dado implements Comparable<Dado> {
	public static final int VALOR_MIN = 1;
	public static final int VALOR_MAX = 6;

	private int valor;

	 public Dado() {
		setValor(0);
	}

	public void reset() {
		setValor(0);
	}

	public void rolar() {
		int random = ThreadLocalRandom.current().nextInt(VALOR_MIN, VALOR_MAX + 1);
		setValor(random);
	}
	
	/**
	 * metodo que quebra encapsulamento para teste
	 * Necessario uma melhor abordagem
	 * @param valorTest
	 */
	public void rolarTeste(int valorTest) {
		setValor(valorTest);
	}

	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	public int compareTo(Dado dado) {
		return this.getValor() < dado.getValor() ? 0 : -1;
	}
	
	
}
