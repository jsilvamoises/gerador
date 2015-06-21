package com.project.filter;


import com.project.model.PlanoUsuario;
import com.project.model.PlanoUsuario;
import  java.io.Serializable;


public class PessoaJuridicaFilter implements Serializable{

       private PlanoUsuario planoUsuario;
       private String CNPJ;



//CONSTRUTOR
              public PessoaJuridicaFilter(){}
//METODOS SET
     public void setPlanoUsuario (PlanoUsuario planoUsuario){
            this.planoUsuario = planoUsuario;
     }

     public void setCNPJ (String CNPJ){
            this.CNPJ = CNPJ;
     }

//METODOS GET
    public PlanoUsuario getPlanoUsuario (){
           return this.planoUsuario;
    }
    public String getCNPJ (){
           return this.CNPJ;
    }
}//fim da classe