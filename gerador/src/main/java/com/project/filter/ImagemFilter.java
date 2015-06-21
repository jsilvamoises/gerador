package com.project.filter;


import java.util.Calendar;
import java.util.Calendar;
import  java.io.Serializable;


public class ImagemFilter implements Serializable{

       private String tipo;
       private Calendar dataUpload;
       private String base64;
       private String nome;
       private Long id;



//CONSTRUTOR
              public ImagemFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setDataUpload (Calendar dataUpload){
            this.dataUpload = dataUpload;
     }

     public void setBase64 (String base64){
            this.base64 = base64;
     }

     public void setNome (String nome){
            this.nome = nome;
     }

     public void setTipo (String tipo){
            this.tipo = tipo;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public Calendar getDataUpload (){
           return this.dataUpload;
    }
    public String getBase64 (){
           return this.base64;
    }
    public String getNome (){
           return this.nome;
    }
    public String getTipo (){
           return this.tipo;
    }
}//fim da classe