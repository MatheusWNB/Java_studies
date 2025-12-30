package atividades;

import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        class Jogador {
            int vida;
            String nome;

            void printar_nome(String arg, int arg1){
                System.out.println("Nome do jogador: "+nome);
                System.out.println("Vida do jogador: "+vida);
            }

        }

        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();

        j1.vida = 100;
        System.out.print("Digite o nome do jogador 1: ");
        j1.nome = sc1.nextLine();

        System.out.print("Digite o nome do jogador 2: ");
        j2.nome = sc1.nextLine();
        j2.vida = 150;

        j1.printar_nome(j1.nome, j1.vida);
        j2.printar_nome(j1.nome, j1.vida);

   } 
}