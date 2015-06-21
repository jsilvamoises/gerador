package com.project.filter;


import com.project.model.Estado;
import com.project.model.Estado;
import  java.io.Serializable;


public class EnderecoFilter implements Serializable{

       private Long id;
       private String nomero;
       private String cidade;
       private Estado estado;
       private String logradouro;
       private String bairro;



//CONSTRUTOR
              public EnderecoFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setNomero (String nomero){
            this.nomero = nomero;
     }

     public void setCidade (String cidade){
            this.cidade = cidade;
     }

     public void setEstado (Estado estado){
            this.estado = estado;
     }

     public void setLogradouro (String logradouro){
            this.logradouro = logradouro;
     }

     public void setBairro (String bairro){
            this.bairro = bairro;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public String getNomero (){
           return this.nomero;
    }
    public String getCidade (){
           return this.cidade;
    }
    public Estado getEstado (){
           return this.estado;
    }
    public String getLogradouro (){
           return this.logradouro;
    }
    public String getBairro (){
           return this.bairro;
    }
}//fim da classe