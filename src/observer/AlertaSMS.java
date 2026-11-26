package observer;

public class AlertaSMS implements ObservadorAcao {
    private double precoAnterior;
    private final double limitePercentual;

    public AlertaSMS(double precoInicial, double limitePercentual) {
        this.precoAnterior = precoInicial;
        this.limitePercentual = limitePercentual;
    }

    @Override
    public void atualizar(String codigoAcao, double novoPreco) {
        if (precoAnterior != 0) {
            double variacao = (novoPreco - precoAnterior) / precoAnterior * 100;
            if (Math.abs(variacao) >= limitePercentual) {
                System.out.printf("SMS: %s variou %+.2f%%. Novo preco: R$ %.2f%n",
                        codigoAcao, variacao, novoPreco);
            }
        } else if (novoPreco != 0) {
            System.out.printf("SMS: %s mudou de zero para R$ %.2f%n", codigoAcao, novoPreco);
        }
        precoAnterior = novoPreco;
    }
}
