package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.dao.PersistenciaJPA;

public class TesteConexao {

    public TesteConexao() {

    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
        PersistenciaJPA jpa = new PersistenciaJPA();
        if (jpa.conexaoAberta()) {
            System.out.println("Conectado ao BD");
        } else {
            System.err.println("Erro ao conectar ao banco");
        }
    }
}