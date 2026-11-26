package observer;

public class RoboInvestidor implements ObservadorAcao {
    private final Acao acao;
    private final double alvoCompra;
    private final double tetoVenda;

    public RoboInvestidor(Acao acao, double alvoCompra, double tetoVenda) {
        this.acao = acao;
        this.alvoCompra = alvoCompra;
        this.tetoVenda = tetoVenda;
    }

    @Override
    public void atualizar(String codigoAcao, double novoPreco) {
        if (novoPreco < alvoCompra) {
            System.out.printf("Robo: COMPRA %s a R$ %.2f%n", codigoAcao, novoPreco);
            acao.removerObservador(this);
        } else if (novoPreco > tetoVenda) {
            System.out.printf("Robo: VENDA %s a R$ %.2f%n", codigoAcao, novoPreco);
            acao.removerObservador(this);
        }
    }
}
