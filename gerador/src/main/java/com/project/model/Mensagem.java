package com.project.model;


import com.project.enums.StatusMensagemEnviada;
import java.io.Serializable;

import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Mensagem implements Serializable {

    @ManyToOne(targetEntity = Login.class)
    private Login remetende;
    @Lob
    @Basic
    private String conteudo;
    @Temporal(TemporalType.DATE)
    @Basic
    private Calendar data;
    @Basic
    private String titulo;
    @Basic
    private long classificacao;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private StatusMensagemEnviada statusMendagem;
    @ManyToOne(targetEntity = Login.class)
    private Login destinatario;

    public Mensagem() {

    }
   
    public Login getRemetende() {
        return this.remetende;
    }

    public void setRemetende(Login remetende) {
        this.remetende = remetende;
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
   
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   
    public long getClassificacao() {
        return this.classificacao;
    }

    public void setClassificacao(long classificacao) {
        this.classificacao = classificacao;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public StatusMensagemEnviada getStatusMendagem() {
        return this.statusMendagem;
    }

    public void setStatusMendagem(StatusMensagemEnviada statusMendagem) {
        this.statusMendagem = statusMendagem;
    }
   
    public Login getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(Login destinatario) {
        this.destinatario = destinatario;
    }
}
