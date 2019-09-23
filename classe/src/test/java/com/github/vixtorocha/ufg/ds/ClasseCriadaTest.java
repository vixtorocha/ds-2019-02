package com.github.vixtorocha.ufg.ds;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ClasseCriadaTest {

    @Test
    void verificaCloseChamado() {
        assertThrows(RuntimeException.class, () -> {
            try (ClasseCriada obj = new ClasseCriada("tools/teste.txt")) {
            }
        });
    }

}
