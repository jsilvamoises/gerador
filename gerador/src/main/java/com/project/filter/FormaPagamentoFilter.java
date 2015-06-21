package com.project.filter;


import  java.io.Serializable;


public class FormaPagamentoFilter implements Serializable{

       private String financeira;
       private String urlPagamento;
       private Long id;



//CONSTRUTOR
              public FormaPagamentoFilter(){}
//METODOS SET
     public void setId (Long id){
            this.id = id;
     }

     public void setFinanceira (String financeira){
            this.financeira = financeira;
     }

     public void setUrlPagamento (String urlPagamento){
            this.urlPagamento = urlPagamento;
     }

//METODOS GET
    public Long getId (){
           return this.id;
    }
    public String getFinanceira (){
           return this.financeira;
    }
    public String getUrlPagamento (){
           return this.urlPagamento;
    }
}//fim da classe