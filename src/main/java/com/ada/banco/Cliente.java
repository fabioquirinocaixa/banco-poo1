package com.ada.banco;

import java.time.LocalDate;

public class Cliente {

    private String id;
    private String nome;
    private LocalDate dataCadastro;
    private boolean status;
    public void setId(String id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getId() {
        return id;
    }
    public void alterarNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
