package main.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jogo {

	public static final int CONTADOR_DADO = 5;

	private Layout view;
	private LayoutPontuacao model; 
	private Regra control = new Regra();

	private List<Dado> dados;


	public Jogo(Layout view, LayoutPontuacao model) {
		this.view = view;
		this.model = model;

		Dado[] diceArray = new Dado[CONTADOR_DADO];
		for (int i = 0; i < CONTADOR_DADO; i++) {
			diceArray[i] = new Dado();
		}
		dados = new ArrayList<Dado>(Arrays.asList(diceArray));

		view.setModel(model);

		proximaRodada();
	}

	public void rolarDados() {
		for (int i = 0; i < dados.size(); i++) {
			Dado dado = dados.get(i);
			dado.rolar();
			getView().updateDado(i, dado.getValor());
		}
	}

	public void verificarPontuacao(int row) {
		// If this item was already scored then return.
		if (model.isEmBranco(row))
			return;

		int score = -1;
		switch (model.getIdAt(row)) {
		case UNS:
			score = control.pontAoMenosUmNumero(dados, 1);
			break;
		case DOIES:
			score = control.pontAoMenosUmNumero(dados, 2);
			break;
		case TRES:
			score = control.pontAoMenosUmNumero(dados, 3);
			break;
		case QUATROS:
			score = control.pontAoMenosUmNumero(dados, 4);
			break;
		case CINCOS:
			score = control.pontAoMenosUmNumero(dados, 5);
			break;
		case SEIS:
			score = control.pontAoMenosUmNumero(dados, 6);
			break;
		case UM_PAR:
			score = control.pontUmPar(dados);
			break;
		case DOIS_PARES:
			score = control.pontDoisPares(dados);
			break;
		case TRES_IGUAIS:
			score = control.pontNumeroRepetidos(dados, 3);
			break;
		case QUATRO_IGUAIS:
			score = control.pontNumeroRepetidos(dados, 4);
			break;
		case FULL_HOUSE:
			score = control.pontFullHouse(dados);
			break;
		case SQ_MENOR:
			score = control.pontSqMenor(dados);
			break;
		case SQ_MAIOR:
			score = control.pontSqMaior(dados);
			break;
		case AURORA:
			score = control.pontAurora(dados);
			break;
		default:
			break;
		}
		
		if (score >= 0) {
			model.atualizaLinha(row, score);
			proximaRodada();
		}
	}

	public void proximaRodada() {
		Layout view = getView();
		view.limparDados();
	}

	public Layout getView() {
		return view;
	}

	public void setView(Layout view) {
		this.view = view;
	}

	public LayoutPontuacao getModel() {
		return model;
	}

	public void setModel(LayoutPontuacao model) {
		this.model = model;
	}
}
