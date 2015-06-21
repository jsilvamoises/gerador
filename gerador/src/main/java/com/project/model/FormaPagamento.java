package com.project.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class FormaPagamento implements Serializable {

    @Basic
    private String financeira;
    @Lob
    @Basic
    private String urlPagamento;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public FormaPagamento() {

    }
   
    public String getFinanceira() {
        return this.financeira;
    }

    public void setFinanceira(String financeira) {
        this.financeira = financeira;
    }
   
    public String getUrlPagamento() {
        return this.urlPagamento;
    }

    public void setUrlPagamento(String urlPagamento) {
        this.urlPagamento = urlPagamento;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
