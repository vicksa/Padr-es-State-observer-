package state;

public interface EstadoPedido {
    void pagar(Pedido pedido);
    void enviar(Pedido pedido);
    void entregar(Pedido pedido);
    void cancelar(Pedido pedido);
    void solicitarDevolucao(Pedido pedido);
}
