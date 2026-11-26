# Atividade 12 - State e Observer

Implementacao em Java dos padroes comportamentais State e Observer.

## State

O pedido delega suas operacoes ao estado atual. O fluxo principal e Novo, Pago, Enviado e Entregue. Cancelamentos sao permitidos antes do envio; quando pago, o estorno e simulado. O desafio extra permite devolver somente pedidos entregues.

## Observer

A classe Acao notifica os observadores quando a cotacao muda. O painel exibe os precos, o robo simula compras e vendas e o SMS alerta variacoes bruscas. O robo se desinscreve automaticamente apos sua primeira operacao.

Valores ficticios da simulacao PETR4: preco inicial R$ 30, compra abaixo de R$ 28, venda acima de R$ 35 e alerta a partir de 5% de variacao. A simulacao VALE3 demonstra a venda separadamente.

## Execucao

Requer JDK 8 ou superior. Na raiz do repositorio:

```bash
javac -d out src/state/*.java src/observer/*.java
java -cp out state.Main
java -cp out observer.Main
```

## Diagramas de classes

- [State](diagramas/state.puml)
- [Observer](diagramas/observer.puml)

Os arquivos PlantUML podem ser visualizados com uma extensao PlantUML ou editor compativel.
