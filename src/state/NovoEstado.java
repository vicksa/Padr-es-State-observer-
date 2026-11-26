package state;

public class NovoEstado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        pedido.alterarEstado(new PagoEstado());
        System.out.println("Pagamento confirmado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Operacao enviar bloqueada: pedido no estado Novo.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Operacao entregar bloqueada: pedido no estado Novo.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.alterarEstado(new CanceladoEstado());
        System.out.println("Pedido cancelado.");
    }

    @Override
    public void solicitarDevolucao(Pedido pedido) {
        System.out.println("Operacao solicitarDevolucao bloqueada: pedido no estado Novo.");
    }
}
