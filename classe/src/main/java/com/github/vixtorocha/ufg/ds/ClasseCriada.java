package com.github.vixtorocha.ufg.ds;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClasseCriada extends FileInputStream implements AutoCloseable {

    public ClasseCriada(final String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public void close() {
        throw new RuntimeException("método close chamado");
    }

}
