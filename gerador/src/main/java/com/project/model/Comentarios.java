package com.project.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comentarios implements Serializable {

    @Basic
    private Pessoa de;
    @Lob
    @Basic
    private String conteudo;
    @Temporal(TemporalType.DATE)
    @Basic
    private Calendar data;
    @Basic
    private Pessoa para;
    @Basic
    private long star;
    @Basic
    private String titulo;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Comentarios() {

    }
   
    public Pessoa getDe() {
        return this.de;
    }

    public void setDe(Pessoa de) {
        this.de = de;
    }
   
    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
   
    public Calendar getData() {
        return this.data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
   
    public Pessoa getPara() {
        return this.para;
    }

    public void setPara(Pessoa para) {
        this.para = para;
    }
   
    public long getStar() {
        return this.star;
    }

    public void setStar(long star) {
        this.star = star;
    }
   
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
