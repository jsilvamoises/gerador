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
public class GenerateMascara {

    private final String pacote = "util";
    private final String pacoteRaiz = Config.getPACOTE_RAIZ();

    public void gerar() {
        System.out.println("//###############################################################################################");
        System.out.println("//####################### GERANDO CLASSE DE MASCARAS #############################################");
        System.out.println("//###############################################################################################\n");
        String codigo
                = "package " + pacoteRaiz.concat(".").concat(pacote) + ";\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author MOISES\n"
                + " */\n"
                + "public class Mascara {\n"
                + "    \n"
                + "    public static String getMascaraCPF(){\n"
                + "        return \"999.999.999-99\";\n"
                + "    }\n"
                + "    public static String getMascaraCNPJ(){\n"
                + "        return \"99.999.999/9999-99\";\n"
                + "    }\n"
                + "    \n"
                + "    public static String getTelefoneFixo(){\n"
                + "        return \"(99) 9999-9999\";\n"
                + "    }\n"
                + "    \n"
                + "    public static String getTelefoneCelular(){\n"
                + "        return \"(99) 9999-9999?9\";\n"
                + "    }\n"
                + "    \n"
                + "}";

        String caminho = System.getProperty("user.dir").concat(Config.getPATH_JAVA() + pacoteRaiz.replace(".", "\\").concat("\\").concat(pacote).concat("\\"));
//        System.out.println(caminho);
        new CriarArquivoJava().gerarFileJavaSubstituir(caminho, codigo, "Mascara");
        System.out.println("//###############################################################################################");
        System.out.println("//####################### CONCLUIDO #############################################################");
        System.out.println("//###############################################################################################\n");
    }

}
