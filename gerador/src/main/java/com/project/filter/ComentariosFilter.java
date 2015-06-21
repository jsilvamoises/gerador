package com.project.filter;


import com.project.model.Pessoa;
import java.util.Calendar;
import com.project.model.Pessoa;
import java.util.Calendar;
import  java.io.Serializable;


public class ComentariosFilter implements Serializable{

       private Pessoa de;
       private String conteudo;
       private Calendar data;
       private Pessoa para;
       private long star;
       private String titulo;
       private Long id;



//CONSTRUTOR
              public ComentariosFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setConteudo (String conteudo){
            this.conteudo = conteudo;
     }

     public void setTitulo (String titulo){
            this.titulo = titulo;
     }

     public void setDe (Pessoa de){
            this.de = de;
     }

     public void setData (Calendar data){
            this.data = data;
     }

     public void setPara (Pessoa para){
            this.para = para;
     }

     public void setStar (long star){
            this.star = star;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public String getConteudo (){
           return this.conteudo;
    }
    public String getTitulo (){
           return this.titulo;
    }
    public Pessoa getDe (){
           return this.de;
    }
    public Calendar getData (){
           return this.data;
    }
    public Pessoa getPara (){
           return this.para;
    }
    public long getStar (){
           return this.star;
    }
}//fim da classe