package com.example.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_habitat")
public class Habitat {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = false, length = 200)
    private String tipo;

    @Column(nullable = false, length = 200)
    private String localizacao;

    @OneToMany(mappedBy = "habitat")
    private List<Animal> animais = new ArrayList<>();

    public Habitat(String nome, String tipo, String localizacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.localizacao = localizacao;
    }

    public void addAnimal(Animal animal) {
        animais.add(animal);
        animal.setHabitat(this);
    }
}
