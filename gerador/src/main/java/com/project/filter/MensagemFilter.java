package com.project.filter;


import com.project.model.Login;
import java.util.Calendar;
import com.project.enums.*;
import com.project.model.Login;
import java.util.Calendar;
import com.project.enums.*;
import  java.io.Serializable;


public class MensagemFilter implements Serializable{

       private Login remetende;
       private String conteudo;
       private Calendar data;
       private String titulo;
       private long classificacao;
       private Long id;
       private StatusMensagemEnviada statusMendagem;
       private Login destinatario;



//CONSTRUTOR
              public MensagemFilter(){}
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

     public void setData (Calendar data){
            this.data = data;
     }

     public void setStatusMendagem (StatusMensagemEnviada statusMendagem){
            this.statusMendagem = statusMendagem;
     }

     public void setRemetende (Login remetende){
            this.remetende = remetende;
     }

     public void setClassificacao (long classificacao){
            this.classificacao = classificacao;
     }

     public void setDestinatario (Login destinatario){
            this.destinatario = destinatario;
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
    public Calendar getData (){
           return this.data;
    }
    public StatusMensagemEnviada getStatusMendagem (){
           return this.statusMendagem;
    }
    public Login getRemetende (){
           return this.remetende;
    }
    public long getClassificacao (){
           return this.classificacao;
    }
    public Login getDestinatario (){
           return this.destinatario;
    }
}//fim da classe