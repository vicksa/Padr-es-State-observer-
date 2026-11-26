package state;

public class CanceladoEstado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Operacao pagar bloqueada: pedido ja cancelado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Operacao enviar bloqueada: pedido ja cancelado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Operacao entregar bloqueada: pedido ja cancelado.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Operacao cancelar bloqueada: pedido ja cancelado.");
    }

    @Override
    public void solicitarDevolucao(Pedido pedido) {
        System.out.println("Operacao solicitarDevolucao bloqueada: pedido ja cancelado.");
    }
}
