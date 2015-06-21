package com.project.model;


import com.project.enums.StatusVenda;
import java.io.Serializable;

import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda implements Serializable {

    @Temporal(TemporalType.DATE)
    @Basic
    private Calendar data;
    @Basic
    private int numeroParcelas;
    @Basic
    private double valor;
    @OneToOne(targetEntity = Plano.class)
    private Plano plano;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(targetEntity = Login.class)
    private Collection<Login> login;
    @Basic
    @Enumerated(EnumType.STRING)
    private StatusVenda status;
 
    public Venda() {

    }
   
    public Calendar getData() {
        return this.data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
   
    public int getNumeroParcelas() {
        return this.numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
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
   
    public Collection<Login> getLogin() {
        return this.login;
    }

    public void setLogin(Collection<Login> login) {
        this.login = login;
    }
   
    public StatusVenda getStatus() {
        return this.status;
    }

    public void setStatus(StatusVenda status) {
        this.status = status;
    }
}
