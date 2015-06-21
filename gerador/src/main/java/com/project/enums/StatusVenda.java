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
public enum StatusVenda {

    PENDENTE("PENDENTE"),
    CANCELADA("CANCELADA"),
    BLOQUEADA("BLOQUEADA"),
    ATIVA("ATIVA");

    private final String status;

    private StatusVenda(String s) {
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
