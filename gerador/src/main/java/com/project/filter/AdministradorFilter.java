package com.project.filter;


import java.util.Collection;
import java.util.Collection;
import  java.io.Serializable;


public class AdministradorFilter implements Serializable{

       private Collection nivelAcessoAdm;



//CONSTRUTOR
              public AdministradorFilter(){}
//METODOS SET
     public void setNivelAcessoAdm (Collection nivelAcessoAdm){
            this.nivelAcessoAdm = nivelAcessoAdm;
     }

//METODOS GET
    public Collection getNivelAcessoAdm (){
           return this.nivelAcessoAdm;
    }
}//fim da classe