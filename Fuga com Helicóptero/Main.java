/*
Um fugitivo, um helicóptero e um policial estão em posições distintas numa pista circular, exatamente como a mostrada na figura ao lado, 
com dezesseis posições numeradas de 0 a 15 em direção anti-horária.

O helicóptero e o policial ficam sempre parados. O objetivo do fugitivo é chegar no helicóptero sem passar pelo policial antes, claro. 
Ele pode decidir correr na direção horária, ou na direção anti-horária.

Neste problema, dadas as posições do helicóptero, do policial e do fugitivo, e a direção em que o fugitivo decide correr, seu programa 
deve dizer se ele vai ou não conseguir fugir! Na figura, se o fugitivo decidir correr na direção horária, ele consegue fugir; se decidir 
correr na direção anti-horária, ele vai ser preso antes de chegar no helicóptero!

Entrada
A entrada consiste de uma linha com quatro inteiros: H, P, F e D, representando, respectivamente, as posições do helicóptero, do policial
e do fugitivo, e a direção em que o fugitivo corre, -1 para horário e 1 para anti-horário.

Saída
Seu programa deve imprimir uma linha contendo o caractere "S" se o fugitivo consegue fugir, ou "N" caso contrário

Restrições
Os inteiros H, P e F são distintos e estão entre 0 e 15, inclusive
*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira as posições: ");
        int posicaoHelicoptero = sc.nextInt();
        int posicaoPolicial = sc.nextInt();
        int posicaoFugitivo = sc.nextInt();
        int sentido = sc.nextInt();

        instrucoes(posicaoHelicoptero, posicaoPolicial, posicaoFugitivo, sentido);
    }

    public static void instrucoes (int posicaoHelicoptero, int posicaoPolicial, int posicaoFugitivo, int sentido) {
        if (sentido == 1) {
            if ((posicaoFugitivo > posicaoPolicial && posicaoHelicoptero > posicaoFugitivo) || (posicaoFugitivo > posicaoPolicial    && posicaoPolicial > posicaoHelicoptero)) {
                System.out.println("S");
            }
            else {
                System.out.println("N");
            }
        }

        else if (sentido == -1) {
            if ((posicaoFugitivo > posicaoHelicoptero && posicaoPolicial > posicaoFugitivo) || (posicaoFugitivo < posicaoHelicoptero && posicaoFugitivo < posicaoPolicial)) {
                System.out.println("S");
            }
            else {
                System.out.println("N");
            }
        }
        else {
            System.out.println("Valor fora dos parâmetros. ");
        }
    }
}
