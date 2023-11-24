/*
Os dentistas são extremamente meticulosos em seu trabalho, tendo que agir com muita precisão em todas as suas
atividades. Pedro é um dentista meticuloso como todos os outros. Infelizmente sua secretária não é muito organizada e,
com o intuito de ajudar sempre os pacientes, aceita que eles marquem consultas no horário que quiserem, sem se
preocupar com os demais horários marcados, ocasionando vários conflitos de horários que muito incomodaram Pedro e os
pacientes. Por exemplo, se uma consulta começar às 9 horas e durar 2 horas, nenhuma outra consulta deveria ser marcada
para iniciar as 10 horas.

Ao perceber que sua agenda tinha conflito de horários, Pedro pediu sua ajuda para descobrir a maior quantidade de
consultas que podem ser atendidas sem sobreposição.

Você deve escrever um programa que, dados os horários de início e término das consultas agendadas pela secretária,
responda a quantidade máxima de consultas que podem ser atendidas sem sobreposição.

Entrada
A primeira linha da entrada contém um inteiro N que indica quantas consultas a secretária marcou.
Cada uma das N linhas seguintes contém um par de inteiros X e Y separados por um espaço em branco que representam,
respectivamente, o horário de início e de término da consulta. Considere que se uma consulta inicia no exato instante
em que outra termina não há sobreposição. Os horários de início são fornecidos em ordem, podendo haver mais de uma
consulta que inicie no mesmo horário.

Saída
Seu programa deve imprimir uma única linha, contendo um inteiro que representa a quantidade máxima de consultas que
podem ser atendidas sem que haja qualquer sobreposição.
*/


import java.util.*;
public class Main {

    public static void consultas (int quantidadeConsultas, int[] horarioInicio, int[] horarioFim) {
        int fimAtual = horarioFim[0];
        int contadorDeSucessos = 1;

        for (int i = 1; i < quantidadeConsultas; i++) {
            if (horarioInicio[i] >= fimAtual) {
                contadorDeSucessos++;
                fimAtual = horarioFim[i];
            }
        }
        System.out.println("O numero de consultas que podem ser atendidas sem sobreposição é: " + contadorDeSucessos);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int quantidadeConsultas = sc.nextInt();
        int[] horarioInicio = new int [quantidadeConsultas];
        int[] horarioFim = new int[quantidadeConsultas];

        for (int i = 0; i < quantidadeConsultas; i++) {

            horarioInicio[i] = sc.nextInt();
            horarioFim[i] = sc.nextInt();
        }
        consultas(quantidadeConsultas, horarioInicio, horarioFim);
    }
}
