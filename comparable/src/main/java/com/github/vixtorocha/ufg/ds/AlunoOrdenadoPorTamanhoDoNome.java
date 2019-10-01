package com.github.vixtorocha.ufg.ds;

import java.util.Comparator;

public class AlunoOrdenadoPorTamanhoDoNome implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Integer.compare(o1.getNome().length(), o2.getNome().length());
    }

}
