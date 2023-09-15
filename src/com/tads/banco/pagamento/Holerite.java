package com.tads.banco.pagamento;

import com.tads.banco.entities.Pessoa;

public class Holerite implements DocumentoPagavel, DocumentoEstornavel{
    private Pessoa funcionario;
    private double valorHora;
    private int quantidadeHoras;
    private boolean pago;
    public Holerite(Pessoa funcionario, double valorHora, int quantidadeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    } @Override
    public double getValorTotal() {
        return valorHora * quantidadeHoras;
    } @Override
    public boolean estaPago() {
        return pago;
    } @Override
    public void quitarPagamento() {
        pago = true;
    }

    @Override
    public void estornarPagamento() {
        pago = false;
    }
}
