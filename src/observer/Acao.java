package observer;

import java.util.ArrayList;
import java.util.List;

public class Acao {
    private final String codigo;
    private double precoAtual;
    private final List<ObservadorAcao> observadores = new ArrayList<>();

    public Acao(String codigo, double precoAtual) {
        this.codigo = codigo;
        this.precoAtual = precoAtual;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void adicionarObservador(ObservadorAcao obs) {
        if (!observadores.contains(obs)) {
            observadores.add(obs);
        }
    }

    public void removerObservador(ObservadorAcao obs) {
        observadores.remove(obs);
    }

    public void setPreco(double novoPreco) {
        if (Double.compare(precoAtual, novoPreco) != 0) {
            precoAtual = novoPreco;
            notificarObservadores();
        }
    }

    private void notificarObservadores() {
        for (ObservadorAcao obs : new ArrayList<>(observadores)) {
            obs.atualizar(codigo, precoAtual);
        }
    }
}
