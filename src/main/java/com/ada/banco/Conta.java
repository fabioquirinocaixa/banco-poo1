package com.ada.banco;

import java.time.LocalDate;

public class Conta {
    private String id;
    private double saldo;
    private LocalDate dataAbertura;
    private LocalDate dataAtualizacao;
    private boolean status;
    private Cliente cliente;

    public Conta(Cliente id) {

    }

    public Conta(String id) {
    }


    public double sacar(double valorAhSacar){

        this.saldo -= valorAhSacar;

        return this.saldo;

    }


    public void inativarConta(Conta conta){
        conta.inativarConta(conta);
    }

    public void ativarConta(Conta conta){
        conta.ativarConta(conta);
    }



    public double depositar(double valorAhDepositar){

        this.saldo += valorAhDepositar;

        return this.saldo;

    }

    public void rendimentoPoupanca(double valorRendimento){

        this.saldo += valorRendimento;
    }

    protected void cobrarTarifa(double valorTarifa){

        this.saldo -= valorTarifa;

    }

    public double getSaldo() {

        return saldo;

    }
}
