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
public enum DisponibilidadeTrabalho {

    SEGUNGA("segunda feira"),
    TERCA("terça feira"),
    QUARTA("quarta feira"),
    QUINTA("quinta feira"),
    SEXTA("sexta feira"),
    SABADO("sabado"),
    DOMINGOS("domingo"),
    FERIADOS("feriados"),
    QUALQUER_DIA("sem restrição");

    private final String disponibilidade;

    private DisponibilidadeTrabalho(String s) {
        disponibilidade = s;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : disponibilidade.equals(otherName);
    }

    @Override
    public String toString() {
        try {
            return this.disponibilidade.intern();
        } catch (Exception e) {
            return "";
        }

    }

}
