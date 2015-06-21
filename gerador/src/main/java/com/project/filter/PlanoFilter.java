package com.project.filter;


import  java.io.Serializable;


public class PlanoFilter implements Serializable{

       private Double valor;
       private String nomePlano;
       private Long id;



//CONSTRUTOR
              public PlanoFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setValor (Double valor){
            this.valor = valor;
     }

     public void setNomePlano (String nomePlano){
            this.nomePlano = nomePlano;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public Double getValor (){
           return this.valor;
    }
    public String getNomePlano (){
           return this.nomePlano;
    }
}//fim da classe