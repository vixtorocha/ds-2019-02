package com.github.vixtorocha.ufg.ds;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class NumeroTelefonicoTest {

    @Test
    public void teste() {

        NumeroTelefonico numTel = new NumeroTelefonico("55", "62", "91352895");
        Set<NumeroTelefonico> listaNumero = new HashSet<>();

        listaNumero.add(numTel);
        NumeroTelefonico outroNumTel = new NumeroTelefonico("55", "62", "91352895");

        assertTrue(listaNumero.contains(outroNumTel));
    }

}
