package com.project.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class PessoaJuridica extends Pessoa implements Serializable {

    @OneToOne(targetEntity = PlanoUsuario.class)
    private PlanoUsuario planoUsuario;
    @Basic
    private String CNPJ;

    public PessoaJuridica() {

    }
   
    public PlanoUsuario getPlanoUsuario() {
        return this.planoUsuario;
    }

    public void setPlanoUsuario(PlanoUsuario planoUsuario) {
        this.planoUsuario = planoUsuario;
    }
   
    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
