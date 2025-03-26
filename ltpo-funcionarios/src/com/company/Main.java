package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner exibir = new Scanner(System.in);
    Funcionario[] funcionarios = {
            new Funcionario("Luana Pereira", 3000.0, 170),
            new Funcionario("Arthur Felipe", 2800.0, 160),
            new Funcionario("Lourdes Felipe", 3500.0, 180),
            new Funcionario("Antonio Cesar", 2500.0, 155)
    };

    System.out.println("\nRelatório de Funcionários:");
    for (Funcionario funcionario : funcionarios){
        funcionario.exibirDados();
    }

    }
}
