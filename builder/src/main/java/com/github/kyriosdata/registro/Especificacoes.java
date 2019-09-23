package com.github.kyriosdata.registro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO criar os testes (não são opcionais)
public class Especificacoes {

    private List<Double> precos;
    private int anoFabricacao;
    private String marca;
    private String modelo;
    private String descricao;

    public static class Builder {
        private List<Double> precos = new ArrayList<>();
        private int anoFabricacao;
        private String marca;
        private String modelo;
        private String descricao;

        public Builder(final Double preco) {
            precos.add(preco);
        }

        public void buildAnoFabricacao(final int ano) {
            anoFabricacao = ano;
        }

        public void buildMarca(String marca) {
            this.marca = marca;
        }

        public void buildModelo(String modelo) {
            this.modelo = modelo;
        }

        public void buildDescricao(String descricao) {
            this.descricao = descricao;
        }
    }

    private Especificacoes(Builder builder) {
        precos = Collections.unmodifiableList(builder.precos);
        anoFabricacao = builder.anoFabricacao;
        marca = builder.marca;
        modelo = builder.modelo;
        descricao = builder.descricao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Double> getPrecos() {
        return precos;
    }
}
