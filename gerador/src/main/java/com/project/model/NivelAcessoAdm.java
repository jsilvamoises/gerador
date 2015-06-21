package com.project.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NivelAcessoAdm implements Serializable {

    @Basic
    private String DESCRICAO;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public NivelAcessoAdm() {

    }
   
    public String getDESCRICAO() {
        return this.DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
