package entities;

public class Usuario {
    private int matricula;
    private String estacaoDestino;
    private int duracaoCorrida;

    private Totem totem;

    public Usuario(int matricula, String estacaoDestino, int duracaoCorrida, Totem totem) {
        this.matricula = matricula;
        this.estacaoDestino = estacaoDestino;
        this.duracaoCorrida = duracaoCorrida;
        this.totem = totem;
    }

    public void reciboCorrida() {
        System.out.println("       RECIBO DA CORRIDA       ");
        System.out.println("===============================");
        System.out.println("Matricula: " + matricula);
        System.out.println("Estação de destino: " + estacaoDestino);
        System.out.println("Tempo estimado: " + duracaoCorrida + " min");
        System.out.println("---   ---   ---   ---   ---   ---");
        System.out.println("Valor total da corrida: " +
                String.format("%.2f", totem.valorTotalCorrida(duracaoCorrida)));
        System.out.println("===============================");
    }
}
