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
public enum Sexo {

    MASCULINO ("Masculino"),
    FEMININO ("Feminino");

    private final String sexo;       

    private Sexo(String s) {
        sexo = s;
    }

    public String getSexo() {
        return sexo;
    }
    

    public boolean equalsName(String otherName){
        return (otherName == null)? false:sexo.equals(otherName);
    }

    @Override
    public String toString(){
        try {
            return this.sexo.intern();
        } catch (Exception e) {
            return "";
        }
       
    }
    
    
    
}
