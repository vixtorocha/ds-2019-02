package com.github.vixtorocha.ufg.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

public class DiretorioFornecedorTest {

    @Test
    void diretorioFornecedoresInstanciaCorretamente() {
        final DiretorioFornecedores dirFornecedores = new DiretorioFornecedores();

        dirFornecedores.adiciona(new CaldasNovas());
        dirFornecedores.adiciona(new Supplier<Leite>() {

            @Override
            public Leite get() {
                // TODO Auto-generated method stub
                return new Leite("Piracanjuba");
            }

        });

        assertEquals("Caldas Novas", dirFornecedores.fornecedores().get(0));
        assertEquals("Piracanjuba", dirFornecedores.fornecedores().get(1));

    }

}
