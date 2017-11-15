package main.model;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

  public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
          public void run() {
              Layout frame = new Layout();
              frame.setTitle("Projeto Aurora");
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.setLocationRelativeTo(null);
              frame.setVisible(true);
              frame.setJogo(new Jogo(frame, new LayoutPontuacao()));
          }
      });
  }
}
