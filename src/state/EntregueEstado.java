package state;

public class EntregueEstado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Operacao pagar bloqueada: pedido ja entregue.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Operacao enviar bloqueada: pedido ja entregue.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Operacao entregar bloqueada: pedido ja entregue.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Operacao cancelar bloqueada: pedido ja entregue.");
    }

    @Override
    public void solicitarDevolucao(Pedido pedido) {
        pedido.alterarEstado(new DevolvidoEstado());
        System.out.println("Devolucao registrada.");
    }
}
