package state;

public class PagoEstado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Operacao pagar bloqueada: pedido no estado Pago.");
    }

    @Override
    public void enviar(Pedido pedido) {
        pedido.alterarEstado(new EnviadoEstado());
        System.out.println("Pedido enviado.");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Operacao entregar bloqueada: pedido no estado Pago.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.alterarEstado(new CanceladoEstado());
        System.out.println("Pedido cancelado. Estorno simulado.");
    }

    @Override
    public void solicitarDevolucao(Pedido pedido) {
        System.out.println("Operacao solicitarDevolucao bloqueada: pedido no estado Pago.");
    }
}
