package com.github.vixtorocha.ufg.ds;

public class Universidade {

    private static final Universidade INSTANCIA = criaInstancia();
    private static final String nome = "Universidade Federal de Goiás";
    private static String[] instituicoes = {"INF", "FAV", "IF",};

    private static Universidade criaInstancia() {
        return new Universidade();
    }

    public static Universidade getInstance() {
        return INSTANCIA;
    }

    public static String getNome() {
        return nome;
    }

    public static String[] getInstituicoes() {
        return instituicoes;
    }

    public static void setInstituicoes(final String[] instituições) {
        Universidade.instituicoes = instituições;
    }

}
