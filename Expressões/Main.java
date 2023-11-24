/*
Pedrinho e Zezinho estão precisando estudar resolução de expressões matemáticas para uma prova que irão fazer. 
Para isso, eles querem resolver muitos exercícios antes da prova. Como sabem programar, então decidiram fazer
um gerador de expressões matemáticas.

O gerador de expressões que eles criaram funciona em duas fases. Na primeira fase é gerada uma cadeia de 
caracteres que contém apenas os caracteres '{', '[', '(', '}', ']' e ')'. Na segunda fase, o gerador adiciona 
os números e operadores na estrutura criada na primeira fase. Uma cadeia de caracteres é dita bem definida 
(ou válida) se atende as seguintes propriedades:

Ela é uma cadeia de caracteres vazia (não contém nenhum caractere).
Ela é formada por uma cadeia bem definida envolvida por parênteses, colchetes ou chaves. Portanto, se a cadeia 
S é bem definida, então as cadeias (S), [S] e {S} também são bem definidas.
Ela é formada pela concatenação de duas cadeias bem definidas. Logo, se as cadeias X e Y são bem definidas, a cadeia 
XY é bem definida. Depois que Pedrinho e Zezinho geraram algumas expressões matemáticas, eles perceberam que havia 
algum erro na primeira fase do gerador. Algumas cadeias não eram bem definidas. Eles querem começar a resolver as 
expressões o mais rápido possível, e sabendo que você é um ótimo programador resolveram pedir que escreva um programa 
que dadas várias cadeias geradas na primeira fase, determine quais delas são bem definidas e quais não são.

Entrada
A entrada é composta por diversas instâncias. A primeira linha da entrada contém um inteiro T indicando o número de 
instâncias. Em seguida temos T linhas, cada uma com uma cadeia A.

Saída
Para cada instância imprima uma linha contendo a letra 'S' se a cadeia é bem definida, ou a letra 'N' caso contrário.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de instâncias.");
        int T = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira a expressão a ser analisada: ");
        for (int t = 0; t < T; t++) {

            String input = sc.nextLine();

            if (bemDefinida(input)) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
    }
    public static boolean bemDefinida(String entrada) {
        int contadorChavesAbertura = 0;
        int contadorColchetesAbertura = 0;
        int contadorParentesesAbertura = 0;

        for (char c : entrada.toCharArray()) {
            if (c == '{') {
                contadorChavesAbertura++;
            } else if (c == '[') {
                contadorColchetesAbertura++;
            } else if (c == '(') {
                contadorParentesesAbertura++;
            } else if (c == '}') {
                contadorChavesAbertura--;
                if (contadorChavesAbertura < 0) {
                    return false;
                }
            } else if (c == ']') {
                contadorColchetesAbertura--;
                if (contadorColchetesAbertura < 0) {
                    return false;
                }
            } else if (c == ')') {
                contadorParentesesAbertura--;
                if (contadorParentesesAbertura < 0) {
                    return false;
                }
            }
        }

        return contadorChavesAbertura == 0 && contadorColchetesAbertura == 0 && contadorParentesesAbertura == 0;
    }
}
