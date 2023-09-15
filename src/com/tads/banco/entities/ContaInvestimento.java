package com.tads.banco.entities;

public class ContaInvestimento extends Conta{


    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public void debitarMensal() {
        if(getSaldo()<10_000){
            sacar(30);
        }
    }

    public void creditarRendimento(double percentualJuros){
        double valorRendimento = getSaldo() * percentualJuros /100;
        depositar(valorRendimento);
    }
}
