package com.project.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pais implements Serializable {

    @Basic
    private String continente;
    @Basic
    private String codigo;
    @Basic
    private String sigla;
    @Basic
    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Pais() {

    }
   
    public String getContinente() {
        return this.continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
   
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
   
    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
   
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
