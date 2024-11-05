package com.example.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_observacao")
public class Observacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int id;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false, length = 200)
    private String detalhes;

    @ManyToOne
    @JoinColumn(name = "pesquisador_id", nullable = false)
    private Pesquisador pesquisador;

    // Construtor com parâmetros
    public Observacao(LocalDate data, String detalhes, Pesquisador pesquisador) {
        this.data = data;
        this.detalhes = detalhes;
        this.pesquisador = pesquisador;
    }

    // Construtor padrão exigido pela JPA
    public Observacao() {
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public Pesquisador getPesquisador() {
        return pesquisador;
    }

    public void setPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }
}
