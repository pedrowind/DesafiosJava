import java.util.*;

public class Q2 {
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
