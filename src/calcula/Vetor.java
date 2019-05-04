/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

import java.util.Arrays;

/**
 *
 * @author Lwcyano
 */
public class Vetor {
    // Declarando e Inicializando um array de Aluno com capacidade 100.
  private Transportadora[] transportes = new Transportadora[100];
  private int totalDeTransportes=0;
  
  public void adiciona(Transportadora trans) {
    this.transportes[this.totalDeTransportes]= trans;
    this.totalDeTransportes++;
  }

  public void adiciona(int posicao, Transportadora transportes) {
    // implementação
  }

  public Transportadora pega(int posicao) {
      return null;
    // implementação
  }

  public void remove(int posicao) {
    // implementação
  }

  public boolean contem(Transportadora trans) {
    for (int n = 0; n < this.transportes.length; n++) {
      if (trans == this.transportes[n]) {
        return true;
      }
    }
    return false;
  }

  public int tamanho() {
    return this.totalDeTransportes;
    // implementação
  }
  
  public String toString() {
    if(this.totalDeTransportes==0){
        return "[]";
    }
    StringBuilder builder = new StringBuilder();
    builder.append("[");
    for (int i = 0; i < this.totalDeTransportes - 1; i++) {
    builder.append(this.transportes[i]);
    builder.append(", ");
  }

  builder.append(this.transportes[this.totalDeTransportes - 1]);
  builder.append("]");

  return builder.toString();
  }
}
