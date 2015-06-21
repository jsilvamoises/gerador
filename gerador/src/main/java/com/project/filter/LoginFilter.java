package com.project.filter;


import com.project.model.Imagem;
import java.util.Calendar;
import com.project.model.Pessoa;
import com.project.model.Imagem;
import java.util.Calendar;
import  java.io.Serializable;


public class LoginFilter implements Serializable{

       private String isAtivo;
       private String senha;
       private String codigoDeValidacao;
       private Imagem fotoPerfil;
       private Long id;
       private Calendar dataValidadeCodVerficacao;
       private String login;
       private String email;
       private Pessoa usuario;



//CONSTRUTOR
              public LoginFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setUsuario (Pessoa usuario){
            this.usuario = usuario;
     }

     public void setDataValidadeCodVerficacao (Calendar dataValidadeCodVerficacao){
            this.dataValidadeCodVerficacao = dataValidadeCodVerficacao;
     }

     public void setLogin (String login){
            this.login = login;
     }

     public void setCodigoDeValidacao (String codigoDeValidacao){
            this.codigoDeValidacao = codigoDeValidacao;
     }

     public void setSenha (String senha){
            this.senha = senha;
     }

     public void setEmail (String email){
            this.email = email;
     }

     public void setIsAtivo (String isAtivo){
            this.isAtivo = isAtivo;
     }

     public void setFotoPerfil (Imagem fotoPerfil){
            this.fotoPerfil = fotoPerfil;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public Pessoa getUsuario (){
           return this.usuario;
    }
    public Calendar getDataValidadeCodVerficacao (){
           return this.dataValidadeCodVerficacao;
    }
    public String getLogin (){
           return this.login;
    }
    public String getCodigoDeValidacao (){
           return this.codigoDeValidacao;
    }
    public String getSenha (){
           return this.senha;
    }
    public String getEmail (){
           return this.email;
    }
    public String getIsAtivo (){
           return this.isAtivo;
    }
    public Imagem getFotoPerfil (){
           return this.fotoPerfil;
    }
}//fim da classe