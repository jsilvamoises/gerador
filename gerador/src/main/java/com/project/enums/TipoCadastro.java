/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.enums;

/**
 *
 * @author MOISES
 */
public enum TipoCadastro {

    CONTRATAR ("Contratar"),
    TRABALHO ("Trabalhar");

    private final String tipo;       

    private TipoCadastro(String s) {
        tipo = s;
    }

    public String getTipo() {
        return tipo;
    }
    

    public boolean equalsName(String otherName){
        return (otherName == null)? false:tipo.equals(otherName);
    }

    @Override
    public String toString(){
        try {
            return this.tipo.intern();
        } catch (Exception e) {
            return "";
        }
       
    }
    
    
    
}
