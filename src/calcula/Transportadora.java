/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

/**
 *
 * @author Lwcyano
 */
public class Transportadora {
    private String nome;
    private int cepInicio;
    private int cepFim;
    private String praca;
    private String uf;
    private int prazo;
    private double valornf;
    
    private double peso;    
    private double valor;
    private int gris;
    private double seguro;
    private double imposto;
    private double icms;

    public Transportadora() {
    }

    public Transportadora(String nome, int cepInicio, int cepFim, String praca, String uf, int prazo, double valornf, double peso, double valor, int gris, double seguro, double imposto, double icms) {
        this.nome = nome;
        this.cepInicio = cepInicio;
        this.cepFim = cepFim;
        this.praca = praca;
        this.uf = uf;
        this.prazo = prazo;
        this.valornf = valornf;
        this.peso = peso;
        this.valor = valor;
        this.gris = gris;
        this.seguro = seguro;
        this.imposto = imposto;
        this.icms = icms;
    }

    public double getValornf() {
        return valornf;
    }

    

    public String getNome() {
        return nome;
    }

    public int getCepInicio() {
        return cepInicio;
    }

    public int getCepFim() {
        return cepFim;
    }

    public String getPraca() {
        return praca;
    }

    public String getUf() {
        return uf;
    }

    public int getPrazo() {
        return prazo;
    }

    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }

    public int getGris() {
        return gris;
    }

    public double getSeguro() {
        return seguro;
    }

    public double getImposto() {
        return imposto;
    }

    public double getIcms() {
        return icms;
    }

    public void setValornf(double valornf) {
        this.valornf = valornf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCepInicio(int cepInicio) {
        this.cepInicio = cepInicio;
    }

    public void setCepFim(int cepFim) {
        this.cepFim = cepFim;
    }

    public void setPraca(String praca) {
        this.praca = praca;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setGris(int gris) {
        this.gris = gris;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    @Override
    public String toString() {
        return "Transportadora{" + "nome=" + nome + ", cepInicio=" + cepInicio + ", cepFim=" + cepFim + ", praca=" + praca + ", uf=" + uf + ", prazo=" + prazo + ", peso=" + peso + ", valor=" + valor + ", gris=" + gris + ", seguro=" + seguro + ", imposto=" + imposto + ", icms=" + icms + '}';
    }
    
    
}
