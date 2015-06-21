package com.project.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ContasReceber implements Serializable {

    @Basic
    private double valorParcela;
    @OneToMany(targetEntity = Venda.class)
    private Collection<Venda> venda;
    @Temporal(TemporalType.DATE)
    @Basic
    private Calendar dataPagamento;
    @ManyToOne(targetEntity = FormaPagamento.class)
    private FormaPagamento formaPagamento_D;
    @Temporal(TemporalType.DATE)
    @Basic
    private Calendar dataVencimento;
    @OneToMany(targetEntity = Login.class)
    private Collection<Login> usuario;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private int parcelaNumero;
    @Basic
    private double valorTotalVenda;

    public ContasReceber() {

    }
   
    public double getValorParcela() {
        return this.valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }
   
    public Collection<Venda> getVenda() {
        return this.venda;
    }

    public void setVenda(Collection<Venda> venda) {
        this.venda = venda;
    }
   
    public Calendar getDataPagamento() {
        return this.dataPagamento;
    }

    public void setDataPagamento(Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
   
    public FormaPagamento getFormaPagamento_D() {
        return this.formaPagamento_D;
    }

    public void setFormaPagamento_D(FormaPagamento formaPagamento_D) {
        this.formaPagamento_D = formaPagamento_D;
    }
   
    public Calendar getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
   
    public Collection<Login> getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Collection<Login> usuario) {
        this.usuario = usuario;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public int getParcelaNumero() {
        return this.parcelaNumero;
    }

    public void setParcelaNumero(int parcelaNumero) {
        this.parcelaNumero = parcelaNumero;
    }
   
    public double getValorTotalVenda() {
        return this.valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }
}
