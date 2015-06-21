package com.project.filter;


import  java.io.Serializable;


public class StatusPlanoUserFilter implements Serializable{

       private String sigla;
       private Long id;
       private String descricao;



//CONSTRUTOR
              public StatusPlanoUserFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setSigla (String sigla){
            this.sigla = sigla;
     }

     public void setDescricao (String descricao){
            this.descricao = descricao;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public String getSigla (){
           return this.sigla;
    }
    public String getDescricao (){
           return this.descricao;
    }
}//fim da classe