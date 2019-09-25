package com.github.vixtorocha.ufg.ds;

public class NumeroTelefonico {

    private String codigoPais;
    private String codigoEstado;
    private String numero;

    @Override
    public int hashCode() {
        return codigoPais.hashCode() + codigoEstado.hashCode()
                + numero.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        NumeroTelefonico outro = (NumeroTelefonico) obj;

        return codigoEstado == outro.codigoEstado
                && codigoPais == outro.codigoPais && numero == outro.numero;
    }

    public NumeroTelefonico(String pais, String estado, String numero) {
        codigoPais = pais;
        codigoEstado = estado;
        this.numero = numero;
    }

}
