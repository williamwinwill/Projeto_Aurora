package main.model;

import java.util.Collections;
import java.util.List;

public class Regra {

	public int pontAoMenosUmNumero(List<Dado> dados, final int i) {
		int pontuacao = 0;
		for (Dado dado : dados) {
			if (dado.getValor() == i) {
				pontuacao += i;
			}
		}
		return pontuacao;
	}
	
	public int pontUmPar (List<Dado> dados) {
		for (int i = 1; i <= 6; i++) {
			int a = validarNumero(dados, i);
			if (a == 2) {
				return  a * i;
			}    
		}
		return 0;
	}


	public int pontDoisPares(List<Dado> dados) {
		for (int i = 1; i <= 6; i++) {
			int a = validarNumero(dados, i);
			if (a == 2) {

				int primeiroPar = i*2;
				for (int j =1; j<=6; j++){
					int b = validarNumero(dados, j);
					if (b==2 && j!=i){
						int segundoPar = j*2;

						return  primeiroPar + segundoPar;

					}
				}
			}
		}
		return 0;
	}

	private int validarNumero(List<Dado> dados, int num) {
		int sum = 0;
		for (Dado dado : dados) {
			if (dado.getValor() == num ){
				sum++;
			}
		}
		return sum;
	}

	public int pontNumeroRepetidos(List<Dado> dados, int num) {
		Collections.sort(dados);
		int pontuacao = 0;
		int count = 1;
		for (int i = 0; i < dados.size() - 1; i++) {
			if (dados.get(i).getValor() == dados.get(i + 1).getValor()) {
				count++;
				pontuacao = dados.get(i).getValor() * num;
				if (count == num) {
					break;
				}
			} else {
				count = 1;
			}
		}
		return pontuacao;
	}


	public int pontFullHouse(List<Dado> dados) {
		int[] array = new int[Dado.VALOR_MAX + 1];
		for (Dado dado : dados) {
			array[dado.getValor()]++;
		}
		boolean par = false;
		boolean trio = false;
		for (int i : array) {
			if (i == 2) {
				par = true;
			} else if (i == 3) {
				trio = true;
			}
		}

		return (par && trio) ? 25 : 0;
	}

	public int pontSqMenor(List<Dado> dados) {
		return isNumConsecutivo(dados, 4) ? 15 : 0;
	}

	public int pontSqMaior(List<Dado> dados) {
		return isNumConsecutivo(dados, 5) ? 20 : 0;
	}

	private boolean isNumConsecutivo(List<Dado> dados, int num) {
		Collections.sort(dados);
		int count = 1;
		for (int i = 0; i < dados.size() - 1; i++) {
			if ((dados.get(i).getValor() - 1) == dados.get(i + 1).getValor()) {
				count++;
				if (count == num) {
					return true;
				}
			} else {
				count = 1;
			}
		}
		return false;
	}

	public int pontAurora(List<Dado> dados) {
		int refValue = dados.get(0).getValor();
		boolean isTudoIgual = true;
		for (Dado dado : dados) {
			if (dado.getValor() != refValue) {
				isTudoIgual = false;
			}
		}
		return isTudoIgual ? 50 : 0;
	}
}
