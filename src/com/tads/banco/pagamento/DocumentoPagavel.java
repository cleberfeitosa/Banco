package com.tads.banco.pagamento;

public interface DocumentoPagavel {

    double getValorTotal();
    boolean estaPago();

    void estornarPagamento();

    void quitarPagamento();

    default void imprimirRecibo() {
        System.out.println("RECIBO:");
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Pago: " + estaPago());
    }
}
