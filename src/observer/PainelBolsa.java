package observer;

public class PainelBolsa implements ObservadorAcao {
    @Override
    public void atualizar(String codigoAcao, double novoPreco) {
        System.out.printf("Painel: %s - R$ %.2f%n", codigoAcao, novoPreco);
    }
}
