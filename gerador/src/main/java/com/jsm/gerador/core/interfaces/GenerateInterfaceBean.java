/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core.interfaces;

import com.jsm.gerador.core.Config;
import com.jsm.gerador.core.CriarArquivoJava;

/**
 *
 * @author MOISES
 */
public class GenerateInterfaceBean {

    private final String pacote = "interfaces";
    private final String pacoteRaiz= Config.getPACOTE_RAIZ();

    public GenerateInterfaceBean() {
       
    }

    public void gerar() {
        System.out.println("//###############################################################################################");
        System.out.println("//####################### GERANDO INTERFACE BEAN ################################################");
        System.out.println("//###############################################################################################\n");
        String codigo
                = "package "+pacoteRaiz.concat(".").concat(pacote)+";\n"
                + "\n"
                + "import java.util.List;\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author Moises\n"
                + " */\n"
                + "public interface InterfaceBean {\n"
                + "    public void save();\n"
                + "    public void saveOrUpdate();\n"
                + "    public void delete();\n"
                + "    public void clear();\n"
                + "    public void edit();\n"
                + "    public void update();\n"
                + "    public void listAll();\n"
                + "    public void inicializar();\n"
                + "}\n"
                + "";
//        System.out.println(codigo);
        
        String caminho =System.getProperty("user.dir").concat(Config.getPATH_JAVA()+pacoteRaiz.replace(".", "\\").concat("\\").concat(pacote).concat("\\"));
//        System.out.println(caminho);
        new CriarArquivoJava().gerarFileJavaSubstituir(caminho, codigo, "InterfaceBean");
    }

}
