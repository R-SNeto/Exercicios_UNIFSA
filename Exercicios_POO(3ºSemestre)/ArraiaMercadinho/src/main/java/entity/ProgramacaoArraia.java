package entity;

public class ProgramacaoArraia {
    private AtracaoFestival[] atracoes;
    private int quantidadeAtual;

    private static final int MAX_ATRACOES = 10;

    public ProgramacaoArraia(int quantidadeAtual) {
        this.atracoes = new AtracaoFestival[MAX_ATRACOES];
        this.quantidadeAtual = 0;
    }

    public boolean adicionarAtracao(AtracaoFestival atracao) {
        for (int i = 0; i < atracoes.length; i++) {
            if (atracoes[i] == null) {
                atracoes[i] = atracao;
                return true;
            }
        }
        return false;
    }

    public void listarProgramacao() {
        for (AtracaoFestival a : atracoes) {
            System.out.println(a);
        }
    }

    public AtracaoFestival buscarPorNome(String nome) {
        for (AtracaoFestival a : atracoes) {
            if (nome == a.getNome()) {
                return a;
            }
        }
        return null;
    }
}
