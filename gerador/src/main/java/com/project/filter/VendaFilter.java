package com.project.filter;


import java.util.Calendar;
import com.project.model.Plano;
import java.util.Collection;
import com.project.enums.*;
import java.util.Calendar;
import com.project.model.Plano;
import java.util.Collection;
import com.project.enums.*;
import  java.io.Serializable;


public class VendaFilter implements Serializable{

       private Calendar data;
       private int numeroParcelas;
       private double valor;
       private Plano plano;
       private Long id;
       private Collection login;
       private StatusVenda status;



//CONSTRUTOR
              public VendaFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setLogin (Collection login){
            this.login = login;
     }

     public void setData (Calendar data){
            this.data = data;
     }

     public void setNumeroParcelas (int numeroParcelas){
            this.numeroParcelas = numeroParcelas;
     }

     public void setValor (double valor){
            this.valor = valor;
     }

     public void setPlano (Plano plano){
            this.plano = plano;
     }

     public void setStatus (StatusVenda status){
            this.status = status;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public Collection getLogin (){
           return this.login;
    }
    public Calendar getData (){
           return this.data;
    }
    public int getNumeroParcelas (){
           return this.numeroParcelas;
    }
    public double getValor (){
           return this.valor;
    }
    public Plano getPlano (){
           return this.plano;
    }
    public StatusVenda getStatus (){
           return this.status;
    }
}//fim da classe