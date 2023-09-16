// Luis Felipe Ferreira Caldarelli

package br.edu.unifil.ling.equipe.model;

public class Jogador {
    private String nomeJogador;
    private String posicao;

    public Jogador(String nomeJogador, String posicao){
        this.nomeJogador = nomeJogador;
        this.posicao = posicao;
    }
    public String getNomeJogador(){

        return this.nomeJogador;
    }
    public String getPosicao(){

        return this.posicao;
    }
    public void setNomeJogador(String novoNomeJogador){
        if(novoNomeJogador.trim().equals("")){
            System.out.println("Nome inválido.");
        }else{
            this.nomeJogador = novoNomeJogador;
        }
    }

    public void setPosicao(String novaPosicao){
        if(novaPosicao.trim().equals("")){
            System.out.println("Nome inválido.");
        }else{
            this.posicao = novaPosicao;
        }
    }
}
