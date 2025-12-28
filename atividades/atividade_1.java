package atividades;

import java.util.Scanner;

public class atividade_1 {
    static void printar_soma (double[] lista){
        for (int i = 0; i < 3; i++)
            System.out.println("Valor de ["+i+"] -> " + lista[i]);

    }
    
    static double soma (Scanner sc){
        System.out.println("Digite os valores que deseja somar: ");

        System.out.print("Número int: ");
        int a = sc.nextInt();

        System.out.print("Número double: ");
        double b = sc.nextDouble();

        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá mundo\n");

        int num = 10;
        double numdouble = 20.5;

        double soma = num + numdouble;

        System.out.println(
            "Número int -> " + num + "\n" +
            "Número double -> " + numdouble + "\n"
        );

        System.out.println("Soma de int e double -> " + soma + "\n");

        int i;

        double[] lista = new double[3];
        for (i = 0; i < 3; i++){
            System.out.println("Agora você irá adicionar na lista as somas: \n");
            lista[i] = soma(sc);
        }

        printar_soma(lista);

    }
}