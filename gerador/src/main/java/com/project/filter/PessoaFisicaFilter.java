package com.project.filter;


import com.project.model.PlanoUsuario;
import com.project.enums.*;
import com.project.model.PlanoUsuario;
import com.project.enums.*;
import  java.io.Serializable;


public class PessoaFisicaFilter implements Serializable{

       private boolean aceitaTermosUso;
       private String[] disponibilidadoTrabalho;
       private String RG;
       private PlanoUsuario planoUsuario;
       private String CPF;
       private String apresentacao;
       private Sexo sexo;



//CONSTRUTOR
              public PessoaFisicaFilter(){}
//METODOS SET
     public void setPlanoUsuario (PlanoUsuario planoUsuario){
            this.planoUsuario = planoUsuario;
     }

     public void setApresentacao (String apresentacao){
            this.apresentacao = apresentacao;
     }

     public void setDisponibilidadoTrabalho (String[] disponibilidadoTrabalho){
            this.disponibilidadoTrabalho = disponibilidadoTrabalho;
     }

     public void setRG (String RG){
            this.RG = RG;
     }

     public void setCPF (String CPF){
            this.CPF = CPF;
     }

     public void setSexo (Sexo sexo){
            this.sexo = sexo;
     }

     public void setAceitaTermosUso (boolean aceitaTermosUso){
            this.aceitaTermosUso = aceitaTermosUso;
     }

//METODOS GET
    public PlanoUsuario getPlanoUsuario (){
           return this.planoUsuario;
    }
    public String getApresentacao (){
           return this.apresentacao;
    }
    public String[] getDisponibilidadoTrabalho (){
           return this.disponibilidadoTrabalho;
    }
    public String getRG (){
           return this.RG;
    }
    public String getCPF (){
           return this.CPF;
    }
    public Sexo getSexo (){
           return this.sexo;
    }
}//fim da classe