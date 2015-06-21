package com.project.filter;


import  java.io.Serializable;


public class PaisFilter implements Serializable{

       private String continente;
       private String codigo;
       private String sigla;
       private String nome;
       private Long id;



//CONSTRUTOR
              public PaisFilter(){}
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

     public void setContinente (String continente){
            this.continente = continente;
     }

     public void setCodigo (String codigo){
            this.codigo = codigo;
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
    public String getContinente (){
           return this.continente;
    }
    public String getCodigo (){
           return this.codigo;
    }
}//fim da classe