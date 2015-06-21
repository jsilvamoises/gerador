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
public enum StatusMensagemEnviada {

    PENDENTE("PENDENTE"),
    ENVIADA("ENVIADA"),
    VISUALIZADA("VISUALIZADA");

    private final String status;

    private StatusMensagemEnviada(String s) {
        status = s;
    }

    public String getTipo() {
        return status;
    }

    public boolean equalsName(String otherName) {
        return (otherName == null) ? false : status.equals(otherName);
    }

    @Override
    public String toString() {
        try {
            return this.status.intern();
        } catch (Exception e) {
            return "";
        }

    }

}
