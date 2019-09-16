package com.github.vixtorocha.ufg.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class UniversidadeTest {

    UniversidadeTest() {
        fazTesteFalharDesmonstraQuebraDeEncapsulamento();
    }

    void fazTesteFalharDesmonstraQuebraDeEncapsulamento() {
        Universidade.setInstituicoes(null);
    }

    @Test
    void recuperaInstancia() {
        final Universidade universidade = Universidade.getInstance();
        final String[] instituicoes = universidade.getInstituicoes();
        assertEquals("INF", instituicoes[0]);
    }

    @Test
    void instanciasRecuperadasSaoIguais() {
        final Universidade u1 = Universidade.getInstance();
        final Universidade u2 = new Universidade();

        assertSame(u1, u2, "não podem existir duas instâncias");
    }
}
