package com.project.filter;


import com.project.model.Pais;
import com.project.model.Pais;
import  java.io.Serializable;


public class EstadoFilter implements Serializable{

       private String sigla;
       private Long id;
       private String nome;
       private Pais pais;



//CONSTRUTOR
              public EstadoFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setSigla (String sigla){
            this.sigla = sigla;
     }

     public void setNome (String nome){
            this.nome = nome;
     }

     public void setPais (Pais pais){
            this.pais = pais;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public String getSigla (){
           return this.sigla;
    }
    public String getNome (){
           return this.nome;
    }
    public Pais getPais (){
           return this.pais;
    }
}//fim da classe