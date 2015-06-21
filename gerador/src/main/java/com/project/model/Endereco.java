package com.project.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class Endereco implements Serializable {
    private Long id;
    @Basic
    private String nomero;
    @Basic
    private String cidade;
    @OneToOne(targetEntity = Estado.class)
    private Estado estado;
    @Basic
    private String logradouro;
    @Basic
    private String bairro;

    public Endereco() {

    }
   
    public String getNomero() {
        return this.nomero;
    }

    public void setNomero(String nomero) {
        this.nomero = nomero;
    }
   
    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
   
    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
   
    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
   
    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
