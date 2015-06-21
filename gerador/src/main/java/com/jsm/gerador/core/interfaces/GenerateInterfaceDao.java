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
public class GenerateInterfaceDao {
    String codigo;
    private String pacote="interfaces";
    private String pacoteRaiz =Config.getPACOTE_RAIZ();

    public GenerateInterfaceDao() {
        
    }

    public void gerar() {
        System.out.println("//###############################################################################################");
        System.out.println("//####################### GERANDO INTERFACE DAO #################################################");
        System.out.println("//###############################################################################################\n");
        codigo 
                = "package "+pacoteRaiz.concat(".").concat(pacote)+";\n"
                + "\n"
                + "import java.io.Serializable;\n"
                + "import java.util.List;\n"
                + "import org.hibernate.Session;\n"
                + "import org.hibernate.criterion.DetachedCriteria;\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author Moises\n"
                + " * @param <T>\n"
                + " */\n"
                + "public interface InterfaceDao<T> {\n"
                + "\n"
                + "    boolean save(T entity);\n"
                + "\n"
                + "    boolean saveOrUpdate(T entity);\n"
                + "\n"
                + "    boolean update(T entity);\n"
                + "\n"
                + "    boolean remove(T entity);\n"
                + "\n"
                + "    boolean merge(T entity);\n"
                + "\n"
                + "    T getEntityById(Serializable id);\n"
                + "\n"
                + "    T getEntityByDetachedCriteria(DetachedCriteria criteria);\n"
                + "\n"
                + "    List<T> getEntities();\n"
                + "\n"
                + "    List<T> getEntitiesTop(int top, String campo);\n"
                + "\n"
                + "    List<T> getEntitiesByDetachetCriteria(DetachedCriteria criteria);\n"
                + "\n"
                + "    List<T> getEntitiesByQuery(String query);\n"
                + "\n"
                + "    public void commit(Session session);\n"
                + "\n"
                + "    void rollback(Session session);\n"
                + "\n"
                + "    public void begin(Session session);\n"
                + "\n"
                + "    public Session getSession();\n"
                + "\n"
                + "    List<T> getTop(int totalRest, String query);\n"
                + "   \n"
                + "\n"
                + "}\n"
                + "";
        
//        System.out.println(pacoteRaiz);
        
        String caminho =System.getProperty("user.dir").concat(Config.getPATH_JAVA()+pacoteRaiz.replace(".", "\\").concat("\\").concat(pacote).concat("\\"));
//        System.out.println(caminho);
        new CriarArquivoJava().gerarFileJavaSubstituir(caminho, codigo, "InterfaceDao");
    }

}
