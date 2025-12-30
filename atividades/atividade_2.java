package atividades;

import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double vidaJ1 = 100;
        double vidaJ2 = 150;
        String nome;

        class Jogador {
            private double vida;
            private String nome;

            public Jogador(String arg_nome, double arg_vida){
                try{ 
                    if (arg_nome == null || arg_nome.isBlank())
                        throw new IllegalArgumentException();
                    
                    this.nome = arg_nome;
                    this.vida = arg_vida;
                    
                } catch (Exception IllegalArgumentException) {
                    System.out.println("Digite um nome válido!");
                }

                
            }
            
            public void printar_nome(String arg, double arg1){
                System.out.println("Nome do jogador: "+nome);
                System.out.println("Vida do jogador: "+vida);
            }

        }
        while(true){
            System.out.print("Digite o nome do jogador 1: ");
            nome = sc1.nextLine();
            Jogador j1 = new Jogador(nome, vidaJ1);

            System.out.print("Digite o nome do jogador 2: ");
            nome = sc1.nextLine();
            Jogador j2 = new Jogador(nome, vidaJ2);

            if (j2.nome == null || j2.nome.isBlank() || j1.nome == null || j1.nome.isBlank())
                continue;

            j1.printar_nome(j1.nome, j1.vida);
            j2.printar_nome(j1.nome, j1.vida);

            break;
        }

   } 
}