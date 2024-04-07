package com.ada.banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String id) {

        super(id);
    }

    public double depositar(double valorAhDepositar){

        super.depositar(valorAhDepositar);
        this.rendimentoPoupanca(valorAhDepositar * 0.005);
        return this.getSaldo();
    }
}
