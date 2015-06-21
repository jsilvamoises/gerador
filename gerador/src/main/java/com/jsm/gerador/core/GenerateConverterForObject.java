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
public class GenerateConverterForObject {

    private String pacote = "converter";
    private String pacoteRaiz = Config.getPACOTE_RAIZ();

    private String nomeClasse = "";
    private String nomeBeanClasse = "";
    private String nomeSuportClasse = "";
    Object o;

    public GenerateConverterForObject(Object o) {
        this.o = o;
        this.nomeClasse = o.getClass().getSimpleName();
        this.nomeBeanClasse = "Bean"+o.getClass().getSimpleName();
        this.nomeSuportClasse = o.getClass().getSimpleName().concat("Suport");
        gerar();
    }

    

    public void gerar() {

        System.out.println("//###############################################################################################");
        System.out.println("//####################### GERANDO CONVERSOR DA CLASSE ###########################################");
        System.out.println("//###############################################################################################\n");

        System.out.println(nomeClasse);
        System.out.println(nomeBeanClasse);
        System.out.println(nomeSuportClasse);

        String codigo = "package " + pacoteRaiz + ".converter;\n"
                + "\n"
                + "\n"
                + "import " + pacoteRaiz + ".bean." + nomeBeanClasse + ";\n"
                + "import " + pacoteRaiz + ".model." + nomeClasse + ";\n"
                + "import " + pacoteRaiz + ".suport." + nomeSuportClasse + ";\n"
                + "import javax.faces.component.UIComponent;\n"
                + "import javax.faces.context.FacesContext;\n"
                + "import javax.faces.convert.FacesConverter;\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author Moises\n"
                + " */\n"
                + "@FacesConverter(forClass = " + nomeClasse + ".class)\n"
                + "public class " + nomeClasse + "Converter implements javax.faces.convert.Converter {\n"
                + "\n"
                + "    @Override\n"
                + "    public Object getAsObject(FacesContext context, UIComponent component, String value) {\n"
                + "        " + nomeClasse + " " + nomeClasse.toLowerCase() + " = null;\n"
                + "        \n"
                + "        if(value!=null){\n"
                + "            Long id = new Long(value);\n"
                + "            return new " + nomeSuportClasse + "().getEntityById(id);\n"
                + "        }\n"
                + "        return " + nomeClasse.toLowerCase() + ";\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public String getAsString(FacesContext context, UIComponent component, Object value) {\n"
                + "        if(value!= null){\n"
                + "            Long id = ((" + nomeClasse + ")value).getId();\n"
                + "            return String.valueOf(id);\n"
                + "        }\n"
                + "        return \"\";\n"
                + "    }\n"
                + "\n"
                + "}";

        String caminho = System.getProperty("user.dir").concat(Config.getPATH_JAVA() + pacoteRaiz.replace(".", "\\").concat("\\").concat(pacote).concat("\\"));
//        System.out.println(caminho);
        new CriarArquivoJava().gerarFileJavaSubstituir(caminho, codigo, o.getClass().getSimpleName() + "Converter");

      //  System.out.println(codigo);
    }

    public static void main(String[] args) {
        // new GenerateConverterForObject(new Usuario()).gerar();
    }

}
