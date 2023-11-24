/*
Joãozinho mora em uma rua que tem N casas. Marquinhos é o melhor amigo dele, mas sempre gosta de pregar peças em Joãozinho. 
Desta vez, ele pegou os dois brinquedos prediletos de Joãozinho e os escondeu em duas casas distintas da rua. 
Em compensação, Marquinhos deu uma dica importante para Joãozinho:

A soma dos números das casas em que escondi teus brinquedos é igual a K. Além disso, escolhi as casas de tal forma que 
não existe outro par de casas cuja soma tenha esse mesmo valor.

Sabendo disto, encontre qual é o par de casas em que se encontram os brinquedos de Joãozinho. Para auxiliar seu amigo, 
Marquinhos entregou a Joãozinho uma lista com o número das casas já em ordem crescente (isto é, do menor para o maior número).

Entrada
A primeira primeira linha da entrada contém um número inteiro N, que representa o número de casas que existem na rua. Cada uma 
das N linhas seguintes contém um número inteiro, representando o número de uma casa. Note que esses N números estão 
ordenados, do menor para o maior.

A última linha da entrada contém um inteiro K, que é a soma dos números das duas casas onde os brinquedos estão escondidos.

Saída
Se programa deve imprimir uma única linha, contendo dois inteiros, A e B, A<B, que representam os números das casas em que 
estão escondidos os brinquedos. Os dois números devem ser separados por um espaço em branco
*/

import java.util.*;

public class Main {
    public static void operacoes (int [] listaCasas, int quantidadeCasas, int somaNumeroCasas) {
        int somaTemp;

        for (int i = 0;  i < quantidadeCasas; i++) {
            for(int j = 0; j < quantidadeCasas; j++) {
                somaTemp = listaCasas[i] + listaCasas[j];

                if (i != j) {
                    if (somaTemp == somaNumeroCasas) {
                        if (listaCasas[i] < listaCasas[j]) {
                            System.out.println("O numero das casas é: " + listaCasas[i] + " " + listaCasas[j]);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numeroCasas;

        System.out.println("Insira a quantidade de casas existentes: ");
        int quantidadeCasas = sc.nextInt();

        System.out.println("Insira a soma dos numeros das casas escolhidas: ");
        int somaNumeroCasas = sc.nextInt();

        if (quantidadeCasas > 0) {
            int [] listaCasas = new int[quantidadeCasas];
            for (int i = 0; i < quantidadeCasas; i++) {
                System.out.println("Insira o numero da casa: ");
                numeroCasas = sc.nextInt();
                listaCasas[i] = numeroCasas;
            }

            System.out.println("Os numeros inseridos são: " + Arrays.toString(listaCasas));
            operacoes(listaCasas, quantidadeCasas, somaNumeroCasas);
        }
        else {
            System.out.println("Valor fora dos parâmetros.");
        }
    }
}
