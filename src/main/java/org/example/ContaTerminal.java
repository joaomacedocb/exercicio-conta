package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, boas-vindas. Por favor, digite o número da agência.");
        String agenciaForms = scanner.nextLine();

        System.out.println("Perfeito. Agora digite a sua conta:");
        int contaForms = scanner.nextInt();

        System.out.println("Agora informe o seu nome, por gentileza.");
        String nomeForms = scanner.nextLine();

        System.out.println("Certo! Qual saldo deseja inserir em sua conta?");
        double saldoForms = scanner.nextDouble();







    }
}