package com.github.vixtorocha.ufg.ds;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ClasseCriadaTest {
    
    // TODO conforme está seu teste é, em inglês, "brittle" ou "frágil". Veja um bom exemplo de como fazer isso https://github.com/newtonjose/ds-2019-02/blob/master/auto-closeable/src/test/java/com/github/newtonjose/autocloseable/FileInputStreamAutoCloseableTest.java

    @Test
    void verificaCloseChamado() {
        assertThrows(RuntimeException.class, () -> {
            try (ClasseCriada obj = new ClasseCriada("tools/teste.txt")) {
            }
        });
    }

}
