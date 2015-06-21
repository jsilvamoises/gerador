package com.project.filter;


import java.util.Collection;
import java.util.Calendar;
import com.project.model.FormaPagamento;
import java.util.Collection;
import java.util.Calendar;
import com.project.model.FormaPagamento;
import  java.io.Serializable;


public class ContasReceberFilter implements Serializable{

       private double valorParcela;
       private Collection venda;
       private Calendar dataPagamento;
       private FormaPagamento formaPagamento_D;
       private Calendar dataVencimento;
       private Collection usuario;
       private Long id;
       private int parcelaNumero;
       private double valorTotalVenda;



//CONSTRUTOR
              public ContasReceberFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setValorParcela (double valorParcela){
            this.valorParcela = valorParcela;
     }

     public void setDataPagamento (Calendar dataPagamento){
            this.dataPagamento = dataPagamento;
     }

     public void setUsuario (Collection usuario){
            this.usuario = usuario;
     }

     public void setParcelaNumero (int parcelaNumero){
            this.parcelaNumero = parcelaNumero;
     }

     public void setVenda (Collection venda){
            this.venda = venda;
     }

     public void setFormaPagamento_D (FormaPagamento formaPagamento_D){
            this.formaPagamento_D = formaPagamento_D;
     }

     public void setDataVencimento (Calendar dataVencimento){
            this.dataVencimento = dataVencimento;
     }

     public void setValorTotalVenda (double valorTotalVenda){
            this.valorTotalVenda = valorTotalVenda;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public double getValorParcela (){
           return this.valorParcela;
    }
    public Calendar getDataPagamento (){
           return this.dataPagamento;
    }
    public Collection getUsuario (){
           return this.usuario;
    }
    public int getParcelaNumero (){
           return this.parcelaNumero;
    }
    public Collection getVenda (){
           return this.venda;
    }
    public FormaPagamento getFormaPagamento_D (){
           return this.formaPagamento_D;
    }
    public Calendar getDataVencimento (){
           return this.dataVencimento;
    }
    public double getValorTotalVenda (){
           return this.valorTotalVenda;
    }
}//fim da classe