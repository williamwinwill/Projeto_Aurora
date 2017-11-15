package main.model;

import javax.swing.table.AbstractTableModel;

public class LayoutPontuacao extends AbstractTableModel {

  private static final long serialVersionUID = 1L;
  
  public enum TipoPontuacao {
    UNS, DOIES, TRES, QUATROS, CINCOS, SEIS, UM_PAR, DOIS_PARES,
    TRES_IGUAIS, QUATRO_IGUAIS, FULL_HOUSE, SQ_MENOR, SQ_MAIOR, AURORA
  }

  private static final int COD_COLUNA = 0;
  private static final int COLUNA_PONTUACAO = 2;
  private static final Object EM_BRANCO = "-";
  
  private String[] colunas = { "ID", "Type", "Score" };
  private Object[][] inData = {
      { TipoPontuacao.UNS, "Uns", EM_BRANCO },
      { TipoPontuacao.DOIES, "Dois", EM_BRANCO },
      { TipoPontuacao.TRES, "Tres", EM_BRANCO },
      { TipoPontuacao.QUATROS, "Quatros", EM_BRANCO },
      { TipoPontuacao.CINCOS, "Cincos", EM_BRANCO },
      { TipoPontuacao.SEIS, "Seis", EM_BRANCO },
      { TipoPontuacao.UM_PAR, "Um par", EM_BRANCO },
      { TipoPontuacao.DOIS_PARES, "Dois pares", EM_BRANCO },
      { TipoPontuacao.TRES_IGUAIS, "3 iguais", EM_BRANCO },
      { TipoPontuacao.QUATRO_IGUAIS, "4 iguais", EM_BRANCO },
      { TipoPontuacao.FULL_HOUSE, "Full House", EM_BRANCO },
      { TipoPontuacao.SQ_MENOR, "Seq Menor", EM_BRANCO },
      { TipoPontuacao.SQ_MAIOR, "Seq Maior", EM_BRANCO },
      { TipoPontuacao.AURORA, "Aurora", EM_BRANCO },
  };

  @Override
  public void setValueAt(Object value, int row, int col) {
    inData[row][col] = (Integer) value;
    fireTableCellUpdated(row, col);
  }

  @Override
  public Object getValueAt(int row, int col) {
    return inData[row][col];
  }

  @Override
  public int getColumnCount() {
    return colunas.length;
  }

  @Override
  public int getRowCount() {
    return inData.length;
  }

  @Override
  public String getColumnName(int col) {
    return colunas[col];
  }

  @Override
  public boolean isCellEditable(int row, int col) {
    return false;
  }

  public void atualizaLinha(int row, int value) {
    setValueAt(value, row, COLUNA_PONTUACAO);
  }
  
  public TipoPontuacao getIdAt(int row) {
    return (TipoPontuacao)getValueAt(row, COD_COLUNA);
  }
  
  public int getLinhaAt(TipoPontuacao id) {
    int row = -1;
    for (int i = 0; i < getRowCount(); i++) {
      if (getIdAt(i) == id) {
        row = i;
        break;
      }
    }
    return row;
  }
  
  public boolean isEmBranco(int row) {
    return getValueAt(row, 2) != "-";
  }
  
  public int getPontuacaoAt(int row) {
    int score = 0;
    if (isEmBranco(row)) {
      Integer integerScore = (Integer)getValueAt(row, 2);
      score = integerScore.intValue();
    }
    return score;
  }
  
  public int getPontuacaoAt(TipoPontuacao tipoPontuacao) {
    return getPontuacaoAt(getLinhaAt(tipoPontuacao));
  }
  
  public void atualizaLinha(TipoPontuacao tipoPontuacao, int value) {
    atualizaLinha(getLinhaAt(tipoPontuacao), value);
  }
}
