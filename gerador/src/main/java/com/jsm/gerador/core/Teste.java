/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core;

//import org.hibernate.Hibernate;

import java.lang.reflect.Field;
import java.util.Calendar;

/**
 *
 * @author MOISES
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new Teste().teste();
        new Teste().procurarLetraMaiuscula();
    }

    void teste() {
//        int i = 0;
//        Calendar c;
//       // Field[] f = new MensagemFilter().getClass().getDeclaredFields();
//        System.out.println();
//        for (Field campo : f) {
//            System.out.println(campo.getType().getName().contains("model"));
//            System.out.println(campo.getType().getName());
//            //System.out.println(">>"+campo.getAnnotatedType().getType().getTypeName());
////            System.out.println(campo.getGenericType().getClass().getAnnotations());
////            System.out.println(++i+" - "+campo.getGenericType().getTypeName());
//            if (campo.getGenericType().getTypeName().contains("enums")) {
//                System.out.println("\n\nEnum\n\n" + campo.toGenericString());
//            }
//        }

//        System.out.println(Calendar.class.getName());
//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(getClass().getResource("\\").getFile());
//        System.out.println(getClass().getResource("/src/java/com/sunrise/bicus"));
    }

    public void procurarLetraMaiuscula() {
        String palavra = "";
        String m = "moisesJuvenalDaSilva";
        int size = m.length();
//        char[] palavra = new char[size];
        for (int i = 0; i < size; i++) {
            if (m.substring(i, i + 1).equals(upper(m.substring(i, i + 1))) || i==0) {
                palavra+=" " + m.substring(i, i + 1).toUpperCase();
               // System.out.print(" " + m.substring(i, i + 1).toUpperCase());
            } else {
                palavra+=m.substring(i, i + 1);
                //System.out.print(m.substring(i, i + 1));
            }
        }
        
        System.out.println(palavra);

    }

    public String upper(String s) {
        return s.toUpperCase();
    }

}
