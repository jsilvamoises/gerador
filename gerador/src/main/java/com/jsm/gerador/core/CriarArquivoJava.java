/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MOISES
 */
public class CriarArquivoJava {

    public void gerarFileJava(String local, String conteudo, String nomeClasse) {
        FileOutputStream file = null;
        File f;
        try {
            new File(local).mkdir();
            System.out.println("verificando local : " + local.concat(""));
            if (!new File(local).exists()) {
                new File(local).mkdir();
            }
            file = new FileOutputStream(local.concat("" + nomeClasse.concat(".java")));
            System.err.println(local);
            int byteLido = 0;
            Long tempoInicial = new Date().getTime();
            Long tempoFinal = new Date().getTime();
            byte[] entrada = conteudo.getBytes();
            //while (byteLido = entrada.  != 0) {
            file.write(entrada);
//            if (!new File(local).exists()) {
//                
//                try {
//                    if (file != null) {
//                        file.close();
//                    }
//
//                } catch (Exception ex) {
//                    Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                
//            } else {
//               System.err.println("******Já existe um arquivo com esse nome na pasta, para substituir apague-o manualmente*****");
//            }

            System.out.println(byteLido);
            // }
            System.out.println("Duração : " + (tempoFinal - tempoInicial));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (file != null) {
                    file.close();
                }

            } catch (Exception ex) {
                Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.gc();
    }
    
    public void gerarFileXHTML(String local, String conteudo, String nomePagina) {
        FileOutputStream file = null;
        File f;
        try {
            new File(local).mkdir();
            System.out.println("verificando local : " + local.concat(""));
            if (!new File(local).exists()) {
                new File(local).mkdir();
            }
            file = new FileOutputStream(local.concat("" + nomePagina.concat(".xhtml")));
            System.err.println(local);
            int byteLido = 0;
            Long tempoInicial = new Date().getTime();
            Long tempoFinal = new Date().getTime();
            byte[] entrada = conteudo.getBytes();
            //while (byteLido = entrada.  != 0) {
            file.write(entrada);
//            if (!new File(local).exists()) {
//                
//                try {
//                    if (file != null) {
//                        file.close();
//                    }
//
//                } catch (Exception ex) {
//                    Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                
//            } else {
//               System.err.println("******Já existe um arquivo com esse nome na pasta, para substituir apague-o manualmente*****");
//            }

            System.out.println(byteLido);
            // }
            System.out.println("Duração : " + (tempoFinal - tempoInicial));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (file != null) {
                    file.close();
                }

            } catch (Exception ex) {
                Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.gc();
    }


    public void gerarFileJavaSubstituir(String local, String conteudo, String nomeClasse) {
        FileOutputStream file = null;
        File f;
        try {
            new File(local).mkdir();
            System.out.println("verificando local : " + local.concat(""));
            if (!new File(local).exists()) {
                new File(local).mkdir();
            }
            file = new FileOutputStream(local.concat("" + nomeClasse.concat(".java")));
            //System.err.println(local);
            int byteLido = 0;
            Long tempoInicial = new Date().getTime();
            Long tempoFinal = new Date().getTime();
            byte[] entrada = conteudo.getBytes();
            //while (byteLido = entrada.  != 0) {

            file.write(entrada);

            System.out.println(byteLido);
            // }
            System.out.println("Duração : " + (tempoFinal - tempoInicial));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (file != null) {
                    file.close();
                }

            } catch (Exception ex) {
                Logger.getLogger(CriarArquivoJava.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.gc();
    }

    public static void main(String[] args) {
        String caminho = System.getProperty("user.dir").concat("/src/java/");

//                System.out.println();
//        System.out.println(getClass().getResource("/src/java/com/sunrise/bicus"));
        new CriarArquivoJava().gerarFileJava(caminho, "MOISES", "Usuario");
    }

}
