package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_ave")
public class Ave extends Animal {

    @Column
    private double envergadura;

    @Column
    private String tipoBico;

    @Column
    private boolean podeVoar;

    @Column
    private boolean migratoria;

    public Ave(String nome, String nomeCientifico, String status, double envergadura, String tipoBico, boolean podeVoar,
            boolean migratoria) {
        super(nome, nomeCientifico, status);
        this.envergadura = envergadura;
        this.tipoBico = tipoBico;
        this.podeVoar = podeVoar;
        this.migratoria = migratoria;
    }

    public Ave() {

    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }

    public boolean isMigratoria() {
        return migratoria;
    }

    public void setMigratoria(boolean migratoria) {
        this.migratoria = migratoria;
    }
}
