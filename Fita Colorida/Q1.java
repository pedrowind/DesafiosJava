import java.util.*;

public class Q1 {
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
