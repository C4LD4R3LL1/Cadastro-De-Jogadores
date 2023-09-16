// Luis Felipe Ferreira Caldarelli

package br.edu.unifil.ling.equipe.view;

import br.edu.unifil.ling.equipe.control.Control;
import br.edu.unifil.ling.equipe.model.Equipe;
import br.edu.unifil.ling.equipe.model.Jogador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        String nomeJogador="", posicao ="", nomeEquipe = "";
        Control controleAux = new Control();
        Jogador jogadorAux = new Jogador("", "");


        Scanner teclado = new Scanner(System.in);
        while(opcao != 9){
            System.out.println("Escolha uma Opção:");
            System.out.println("1 – Cadastrar Jogador");
            System.out.println("2 – Cadastrar Equipe");
            System.out.println("3 – Contratar Jogador");
            System.out.println("4 – Demitir Jogador");
            System.out.println("5 – Listar jogadores de uma Equipe");
            System.out.println("6 – Listar jogadores por Posição");
            System.out.println("9 – Finalizar");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){

                case 1:
                    System.out.println("CADASTRAR JOGADOR:");
                    System.out.println("Nome do Jogador?");
                    jogadorAux.setNomeJogador(teclado.nextLine());
                    System.out.println("Posiçao do Jogador?");
                    jogadorAux.setPosicao(teclado.nextLine());
                    controleAux.cadastrarJogador(jogadorAux.getNomeJogador(), jogadorAux.getPosicao());
                    break;

                case 2:
                    System.out.println("CADASTRAR EQUIPE:");
                    System.out.println("Nome da Equipe?");
                    nomeEquipe = teclado.nextLine();
                    controleAux.cadastrarEquipe(nomeEquipe);
                    break;

                case 3:
                    System.out.println("CONTRATAR JOGADOR:");
                    System.out.println("Nome da Equipe?");
                    nomeEquipe = teclado.nextLine();
                    System.out.println("Nome do jogador?");
                    nomeJogador = teclado.nextLine();
                    controleAux.contrataJogador( nomeEquipe, nomeJogador);
                    break;

                case 4:
                    System.out.println("DEMITIR JOGADOR:");
                    System.out.println("Nome da Equipe?");
                    nomeEquipe = teclado.nextLine();
                    System.out.println("Nome do Jogador?");
                    nomeJogador = teclado.nextLine();
                    controleAux.demitirJogador(nomeJogador, nomeEquipe);
                    break;

                case 5:
                    System.out.println("LISTAR JOGADORES DE UMA EQUIPE:");
                    System.out.println("Nome da Equipe?");
                    nomeEquipe = teclado.nextLine();
                    String ListaMostrar = controleAux.mostrarJogadores(nomeEquipe);
                    System.out.println("JOGADORES:");
                    System.out.println(ListaMostrar);
                    break;

                case 6:
                    System.out.println("LISTAR JOGADRES POR POSIÇÃO:");
                    System.out.println("Qual a Posição?");
                    posicao = teclado.nextLine();
                    String ListaPosicao = controleAux.jogadoresPos(posicao);
                    System.out.println("JOGADORES:");
                    System.out.println(ListaPosicao);
                    break;


                case 9:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opção Invalida");
                    break;


            }
        }
    }
}