/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core;

/**
 *
 * @author MOISES
 */
public class Config {
    //String caminho =System.getProperty("user.dir").concat(Config.getPATH_JAVA()+pacoteRaiz.replace(".", "\\").concat("\\").concat(pacote).concat("\\"));
    private static final String LOCAL_PATH = System.getProperty("user.dir");
    private static final String PATH_JAVA = "\\src\\main\\java\\";
    private static final String PATH_WEB = "\\src\\main\\webapp\\";
    private static final String PACOTE_RAIZ="com.project";
    private static final String PACOTE_APLICACAO = LOCAL_PATH.concat(PATH_JAVA).concat("").concat(PACOTE_RAIZ.replace(".", "\\")).concat("\\");
    private static final String PACOTE_WEB = LOCAL_PATH.concat(PATH_WEB).concat("\\");

    public static String getPATH_JAVA() {
        return PATH_JAVA;
    }

    public static String getPATH_WEB() {
        return PATH_WEB;
    }

    public static String getPACOTE_RAIZ() {
        return PACOTE_RAIZ;
    }

    public static String getPACOTE_APLICACAO() {
        return PACOTE_APLICACAO;
    }

    public static String getLOCAL_PATH() {
        return LOCAL_PATH;
    }

    public static String getPACOTE_WEB() {
        return PACOTE_WEB;
    }

    

}
