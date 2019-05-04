/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;
import java.util.Scanner;

/**
 *
 * @author Lwcyano
 */
public class Calcula {
    private int peso;
    private int cepPedido;
    private float valorNFPedido;
    private int comprimentoPedido;
    private int alturaPedido;
    private int larguraPedido;
    private int contador;  
        

    public Calcula() {
    }
  
    public int getPeso() {
        return peso;
    }
       

    public int getCepPedido() {
        return cepPedido;
    }

    public float getValorNFPedido() {
        return valorNFPedido;
    }

    public int getComprimentoPedido() {
        return comprimentoPedido;
    }

    public int getAlturaPedido() {
        return alturaPedido;
    }

    public int getLarguraPedido() {
        return larguraPedido;
    }

    public int getContador() {
        return contador;
    }
       
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void setCepPedido(int cepPedido) {
        this.cepPedido = cepPedido;
    }

    public void setValorNFPedido(float valorNFPedido) {
        this.valorNFPedido = valorNFPedido;
    }

    public void setComprimentoPedido(int comprimentoPedido) {
        this.comprimentoPedido = comprimentoPedido;
    }

    public void setAlturaPedido(int alturaPedido) {
        this.alturaPedido = alturaPedido;
    }

    public void setLarguraPedido(int larguraPedido) {
        this.larguraPedido = larguraPedido;
    }

    public void setContador(int contador) {
        this.contador = contador;
    } 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        boolean testes = true, tamFrete=false, fedexFrete=false, totalFrete=false;
        
       
        // TODO code application logic here
        Transportadora tam = new Transportadora();
        Transportadora fedex = new Transportadora();
        Transportadora total = new Transportadora();
                
        tam.setNome("TAM");        
        tam.setCepInicio(29164001);
        tam.setCepFim(29164987);
        tam.setPeso(500);
        tam.setUf("ES");
        tam.setPraca("ESC");
        tam.setIcms(17);
        tam.setGris(2);
        tam.setImposto(5);        
        
        fedex.setNome("FEDEX");        
        fedex.setCepInicio(1000000);
        fedex.setCepFim(6699999);
        fedex.setPeso(600);
        fedex.setUf("SP");
        fedex.setPraca("SPC");
        fedex.setIcms(18);
        fedex.setGris(1);
        fedex.setImposto(5);
        
        total.setNome("TOTAL");        
        total.setCepInicio(29164500);
        total.setCepFim(29164999);
        total.setPeso(500);
        total.setUf("ES");
        total.setPraca("ESC");
        total.setIcms(17);
        total.setGris(1);
        total.setImposto(5);
        
        Vetor cadastro = new Vetor(); 
        cadastro.adiciona(tam);
        cadastro.adiciona(fedex);
        cadastro.adiciona(total);
        
        while(testes!=false){
            System.out.println("Peso do produto?");
            int peso = teclado.nextInt();
            System.out.println("CEP do Cliente?");
            int cepPedido = teclado.nextInt();
            System.out.println("Valor da nota?");
            float valorNFPedido = teclado.nextFloat();

            if(cepPedido >= tam.getCepInicio() && cepPedido <= tam.getCepFim()){
                tamFrete= true;
                System.out.println("TABELA TRANSPORTADORA TAM");
            } 
            else if(cepPedido >= fedex.getCepInicio() && cepPedido <= fedex.getCepFim()){
                fedexFrete=true;
                System.out.println("TABELA TRANSPORTADORA FEDEX");    
            }
            else if(cepPedido >= total.getCepInicio() && cepPedido <= total.getCepFim()){
                totalFrete=true;
                System.out.println("TABELA TRANSPORTADORA TOTAL");
            }            
            else {
                System.out.println("NENHUMA TRANSPORTADORA ATENDE O CEP INFORMADO");
            }
            System.out.println("NOVO TESTE: 1-SIM 2-NÃO");
            int entrada = teclado.nextInt();
            if(entrada==2){
                testes=false;
            }
            tamFrete=false;
            fedexFrete=false;
            totalFrete=false;
        }
    }   
    
}
