package coleçoes_parte_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class coleçoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes (digite 'fechar' para encerrar):");

        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fechar")) {
                break;
            }
            nomes.add(nome);
        }

        Collections.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}