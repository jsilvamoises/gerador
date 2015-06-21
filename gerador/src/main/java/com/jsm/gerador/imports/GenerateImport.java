/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.imports;

import com.jsm.gerador.core.Config;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MOISES
 */
public class GenerateImport {
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
                    importaçoes.put("Enum", Calendar.class.getName());
                    retorno += generateImportForEnum();
                }
            }
            else if (campo.getType().getName().contains("model")) {
                if (!importaçoes.containsKey(campo.getType().getName())) {
                    System.out.println("Incluiu importação Enum");
                    importaçoes.put(campo.getType().getName(), Calendar.class.getName());
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
