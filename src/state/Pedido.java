package state;

public class Pedido {
    private EstadoPedido estadoAtual = new NovoEstado();

    public void alterarEstado(EstadoPedido novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public EstadoPedido getEstadoAtual() {
        return estadoAtual;
    }

    public void pagar() {
        estadoAtual.pagar(this);
    }

    public void enviar() {
        estadoAtual.enviar(this);
    }

    public void entregar() {
        estadoAtual.entregar(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }

    public void solicitarDevolucao() {
        estadoAtual.solicitarDevolucao(this);
    }
}
