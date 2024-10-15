package coleçoes_parte_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaorganizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        System.out.println("Digite o nome e o sexo (M para masculino, F para feminino). Digite 'sair' para encerrar.");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                nomesMasculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, digite M ou F.");
            }
        }

        System.out.println("\nNomes Masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes Femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

