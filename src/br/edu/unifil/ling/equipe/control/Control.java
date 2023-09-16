// Luis Felipe Ferreira Caldarelli

package br.edu.unifil.ling.equipe.control;

import br.edu.unifil.ling.equipe.model.Equipe;
import br.edu.unifil.ling.equipe.model.Jogador;

import java.util.ArrayList;

public class Control {
    private ArrayList <Jogador> jogadores;
    private ArrayList <Equipe> equipes;
    Jogador jogadorAux;
    Equipe equipeAux = new Equipe("");

    public Control(){
        jogadores = new ArrayList <Jogador>();
        equipes = new ArrayList<Equipe>();
    }

    public ArrayList<Jogador> ListaDeJogadores(){
        return jogadores;
    }

    public void cadastrarJogador(String nomeJogador, String posicao){
        if(nomeJogador.trim().equals("") || posicao.trim().equals("") ){
            System.out.println("Nome de jogador ou posiçao inválido");
        }else{
            jogadorAux = new Jogador(nomeJogador, posicao);
            jogadores.add(jogadorAux);
            System.out.println("Jogador cadastrado.");
        }
    }

    public void cadastrarEquipe(String nomeEquipe){
        if(nomeEquipe.trim().equals("")){
            System.out.println("Nome de equipe inválido");
        }else{
            Equipe cadastroEquipe = new Equipe(nomeEquipe);
            equipes.add(cadastroEquipe);
            System.out.println("Equipe cadastrada");
        }
    }

    public void contrataJogador(String nomeEquipe, String nomeJogador){
        for(int i = 0; i<equipes.size();i++){
            equipeAux = equipes.get(i);
            if(equipeAux.getNomeEquipe().equals(nomeEquipe)){
                for (int j = 0; j < jogadores.size(); j++){
                    if (jogadores.get(j).getNomeJogador().equals(nomeJogador)){
                        equipeAux.addJogador(nomeJogador, jogadores.get(j).getNomeJogador());
                    }
                }
                System.out.println("Jogador contratado");
            }else{
                System.out.println("Não foi possível contratar o jogador");
            }
        }
    }

    public void demitirJogador(String nomeJogador, String nomeEquipe){
        for(int i = 0; i<equipes.size();i++){
            equipeAux = equipes.get(i);
            if(equipeAux.getNomeEquipe().equals(nomeEquipe)){
                for (int j = 0; j < jogadores.size(); j++){
                    if (jogadores.get(j).getNomeJogador().equals(nomeJogador)){
                        equipeAux.getJogadores().remove(j);
                    }
                }

                System.out.println("Jogador foi demitido");
            }
        }
    }

    public String mostrarJogadores(String nomeEquipe){
        String saida ="";
        for(int i = 0; i<equipes.size();i++){
            equipeAux = equipes.get(i);
            if(equipeAux.getNomeEquipe().equals(nomeEquipe)){
                for(int j = 0; j<equipeAux.getJogadores().size();j++){
                    saida = saida + equipeAux.getJogadores().get(j).getNomeJogador() + '\n';
                }
            }else{
                saida = "Equipe não foi encontrada";
            }
        }
        return saida;
    }

    public String jogadoresPos(String posicao){
        String saida = "";
        for(int i = 0; i < jogadores.size();i++){
            jogadorAux = jogadores.get(i);
            if(jogadorAux.getPosicao().equals(posicao)){
                saida = saida + jogadorAux.getNomeJogador() + '\n';
            }
        }
        return saida;
    }
}

