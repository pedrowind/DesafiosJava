import java.util.*;

public class Q3 {
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
