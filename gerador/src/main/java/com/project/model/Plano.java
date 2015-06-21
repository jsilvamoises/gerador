package com.project.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plano implements Serializable {

    @Basic
    private Double valor;
    @Basic
    private String nomePlano;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Plano() {

    }
   

   
    public String getNomePlano() {
        return this.nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
