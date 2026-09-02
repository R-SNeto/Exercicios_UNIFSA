import ui.Menu;

import java.util.Scanner;

public class AppBikeTerminal {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Inicializando APPBIKE...");

        Menu menu = new Menu();
        menu.menu(scanner);

    }
}
