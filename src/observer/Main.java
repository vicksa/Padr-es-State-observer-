package observer;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("PETR4", 30.0);
        PainelBolsa painel = new PainelBolsa();
        RoboInvestidor robo = new RoboInvestidor(acao, 28.0, 35.0);
        AlertaSMS sms = new AlertaSMS(acao.getPrecoAtual(), 5.0);

        acao.adicionarObservador(painel);
        acao.adicionarObservador(robo);
        acao.adicionarObservador(sms);

        acao.setPreco(31.0);
        acao.setPreco(27.0);
        acao.setPreco(36.0);

        System.out.println("Removendo painel...");
        acao.removerObservador(painel);
        acao.setPreco(32.0);

        System.out.println("\n--- Simulacao de venda ---");
        Acao outraAcao = new Acao("VALE3", 60.0);
        RoboInvestidor outroRobo = new RoboInvestidor(outraAcao, 55.0, 65.0);
        outraAcao.adicionarObservador(outroRobo);
        outraAcao.setPreco(66.0);
        outraAcao.setPreco(70.0);
    }
}
