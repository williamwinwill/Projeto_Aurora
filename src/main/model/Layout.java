package main.model;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class Layout extends JFrame {

	private static final long serialVersionUID = 1L;

	private Jogo jogo;

	private JButton btnRolar;
	private JButton btnPontucao;
	private JTextField[] txtDados;

	private JPanel painelGlobal;
	private JPanel painelControle;
	private JPanel painelDados;

	private JTable tabelaPontuacao;

	public Layout() {
		painelGlobal = new JPanel();
		painelGlobal.setPreferredSize(new Dimension(400, 300));
		this.getContentPane().add(painelGlobal);
		setLayout(new FlowLayout());

		tabelaPontuacao = new JTable();
		addComponente(tabelaPontuacao);

		painelDados = new JPanel();
		addComponente(painelDados);
		painelDados.setLayout(new GridLayout(1, 5, 2, 2));

		txtDados = new JTextField[Jogo.CONTADOR_DADO]; 
		for (int i = 0; i< txtDados.length; i++) {
			txtDados[i] = new JTextField("-", 1);
			txtDados[i].setMinimumSize(new Dimension(50, 50));
			painelDados.add(txtDados[i]);
		}

		painelControle = new JPanel();
		addComponente(painelControle);
		painelControle.setLayout(new GridLayout(1, 2, 2, 2));

		painelControle.add(new JSeparator(), BorderLayout.PAGE_END);

		btnRolar = new JButton("Rolar Dados");
		painelControle.add(btnRolar);
		btnRolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getJogo().rolarDados();
			}
		});

		btnPontucao = new JButton("Pontuar");
		painelControle.add(btnPontucao);
		btnPontucao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = tabelaPontuacao.getSelectedRow();
				if (row >= 0) {
					getJogo().verificarPontuacao(row);
				}
			}
		});

		pack();
	} 

	public void limparDados() {
		for (int i = 0; i < txtDados.length; i++) {
			txtDados[i].setText("-");
		}
	}

	private void addComponente(Component comp) {
		this.painelGlobal.add(comp);
	}

	public void updateDado(int index, int value) {
		this.txtDados[index].setText(new Integer(value).toString());
	}

	public void setModel(TableModel dataModel) {
		this.tabelaPontuacao.setModel(dataModel);
		// Hide ID column
		tabelaPontuacao.removeColumn(tabelaPontuacao.getColumnModel().getColumn(0));
	}

	public Jogo getJogo() {
		return this.jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
}
