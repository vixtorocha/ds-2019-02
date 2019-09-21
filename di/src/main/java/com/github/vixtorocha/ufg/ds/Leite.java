package com.github.vixtorocha.ufg.ds;

public class Leite {

    private String fornecedor;

    public Leite(final String nomeFornecedor) {

        setFornecedor(nomeFornecedor);

    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(final String fornecedor) {
        this.fornecedor = fornecedor;
    }

}
