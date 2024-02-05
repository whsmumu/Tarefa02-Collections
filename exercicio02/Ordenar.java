package exercicio02;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ordenar {
    public static void main(String[] args) {
        ordenarNomes();
    }

    private static void ordenarNomes() {
        Set<String> listaNomes = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Digite os nomes (ou sair para encerrar o programa): ");
            String entrada = scan.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] nomes = entrada.split(",");

            for (String nome : nomes) {
                listaNomes.add(nome.trim().toLowerCase());
            }
        }

        scan.close();

        System.out.println("");

        listaNomes.forEach(System.out::println);
    }
}