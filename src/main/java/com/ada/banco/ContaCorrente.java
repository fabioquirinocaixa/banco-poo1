package com.ada.banco;

import com.ada.TipoCliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(String id){

        super(id);
    }

    public double sacar(double valorAhSacar) {

        super.sacar(valorAhSacar);


        TipoCliente tipoCliente = TipoCliente.PESSOA_FISICA;
        this.cobrarTarifa(valorAhSacar * 0.002);

        TipoCliente tipoCliente1 = TipoCliente.PESSOA_JURIDICA;
        this.cobrarTarifa(valorAhSacar * 0.005);

        return this.getSaldo();

    }

}
