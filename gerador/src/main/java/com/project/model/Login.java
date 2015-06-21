package com.project.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Login implements Serializable {

    @Basic
    private String isAtivo;
    @Column(nullable=false)
    @Basic
    private String senha;
    @Basic
    private String codigoDeValidacao;
    @OneToOne(targetEntity = Imagem.class)
    private Imagem fotoPerfil;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    @Basic
    private Calendar dataValidadeCodVerficacao;
    @Column(unique=true,updatable=false,nullable=false)
    @Basic
    private String login;
    @Basic
    private String email;
    
    private Pessoa usuario;

    public Login() {

    }
   
    public String getIsAtivo() {
        return this.isAtivo;
    }

    public void setIsAtivo(String isAtivo) {
        this.isAtivo = isAtivo;
    }
   
    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    public String getCodigoDeValidacao() {
        return this.codigoDeValidacao;
    }

    public void setCodigoDeValidacao(String codigoDeValidacao) {
        this.codigoDeValidacao = codigoDeValidacao;
    }
   
    public Imagem getFotoPerfil() {
        return this.fotoPerfil;
    }

    public void setFotoPerfil(Imagem fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public Calendar getDataValidadeCodVerficacao() {
        return this.dataValidadeCodVerficacao;
    }

    public void setDataValidadeCodVerficacao(Calendar dataValidadeCodVerficacao) {
        this.dataValidadeCodVerficacao = dataValidadeCodVerficacao;
    }
   
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
   
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa getUsuario() {
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }
}
