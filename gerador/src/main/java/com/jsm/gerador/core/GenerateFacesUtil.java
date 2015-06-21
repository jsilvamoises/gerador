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
public class GenerateFacesUtil {
    private static final String pacote="util";
    private final String pacoteRaiz=Config.getPACOTE_RAIZ();
    private final String pacoteCompleto;

    public GenerateFacesUtil() {        
        pacoteCompleto = pacoteRaiz.concat(".").concat(pacote);
    }

    public void gerar() {
        System.out.println("//###############################################################################################");
        System.out.println("//####################### GERANDO CLASSE FACES UTIL #############################################");
        System.out.println("//###############################################################################################\n");
        String codigo 
                = "package "+pacoteCompleto+";\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author Moises\n"
                + " */\n"
                + "\n"
                + "import javax.faces.application.FacesMessage;\n"
                + "import javax.faces.context.FacesContext;\n"
                + "import org.primefaces.context.RequestContext;\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author Moises\n"
                + " */\n"
                + "public class FacesUtil {\n"
                + "   \n"
                + "\n"
                + "    public static void addErrorMessage(String message) {\n"
                + "       FacesContext.getCurrentInstance().addMessage(null,\n"
                + "                new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message));\n"
                + "    }\n"
                + "\n"
                + "    public static void addWarnMessage(String message) {\n"
                + "        FacesContext.getCurrentInstance().addMessage(null,\n"
                + "                new FacesMessage(FacesMessage.SEVERITY_WARN, message, message));\n"
                + "    }\n"
                + "\n"
                + "    public static void addFatalMessage(String message) {\n"
                + "        FacesContext.getCurrentInstance().addMessage(null,\n"
                + "                new FacesMessage(FacesMessage.SEVERITY_FATAL, message, message));\n"
                + "    }\n"
                + "\n"
                + "    public static void addInfoMessage(String message) {\n"
                + "        FacesContext.getCurrentInstance().addMessage(null,\n"
                + "                new FacesMessage(FacesMessage.SEVERITY_INFO, message, message));\n"
                + "    }\n"
                + "    \n"
                + "    public static void showDialogMessageErro(String title, String msg){\n"
                + "        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,title,msg);\n"
                + "        RequestContext.getCurrentInstance().showMessageInDialog(message);\n"
                + "    }\n"
                + "    public static void showDialogMessageFatal(String title, String msg){\n"
                + "        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL,title,msg);\n"
                + "        RequestContext.getCurrentInstance().showMessageInDialog(message);\n"
                + "    }\n"
                + "    public static void showDialogMessageInfo(String title, String msg){\n"
                + "        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,title,msg);\n"
                + "        RequestContext.getCurrentInstance().showMessageInDialog(message);\n"
                + "    }\n"
                + "     public static void showDialogMessageWarn(String title, String msg){\n"
                + "        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN,title,msg);\n"
                + "        RequestContext.getCurrentInstance().showMessageInDialog(message);\n"
                + "    }\n"
                + "    \n"
                + "    public static boolean isNotPostback() {\n"
                + "        return !isPostBack();\n"
                + "    }\n"
                + "    \n"
                + "    public static boolean isPostBack() {\n"
                + "        return FacesContext.getCurrentInstance().isPostback();\n"
                + "    }\n"
                + "    \n"
                + "    \n"
                + "    \n"
                + "\n"
                + "}\n"
                + "";
        
       // String caminho =System.getProperty("user.dir").concat(Config.getPATH_JAVA()+pacoteRaiz.replace(".", "\\").concat("\\").concat(pacote).concat("\\"));
//        System.out.println(caminho);
     //   new CriarArquivoJava().gerarFileJava(caminho, codigo, "FacesUtil");
        
        //System.out.println(codigo);
        
         String caminho = Config.getPACOTE_APLICACAO().concat(pacote).concat("\\");
        new CriarArquivoJava().gerarFileJavaSubstituir(caminho, codigo, "FacesUtil");
        System.out.println("//###############################################################################################");
        System.out.println("//####################### CONCLUÍDO  ############################################################");
        System.out.println("//###############################################################################################\n");
        
//        System.out.println(codigo);
    }

}
