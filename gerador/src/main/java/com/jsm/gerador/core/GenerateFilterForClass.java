/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core;


import com.jsm.gerador.imports.GenerateImport;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MOISES
 */
public class GenerateFilterForClass {

    private String nomeDoCampo;
    private final String pacote = "filter";
    private final String pacoteRaiz = Config.getPACOTE_RAIZ();
    private HashMap<Object, Object> mapa = new HashMap<>();
    private HashMap<Object, Object> mapaCampos = new HashMap<>();
    private GenerateImport generateImport;

    Object o;

    public GenerateFilterForClass(Object o) {
        this.o = o;
        generateImport = new GenerateImport();
    }

    public void gerar() {
        System.out.println("//###############################################################################################");
        System.out.println("//####################### GERANDO FILTRO DA CLASSE ##############################################");
        System.out.println("//###############################################################################################\n");

        String codigo="package " + pacoteRaiz.concat(".").concat(pacote) + ";\n\n\n";
        
                codigo+= generateImport.gerarImportacoes(o.getClass().getDeclaredFields());
                //= "package " + pacoteRaiz.concat(".").concat(pacote) + ";\n\n\n";
                codigo += gerarImportacoes(o.getClass().getDeclaredFields());
                //+ "import  " + pacoteRaiz.concat(".model.*") + ";\n"
                codigo += "import  java.io.Serializable;\n\n\n";
        
                codigo += "public class " + o.getClass().getSimpleName().concat("Filter") + " implements Serializable{\n\n";

        Field[] field = o.getClass().getDeclaredFields();
        Method[] metodos = o.getClass().getDeclaredMethods();
        try {
            for (Field f : field) {
                mapa.put("SET" + f.getName().toUpperCase(), f.getType().getSimpleName());
                mapaCampos.put("SET" + f.getName().toUpperCase(), f.getName());
                mapaCampos.put("GET" + f.getName().toUpperCase(), f.getName());
                //System.out.println("SET"+f.getName().toUpperCase());
                codigo += "       private " + f.getType().getSimpleName() + " " + f.getName() + ";\n";
                // System.out.println(f.getType().getSimpleName() + " " + f.getName() + ";");
            }
            codigo += "\n\n\n";
            codigo += "//CONSTRUTOR\n";
            codigo += "              public " + o.getClass().getSimpleName().concat("Filter") + "(){}\n";
            codigo += "//METODOS SET\n";
            for (Method m : metodos) {
                if (m.getName().contains("set")) {

                    codigo += "     " + getModifiers(m.getModifiers()) + " " + m.getReturnType().getSimpleName() + " " + m.getName() + " (" + mapa.get(m.getName().toUpperCase()) + " " + mapaCampos.get(m.getName().toUpperCase()) + "){\n";
                    codigo += "            this." + mapaCampos.get(m.getName().toUpperCase()) + " = " + mapaCampos.get(m.getName().toUpperCase()) + ";\n";
                    codigo += "     }\n\n";
                    codigo += "";
                    codigo += "";
                    //  System.out.println("x"+m.getName().toUpperCase());
                    // System.out.println(m.getReturnType().getSimpleName().toUpperCase());
                    // System.out.println(getModifiers(m.getModifiers()) +" " + m.getReturnType().getSimpleName()+" "+m.getName()+" ("+ mapa.get(m.getName().toUpperCase())+" "+mapaCampos.get(m.getName().toUpperCase()) +"){");
                    //  System.out.println("    this."+mapaCampos.get(m.getName().toUpperCase())+" = "+mapaCampos.get(m.getName().toUpperCase())+";");
                    //  System.out.println("}");
                }
            }
            codigo += "//METODOS GET\n";
            for (Method m : metodos) {
                if (m.getName().contains("get")) {
                    codigo += "    " + getModifiers(m.getModifiers()) + " " + m.getReturnType().getSimpleName() + " " + m.getName() + " (){\n";
                    codigo += "           return this." + mapaCampos.get(m.getName().toUpperCase()) + ";\n";
                    codigo += "    }\n";
                    // System.out.println(getModifiers(m.getModifiers()) + " " + m.getReturnType().getSimpleName() + " " + m.getName() + " (){");
                    // System.out.println("    return this." + m.getName().replace("get", "") + ";");
                    //  System.out.println("}");
                }

            }
            codigo += "}//fim da classe";

            String caminho = System.getProperty("user.dir").concat(Config.getPATH_JAVA() + pacoteRaiz.replace(".", "\\").concat("\\").concat(pacote).concat("\\"));
//        System.out.println(caminho);
            new CriarArquivoJava().gerarFileJava(caminho, codigo, o.getClass().getSimpleName() + "Filter");
            //  System.out.println(codigo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getModifiers(int mod) {
        switch (mod) {
            case 1:
                return "public";
        }
        return "";
    }

    public String gerarImportacoes(Field[] f) {
        System.err.println("Verificando campos");
        Map<String, String> importaçoes = new HashMap<>();

        String retorno = "";
        for (Field campo : f) {
            if (campo.getGenericType().getTypeName().contains("java.util.Calendar")) {
                if (!importaçoes.containsKey("Calendar")) {
                    System.out.println("Incluiu importação Calendar");
                    importaçoes.put("Calendar", Calendar.class.getName());
                    retorno += generateCalendarImport();
                }
            } 
            else if (campo.getGenericType().getTypeName().contains("java.util.Collection")) {
                if (!importaçoes.containsKey("Collection")) {
                    System.out.println("Incluiu importação Collection");
                    importaçoes.put("Collection", Collection.class.getName());
                    retorno += generateCollectionImport();
                }
            }
            else if (campo.getGenericType().getTypeName().contains("enums")) {
                if (!importaçoes.containsKey("Enum")) {
                    System.out.println("Incluiu importação Enum");
                    importaçoes.put("Collection", Calendar.class.getName());
                    retorno += generateImportForEnum();
                }
            }
            else if (campo.getType().getName().contains("model")) {
                if (!importaçoes.containsKey("Model")) {
                    System.out.println("Incluiu importação Enum");
                    importaçoes.put("Model", Calendar.class.getName());
                    retorno += generateImportModels(campo);
                }
            }
        }
        return retorno;
    }

    public String generateCalendarImport() {
        return "import java.util.Calendar;\n";
    }

    public String generateCollectionImport() {
        return "import java.util.Collection;\n";
    }
    
    public String generateImportForEnum(){
        System.err.println("Importando enums");
        return "import "+Config.getPACOTE_RAIZ().concat(".enums.*;\n");
    }
    
    public String generateImportModels(Field f){
        return "import "+f.getType().getName()+";\n";
    }

}
