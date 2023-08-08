package br.senai.sp.diario;

import java.util.Objects;
import java.util.Scanner;

public class Diario {

    public static void main(String[] args) {

        /** Declarar as Variaveis */

        String professor;
        String disciplina;
        String nomeAluno;
        int frequencia;
        int nota1;
        int nota2;
        float media;
        String situacao;

        /** Instanciar teclado Scanner */

        Scanner teclado = new Scanner(System.in);

        /** Coletat Dados */



        System.out.println("=====================================\n");
        System.out.println("Olá Prof°, Seja Bem-Vindo!");
        System.out.print("Informe seu nome: ");
        professor = teclado.nextLine();
        System.out.print("Informe a disciplina: ");
        disciplina = teclado.nextLine();
        System.out.print("Informe o nome do aluno: ");
        nomeAluno = teclado.nextLine();
        System.out.print("Informe qual é a Frequência: ");
        frequencia = teclado.nextInt();
        System.out.print("Informe a nota 1: ");
        nota1 = teclado.nextInt();
        System.out.print("Informe a nota 2: ");
        nota2 = teclado.nextInt();
        System.out.println("\n=====================================");

        /** Calcula a Media do Aluno */

        media = (nota1 +nota2)/2;

        /** Define Condição do Aluno */

        boolean avaliaProf = professor.equals("Vitor");


        if (media >= 7 && frequencia >= 75 && !avaliaProf || media >= 6 && frequencia >=90 && !avaliaProf ) {

            situacao = "Aprovado!";

        }else{

            situacao = "Reprovado!";

        }

        System.out.println("\n------------ RELATÓRIO DO ALUNO ------------\n");
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Professor: " + professor);
        System.out.println("A Frequência do Aluno é: " + frequencia );
        System.out.println("A nota 1 é: " +nota1);
        System.out.println("A nota 2 é: " +nota2);
        System.out.println("A média do aluno é: " + media);
        System.out.println("O Aluno " + nomeAluno + " está: " + situacao);
        System.out.println("\n----------------------------------------------");


    }

}
