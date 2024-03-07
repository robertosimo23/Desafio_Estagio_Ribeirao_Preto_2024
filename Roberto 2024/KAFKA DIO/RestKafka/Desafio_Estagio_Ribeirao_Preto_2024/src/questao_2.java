import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INFORME UM NÚMERO PARA VERIFICAR NA SEQUÊNCIA DE FIBONACCI:  ");
        int numeroParaVerificar = scanner.nextInt();
        if (pertenceAFibonacci(numeroParaVerificar)) {
            System.out.println(" O número " + " " + numeroParaVerificar + " " + " pertence á sequência de Fibonacci.");
        } else {
            System.out.println("O número " + " " + numeroParaVerificar + " " + "não pertence á sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean pertenceAFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }
        int anterior = 0;
        int atual = 1;
        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual == numero;
    }
}
//Projeto Feito por Roberto Simões