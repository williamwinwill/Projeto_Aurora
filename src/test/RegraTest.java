package test;

import static junit.framework.TestCase.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import main.model.Dado;
import main.model.Regra;

public class RegraTest {

	@Test
	public void pontAoMenosUmNumero_1() {
		
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(1);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(2);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(3);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(4);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(5);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontAoMenosUmNumero(dados, 1);
		assertEquals(1,pontuacao);
	}
	
	@Test
	public void pontAoMenosUmNumero_2() {
		
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(2);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(2);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(3);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(4);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(5);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontAoMenosUmNumero(dados, 2);
		assertEquals(4,pontuacao);
	}
	
	@Test
	public void pontAoMenosUmNumero_3() {
		
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(1);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(2);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(3);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(4);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(5);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontAoMenosUmNumero(dados, 3);
		assertEquals(3,pontuacao);
	}
	
	@Test
	public void pontAoMenosUmNumero_4() {
		
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(1);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(4);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(3);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(4);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(5);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontAoMenosUmNumero(dados, 4);
		assertEquals(8,pontuacao);
	}
	
	@Test
	public void pontAoMenosUmNumero_5() {
		
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(1);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(5);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(3);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(4);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(5);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontAoMenosUmNumero(dados, 5);
		assertEquals(10,pontuacao);
	}

	@Test
	public void pontAoMenosUmNumero_6_valorZerado() {
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(1);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(5);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(3);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(4);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(5);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontAoMenosUmNumero(dados, 6);
		assertEquals(0,pontuacao);
	}
	
	@Test
	public void pontFullHouse() {
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(2);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(2);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(2);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(4);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(4);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontFullHouse(dados);
		assertEquals(25,pontuacao);
		
	}
	
	@Test
	public void pontAurora() {
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(5);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(5);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(5);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(5);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(5);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontAurora(dados);
		assertEquals(50,pontuacao);
		
	}
	
	@Test
	public void pontSqMenor() {
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(1);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(2);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(4);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(6);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(3);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontSqMenor(dados);
		assertEquals(15,pontuacao);
		
	}
	
	@Test
	public void pontSqMaior() {
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(4);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(2);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(3);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(5);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(1);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontSqMaior(dados);
		assertEquals(20,pontuacao);
		
	}
	
	@Test
	public void pontUmPar() {
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(4);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(3);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(3);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(5);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(1);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontUmPar(dados);
		assertEquals(6,pontuacao);
		
	}
	
	@Test
	public void pontDoisPar() {
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(4);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(3);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(3);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(5);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(5);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontDoisPares(dados);
		assertEquals(16,pontuacao);
		
	}
	
	@Test
	public void pontTresIguais() {
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(4);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(6);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(6);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(6);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(5);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontNumeroRepetidos(dados, 3);
		assertEquals(18,pontuacao);
		
	}
	
	@Test
	public void pontQuatroIguais() {
		
		Dado dado1 = new Dado();
		dado1.rolarTeste(2);
		
		Dado dado2 = new Dado();
		dado2.rolarTeste(6);
		
		Dado dado3 = new Dado();
		dado3.rolarTeste(2);
		
		Dado dado4 = new Dado();
		dado4.rolarTeste(2);
		
		Dado dado5 = new Dado();
		dado5.rolarTeste(2);
	
		ArrayList<Dado> dados = new ArrayList<Dado>();
		dados.add(dado1);
		dados.add(dado2);
		dados.add(dado3);
		dados.add(dado4);
		dados.add(dado5);
		
		int pontuacao = 0;
		Regra regra = new Regra();

		pontuacao = regra.pontNumeroRepetidos(dados, 4);
		assertEquals(8,pontuacao);
		
	}
}
