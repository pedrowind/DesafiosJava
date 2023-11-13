import java.util.*;
public class Q4 {

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
/*
        System.out.println("Insira a posição do Helicoptero: ");
                int posicaoHelicoptero = sc.nextInt();
                System.out.println("Insira a posição do Policial: ");
                int posicaoPolicial = sc.nextInt();
                System.out.println("Insira a posição do Fugitivo: ");
                int posicaoFugitivo = sc.nextInt();
                System.out.println("Insira a direção que será percorrida: (-1 horário, 1 anti-horário) ");
                int sentido = sc.nextInt();
*/
