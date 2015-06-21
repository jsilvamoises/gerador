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
public class Imagem implements Serializable {

    @Basic
    private String tipo;
    @Temporal(TemporalType.DATE)
    @Basic
    private Calendar dataUpload;
    @Lob
    @Basic
    private String base64;
    @Basic
    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Imagem() {

    }
   
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    public Calendar getDataUpload() {
        return this.dataUpload;
    }

    public void setDataUpload(Calendar dataUpload) {
        this.dataUpload = dataUpload;
    }
   
    public String getBase64() {
        return this.base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
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
