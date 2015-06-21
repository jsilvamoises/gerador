package com.project.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PlanoUsuario implements Serializable {

    @OneToOne(targetEntity = StatusPlanoUser.class)
    private StatusPlanoUser statusPlanoUser;
    @Temporal(TemporalType.DATE)
    @Basic
    private Calendar dataAdesao;
    @Temporal(TemporalType.DATE)
    @Basic
    private Calendar dataVencimento;
    @Basic
    private double valor;
    @OneToOne(targetEntity = Plano.class)
    private Plano plano;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public PlanoUsuario() {

    }
   
    public StatusPlanoUser getStatusPlanoUser() {
        return this.statusPlanoUser;
    }

    public void setStatusPlanoUser(StatusPlanoUser statusPlanoUser) {
        this.statusPlanoUser = statusPlanoUser;
    }
   
    public Calendar getDataAdesao() {
        return this.dataAdesao;
    }

    public void setDataAdesao(Calendar dataAdesao) {
        this.dataAdesao = dataAdesao;
    }
   
    public Calendar getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
   
    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
    public Plano getPlano() {
        return this.plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
