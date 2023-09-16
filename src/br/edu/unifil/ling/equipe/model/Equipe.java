// Luis Felipe Ferreira Caldarelli

package br.edu.unifil.ling.equipe.model;

import br.edu.unifil.ling.equipe.model.Jogador;

import java.util.ArrayList;

public class Equipe {
    private int id;
    private String nomeEquipe;
    private ArrayList <Jogador> jogadoresEquipe;
    private static int proxmoId = 1;
    Jogador jogadorAux;


    public Equipe(String nomeEquipe){
        this.nomeEquipe = nomeEquipe;
        this.id = proxmoId;
        proxmoId++;
        jogadoresEquipe = new ArrayList<Jogador>();
    }

    //métodos get

    public ArrayList<Jogador> getJogadores(){
        return this.jogadoresEquipe;
    }

    public String getNomeEquipe(){
        return this.nomeEquipe;
    }

    public void setNomeEquipe(String novoNomeEquipe){
        if(novoNomeEquipe.trim().equals("")){
            System.out.println("Novo nome da Equipe é invalido");
        }else {
            this.nomeEquipe = novoNomeEquipe;
            System.out.println("Nome da equipe atualizado");
        }
    }
    public static int getProxId(){
        return proxmoId;
    }

    public void addJogador(String nomeJogador, String posJogador){
        Jogador Novojogador = new Jogador(nomeJogador, posJogador);
        jogadoresEquipe.add(Novojogador);
    }

    public void removeJogador(String nomeJogador, String posJogador){
        Jogador jogadorAux = new Jogador(nomeJogador, posJogador);
        jogadoresEquipe.remove(jogadorAux);
    }

    public String listarJogadores(String nomeJogador, String posJogador){
        String saida = "";
        for(int i = 0; i<jogadoresEquipe.size();i++){
            jogadorAux = jogadoresEquipe.get(i);
            saida = saida + jogadorAux.getNomeJogador() + '\n';
        }
        return saida;
    }

    public String getJogador(String nomeJogador, String posJogador){
        String saida = "";
        for(int i = 0; i<jogadoresEquipe.size();i++){
            jogadorAux = jogadoresEquipe.get(i);
            if(jogadorAux.getNomeJogador().equals(nomeJogador)){
                saida = this.jogadorAux.getNomeJogador()+'\n'+this.jogadorAux.getPosicao();
            }else{
                saida = "Jogador não encontrado.";
            }
        }
        return saida;
    }
}
