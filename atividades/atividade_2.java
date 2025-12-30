package atividades;

import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double vidaJ1 = 100;
        double vidaJ2 = 150;
        String nomeJ1;
        String nomeJ2;

        class Jogador {
            private double vida;
            private String nome;

            public Jogador(String arg_nome, double arg_vida){

                this.nome = arg_nome;
                this.vida = arg_vida;
                    
            }
            
            public void printar_nome(){
                System.out.println("Nome do jogador: "+this.nome);
                System.out.println("Vida do jogador: "+this.vida);
            }

        }
        while(true){
            try{
                System.out.print("Digite o nome do jogador 1: ");
                nomeJ1 = sc1.nextLine();

                if (nomeJ1 == null || nomeJ1.isBlank())
                    throw new IllegalArgumentException();
                
                System.out.print("Digite o nome do jogador 2: ");
                nomeJ2 = sc1.nextLine();
    
                if (nomeJ2 == null || nomeJ2.isBlank())
                    throw new IllegalArgumentException();

                Jogador j1 = new Jogador(nomeJ1, vidaJ1);
                Jogador j2 = new Jogador(nomeJ2, vidaJ2);

                j1.printar_nome();
                j2.printar_nome();
                
            } catch (Exception IllegalArgumentException){
                System.out.println("Digite um nome válido!");
                continue;
            }
            
            break;
        }

   } 
}