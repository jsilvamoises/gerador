package com.project.filter;


import  java.io.Serializable;


public class NivelAcessoAdmFilter implements Serializable{

       private String DESCRICAO;
       private Long id;



//CONSTRUTOR
              public NivelAcessoAdmFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setDESCRICAO (String DESCRICAO){
            this.DESCRICAO = DESCRICAO;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public String getDESCRICAO (){
           return this.DESCRICAO;
    }
}//fim da classe