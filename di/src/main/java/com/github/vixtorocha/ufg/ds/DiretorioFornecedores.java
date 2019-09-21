package com.github.vixtorocha.ufg.ds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class DiretorioFornecedores {

    private final Set<Supplier<Leite>> fornecedores = new HashSet<>();

    public void adiciona(final Supplier<Leite> fornecedor) {

        fornecedores.add(fornecedor);

    }

    public List<String> fornecedores() {
        final List<String> nomes = new ArrayList<>();

        for (final Supplier<Leite> fornecedor : fornecedores) {
            final Leite leite = fornecedor.get();
            nomes.add(leite.getFornecedor());
        }

        return nomes;

    }

}
