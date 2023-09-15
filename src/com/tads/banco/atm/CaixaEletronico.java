package com.tads.banco.atm;

import com.tads.banco.entities.Conta;
import com.tads.banco.pagamento.DocumentoEstornavel;
import com.tads.banco.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: "+conta.getSaldo());
        System.out.println("Títular: "+conta.getTitular());
        System.out.println("Saldo: "+conta.getSaldo());
        System.out.println("Saldo Disponível: "+conta.getSaldoDisponivel());

    }

    public void pagar(DocumentoPagavel documento, Conta conta) {
        if (documento.estaPago()) {
            throw new IllegalStateException("Documento já está pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta) {
        if (!documento.estaPago()) {
            throw new IllegalStateException("Documento não está pago");
        } conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }


}
