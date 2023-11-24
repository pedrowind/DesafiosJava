/*
O hotel da Colônia de Férias dos Professores está com uma promoção para as férias de julho. A promoção é válida para
quem chegar a partir do dia 1 de julho e sair no dia 1 de agosto.

O preço da diária do hotel é menor para quem chegar mais cedo, e vai aumentando a cada dia. Mais precisamente, a
promoção funciona assim:

A diária do hotel para cada quem chegar no dia 1 é D Reais. Assim, quem chegar no dia 1 vai pagar um total de 31×D
Reais. A diária do hotel aumenta A reais por dia. Ou seja, a diária é D+A Reais para quem chegar no dia 2; D+2×A Reais
no dia 3; D+3×A Reais no dia 4 e assim por diante.

A partir do dia 16 a diária não aumenta mais.

Note que quem chegar no dia 2 vai pagar um total de 30×(D+A) reais; quem chegar no dia 3 vai pagar um total de
29×(D+2×A) reais, e assim por diante.

Bruno gosta muito da professora Vilma, e para agradá-la quer ajudá-la a planejar suas férias, escrevendo um programa
para calcular o total (em Reais) que a professora Vilma vai gastar, dependendo do dia em que chegar no hotel.

Entrada
A primeira linha contém um inteiro D, o valor da diária no dia 1. A segunda linha contém um inteiro A, o aumento da
diária a cada dia a partir do dia 2 até o dia 15 (inclusive). A terceira linha contém um inteiro N, o dia de chegada
no hotel.

Saída
Seu programa deve produzir uma única linha, contendo um único inteiro, que deve ser o valor total a ser pago ao hotel
pela estadia.
*/

import java.util.*;
public class Main {

    public static void reserva (int valorDiaria, int aumentoDiaria, int diaEntrada) {
        int valorFinal = 0;
        int diariaAtualizada;

        if (diaEntrada == 1) {
            valorFinal = 31 * valorDiaria;
        }
        else {
            if (diaEntrada <= 15) {
                diariaAtualizada = (aumentoDiaria * (diaEntrada -1)) + valorDiaria;
                valorFinal = diariaAtualizada * (32 - diaEntrada);
            }
            if (diaEntrada > 15){
                diariaAtualizada = (aumentoDiaria * 14) + valorDiaria;
                valorFinal = diariaAtualizada * (32 - diaEntrada);
            }
        }
        System.out.println("O valor total a ser pago pela estadia é: " + valorFinal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int valorDiaria = sc.nextInt();
        int aumentoDiaria = sc.nextInt();
        int diaEntrada = sc.nextInt();

        reserva(valorDiaria, aumentoDiaria, diaEntrada);
    }
}