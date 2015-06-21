package com.project.model;


import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public abstract class Pessoa implements Serializable {

    @Basic
    private String telefoneFixo;
    @ElementCollection
    private Collection<Endereco> endereco;
    @Basic
    private String celular;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(targetEntity = Login.class)
    private Login login;
    @Basic
    private String nomeCompleto;

    public Pessoa() {

    }
   
    public String getTelefoneFixo() {
        return this.telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
   
    public Collection<Endereco> getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Collection<Endereco> endereco) {
        this.endereco = endereco;
    }
   
    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public Login getLogin() {
        return this.login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
   
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
