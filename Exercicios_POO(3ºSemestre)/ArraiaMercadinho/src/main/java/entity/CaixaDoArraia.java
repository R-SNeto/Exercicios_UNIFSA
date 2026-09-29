package entity;

public class CaixaDoArraia {
    private static double saldoGeral;

    private static final double TAXA_SERVICO = 0.02;

    public void registrarVenda(double valor) {
        this.saldoGeral += valor + valor * TAXA_SERVICO;
    }

    public static double getSaldoGeral() {
        return saldoGeral;
    }
}
