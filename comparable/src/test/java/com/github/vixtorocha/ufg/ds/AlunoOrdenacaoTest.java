package com.github.vixtorocha.ufg.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class AlunoOrdenacaoTest {

    @Test
    void ordenados() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Pedro"));
        alunos.add(new Aluno("Amarildo"));
        assertEquals("Pedro", alunos.get(0).toString());
        assertEquals("Amarildo", alunos.get(1).toString());

        Collections.sort(alunos);
        assertEquals("Amarildo", alunos.get(0).toString());
        assertEquals("Pedro", alunos.get(1).toString());
    }

    @Test
    void ordenacaoPeloTamanhoDoNome() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Aparecida"));
        alunos.add(new Aluno("Carla"));
        alunos.add(new Aluno("Xuxa"));

        Collections.sort(alunos, new AlunoOrdenadoPorTamanhoDoNome());
        assertEquals("Xuxa", alunos.get(0).toString());
        assertEquals("Carla", alunos.get(1).toString());
        assertEquals("Aparecida", alunos.get(2).toString());
    }
}
