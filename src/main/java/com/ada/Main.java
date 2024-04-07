package com.ada;

import com.ada.banco.ContaCorrente;
import com.ada.banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("1");
        conta1.depositar(100);
        double saldo1 = conta1.sacar(10);
        System.out.println("Saldo da Conta Corrente: " + saldo1);
        ContaPoupanca conta2 = new ContaPoupanca("2");
        double saldo2 = conta2.depositar(200);
        // Saque da Conta Poupança sem taxa
        double saldo3 = conta2.sacar(20);
        System.out.println("Saldo da Conta Poupança: " + saldo3);
    }
}