package ui;

import entities.Totem;
import entities.Usuario;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private Totem t1 = new Totem("Centro de Teresina", 5, 0.50);
    private Totem t2 = new Totem("Rio Poty Shopping", 5, 0.75);
    private Totem t3 = new Totem("Teresina Shopping", 5, 0.25);
    private Totem t4 = new Totem("Riverside Shopping", 5, 0.40);
    private Totem t5 = new Totem("Cocais Shopping", 5, 0.20);

    private Totem[] totemList = {t1, t2, t3, t4, t5};

    public void menu(Scanner scanner) {
        System.out.println("Qual a sua matrícula?");
        int matricula = Integer.parseInt(scanner.nextLine());

        System.out.println("\n======================================");

        System.out.println("         TOTENS DISPONÍVEIS           ");
        System.out.println("--------------------------------------");
        for (int i = 0; i < totemList.length; i++) {
            System.out.println("ESTAÇÃO #" + (i + 1));
            System.out.println("-----");
            System.out.println(totemList[i] + "\n");
        }
        System.out.println("--------------------------------------");
        System.out.println("Seleciona uma estação (1, 2, 3, 4, 5): ");
        int opcao = Integer.parseInt(scanner.nextLine());
        Totem totemEscolhido = null;
        switch (opcao) {
            case 1 -> totemEscolhido = t1;
            case 2 -> totemEscolhido = t2;
            case 3 -> totemEscolhido = t3;
            case 4 -> totemEscolhido = t4;
            case 5 -> totemEscolhido = t5;
            default -> System.out.println("Totem inválido");
        }

        System.out.println("Qual o tempo estimado (em minutos)? ");
        int tempoEstimado = Integer.parseInt(scanner.nextLine());

        Usuario usuario = new Usuario(matricula, totemEscolhido.getNomeEstacao(), tempoEstimado, totemEscolhido);

        usuario.reciboCorrida();
    }
}
