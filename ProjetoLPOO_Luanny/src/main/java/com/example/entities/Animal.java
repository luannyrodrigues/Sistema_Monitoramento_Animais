package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = false, length = 200)
    private String nomeCientifico;

    @Column(nullable = false, length = 200)
    private String status;

    @ManyToOne
    private Habitat habitat;

    public Animal(String nome, String nomeCientifico, String status) {
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.status = status;
    }

    public Animal() {

    }

    public void setHabitat(Habitat h) {
        this.habitat = h;
    }
}
