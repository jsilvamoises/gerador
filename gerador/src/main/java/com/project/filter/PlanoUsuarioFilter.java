package com.project.filter;


import com.project.model.StatusPlanoUser;
import java.util.Calendar;
import com.project.model.Plano;
import com.project.model.StatusPlanoUser;
import java.util.Calendar;
import  java.io.Serializable;


public class PlanoUsuarioFilter implements Serializable{

       private StatusPlanoUser statusPlanoUser;
       private Calendar dataAdesao;
       private Calendar dataVencimento;
       private double valor;
       private Plano plano;
       private Long id;



//CONSTRUTOR
              public PlanoUsuarioFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setDataVencimento (Calendar dataVencimento){
            this.dataVencimento = dataVencimento;
     }

     public void setStatusPlanoUser (StatusPlanoUser statusPlanoUser){
            this.statusPlanoUser = statusPlanoUser;
     }

     public void setValor (double valor){
            this.valor = valor;
     }

     public void setPlano (Plano plano){
            this.plano = plano;
     }

     public void setDataAdesao (Calendar dataAdesao){
            this.dataAdesao = dataAdesao;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public Calendar getDataVencimento (){
           return this.dataVencimento;
    }
    public StatusPlanoUser getStatusPlanoUser (){
           return this.statusPlanoUser;
    }
    public double getValor (){
           return this.valor;
    }
    public Plano getPlano (){
           return this.plano;
    }
    public Calendar getDataAdesao (){
           return this.dataAdesao;
    }
}//fim da classe