package state;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Fluxo completo ---");
        Pedido pedido = new Pedido();
        pedido.entregar();
        pedido.enviar();
        pedido.pagar();
        pedido.pagar();
        pedido.enviar();
        pedido.cancelar();
        pedido.entregar();
        pedido.cancelar();
        System.out.println("Estado final: " + pedido.getEstadoAtual().getClass().getSimpleName());

        System.out.println("\n--- Devolucao ---");
        pedido.solicitarDevolucao();
        pedido.pagar();
        System.out.println("Estado final: " + pedido.getEstadoAtual().getClass().getSimpleName());

        System.out.println("\n--- Cancelamento com estorno ---");
        Pedido pedidoPago = new Pedido();
        pedidoPago.pagar();
        pedidoPago.cancelar();
        pedidoPago.enviar();

        System.out.println("\n--- Cancelamento antes do pagamento ---");
        Pedido pedidoNovo = new Pedido();
        pedidoNovo.cancelar();
        pedidoNovo.solicitarDevolucao();
    }
}
