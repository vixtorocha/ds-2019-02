package com.github.vixtorocha.ufg.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UniversidadeTest {

    @Test
    void marcadorTXT() {
        final Universidade universidade = Universidade.getInstance();
        final String[] instituicoes = universidade.getInstituicoes();

        assertEquals("INF", instituicoes[0]);
    }
}
