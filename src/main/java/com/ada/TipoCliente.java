package com.ada;

public enum TipoCliente {
    PESSOA_JURIDICA("PJ","CNPJ", 14),
    PESSOA_FISICA("PF","CPF", 11);

    private String sigla;
    private String tipoDocumento;
    private int tamanhoDocumento;
    TipoCliente(String sigla,String tipoDocumento, int tamanhoDocumento){
        this.sigla = sigla;
        this.tipoDocumento = tipoDocumento;
        this.tamanhoDocumento = tamanhoDocumento;
    }
    public boolean valdarDocumento(TipoCliente tipo, String documento) {
        if (tipo.tamanhoDocumento == documento.length()){
            return true;
        }
        return false;
    }
}
