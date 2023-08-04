package Tabuleiro;

public class Peca {
    protected Posicao posicao;
    private Quadro quadro;

    public Peca(Quadro quadro) {
        this.quadro = quadro;
    }

    protected Quadro getQuadro() {
        return quadro;
    }
}
