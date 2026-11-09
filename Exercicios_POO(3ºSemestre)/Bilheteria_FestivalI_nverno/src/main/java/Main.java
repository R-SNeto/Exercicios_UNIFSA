import model.Setor;
import model.exception.BilheteriaException;
import model.exception.CarteirinhaInvalidaException;
import model.exception.IngressoEsgotadoException;
import model.exception.SetorInexistenteException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main() {
        Map<String, Setor> setores = new LinkedHashMap<>();
        setores.put("Pista", new Setor("Pista", 200));
        setores.put("Camarote", new Setor("Camarote", 50));
        setores.put("VIP", new Setor("VIP", 5));

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("=== Bilheteria do Festival de Inverno de Pedro II ===");

            while (true) {
                listarSetores(setores);
                System.out.print("\nSetor (ou 'sair' para encerrar o dia): ");
                String entrada = sc.nextLine().trim();

                if (entrada.equalsIgnoreCase("sair")) {
                    break;
                }

                try {
                    Setor setor = buscarSetor(setores, entrada);
                    int quantidade = lerQuantidade(sc);
                    boolean meia = lerMeiaEntrada(sc);

                    setor.vender(quantidade);

                    System.out.println("Venda realizada: " + quantidade + " ingresso(s) para "
                            + setor.getNome() + (meia ? " (meia-entrada)." : "."));

                } catch (IngressoEsgotadoException e) {
                    int restam = e.getRestantes();
                    if (restam > 0) {
                        System.out.println("Não há ingressos suficientes. Posso oferecer ao cliente "
                                + restam + " ingresso(s).");
                    } else {
                        System.out.println("Setor esgotado! Ofereça outro setor ao cliente.");
                    }
                } catch (BilheteriaException e) {
                    System.out.println("Erro na bilheteria: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                } finally {

                    System.out.println("Atendimento encerrado. Próximo da fila!");
                }
            }

            imprimirRelatorio(setores);
        }
    }

    private static void listarSetores(Map<String, Setor> setores) {
        System.out.println("\n--- Setores ---");
        for (Setor s : setores.values()) {
            System.out.println(s.getNome() + ": restam " + s.getRestantes()
                    + " de " + s.getCapacidade());
        }
    }

    private static Setor buscarSetor(Map<String, Setor> setores, String nome)
            throws SetorInexistenteException {
        for (Map.Entry<String, Setor> entrada : setores.entrySet()) {
            if (entrada.getKey().equalsIgnoreCase(nome)) {
                return entrada.getValue();
            }
        }
        throw new SetorInexistenteException("Setor \"" + nome + "\" não existe. Setores disponíveis: "
                + String.join(", ", setores.keySet()) + ".");
    }

    private static int lerQuantidade(Scanner sc) {
        while (true) {
            System.out.print("Quantidade de ingressos: ");
            String texto = sc.nextLine().trim();
            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException e) {
                System.out.println("\"" + texto + "\" não é um número. Digite a quantidade em algarismos (ex.: 2).");
            }
        }
    }

    private static boolean lerMeiaEntrada(Scanner sc) throws CarteirinhaInvalidaException {
        System.out.print("Meia-entrada? (s/n): ");
        String resposta = sc.nextLine().trim();
        if (!resposta.equalsIgnoreCase("s")) {
            return false;
        }
        System.out.print("Número da carteirinha de estudante: ");
        String texto = sc.nextLine().trim();
        try {
            Long.parseLong(texto);
        } catch (NumberFormatException e) {
            throw new CarteirinhaInvalidaException(
                    "Carteirinha \"" + texto + "\" inválida: use apenas números.", e);
        }
        return true;
    }

    private static void imprimirRelatorio(Map<String, Setor> setores) {
        System.out.println("\n=== Relatório final do dia ===");
        int total = 0;
        for (Setor s : setores.values()) {
            System.out.println(s.getNome() + ": " + s.getVendidos() + " ingresso(s) vendido(s)");
            total += s.getVendidos();
        }
        System.out.println("Total geral: " + total);
    }
}
