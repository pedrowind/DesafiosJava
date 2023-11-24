/*
Roberto tem um conjunto de lápis com 10 tons diferentes de uma mesma cor, numerados de 0 a 9. 
Numa fita quadriculada, alguns quadrados foram coloridos inicialmente com o tom 0.

Roberto precisa determinar, para cada quadrado Q não colorido, qual é a distância dele para o quadrado 
mais próximo de tom 0. A distância entre dois quadrados é definida com o número mínimo de movimentos para 
a esquerda, ou para a direita, para ir de um quadrado para o outro. O quadrado Q, então, deve ser colorido 
com o tom cuja numeração corresponde à distância determinada. Se a distância for maior ou igual a 9, o quadrado
deve ser colorido com o tom 9. Seu programa deve colorir e imprimir a fita quadriculada dada na entrada.

Entrada
A primeira linha da entrada contém apenas um inteiro N, indicando o número de quadrados da fita. A segunda linha 
contém N números inteiros: “-1” se o quadrado não está colorido, e “0” se está colorido com o tom 0.

Saída
Seu programa deve escrever na saída a fita totalmente colorida, de acordo com a regra definida acima.
*/

import java.util.*;

public class Main {
    public static int[] calculaDistancias(int[] vetor, int valor) {
        int[] distancias = new int[vetor.length];
        List<Integer> posicoesZero = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                posicoesZero.add(i);
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (posicoesZero.isEmpty()) {
                distancias[i] = -1;
            }
            else {
                int menorDistancia = Integer.MAX_VALUE;

                for (int posicaoZero : posicoesZero) {
                    int distancia = Math.abs(i - posicaoZero);
                    if (distancia < menorDistancia) {
                        menorDistancia = distancia;
                    }
                }
                distancias[i] = menorDistancia;
            }
        }
        return distancias;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de elementos que serão armazenados no vetor: ");
        int n = sc.nextInt();

        if (n > 0) {
            int[] vetor = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Insira o valor que será armazenado no vetor");
                int valor = sc.nextInt();
                vetor[i] = valor;
            }

            System.out.println("O vetor é: " + Arrays.toString(vetor));
            int[] distancias = calculaDistancias(vetor, 0);

            System.out.println("Distâncias para o valor zero: " + Arrays.toString(distancias));
        }
        else {
            System.out.println("A quantidade de elementos deve ser maior que zero.");
        }
    }
}
