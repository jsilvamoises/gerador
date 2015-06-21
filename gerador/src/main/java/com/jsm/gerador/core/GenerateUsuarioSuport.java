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
public class GenerateUsuarioSuport {

    String codigo;
    private final String pacote = "suport";
    private final String pacoteRaiz = Config.getPACOTE_RAIZ();
    private final Object o;

    public GenerateUsuarioSuport(Object o) {
        this.o = o;
    }

    public void gerar() {
        System.out.println("//###############################################################################################");
        System.out.println("//####################### GERANDO USUARIO SUPORT ################################################");
        System.out.println("//###############################################################################################\n");
        codigo
                = "package "+pacoteRaiz.concat(".").concat(pacote)+";\n"
                + "\n"
                + "import "+pacoteRaiz+".dao.Dao;\n"
                + "import "+pacoteRaiz+".interfaces.InterfaceDao;\n"
                + "import "+pacoteRaiz+".model."+o.getClass().getSimpleName()+";\n"
                + "import java.io.Serializable;\n"
                + "import java.util.List;\n"
                + "import org.hibernate.Session;\n"
                + "import org.hibernate.criterion.DetachedCriteria;\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author MOISES\n"
                + " */\n"
                + "public class "+o.getClass().getSimpleName()+"Suport implements InterfaceDao {\n"
                + "    \n"
                + "    private InterfaceDao<"+o.getClass().getSimpleName()+"> Dao() {\n"
                + "        InterfaceDao<"+o.getClass().getSimpleName()+"> dao = new Dao<>("+o.getClass().getSimpleName()+".class);\n"
                + "        return dao;\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public boolean save(Object entity) {\n"
                + "        return Dao().save(("+o.getClass().getSimpleName()+") entity);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public boolean saveOrUpdate(Object entity) {\n"
                + "        return Dao().saveOrUpdate(("+o.getClass().getSimpleName()+") entity);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public boolean update(Object entity) {\n"
                + "        return Dao().update(("+o.getClass().getSimpleName()+") entity);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public boolean remove(Object entity) {\n"
                + "        return Dao().remove(("+o.getClass().getSimpleName()+") entity);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public boolean merge(Object entity) {\n"
                + "        return Dao().merge(("+o.getClass().getSimpleName()+") entity);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public Object getEntityById(Serializable id) {\n"
                + "        return Dao().getEntityById(id);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public Object getEntityByDetachedCriteria(DetachedCriteria criteria) {\n"
                + "        return Dao().getEntityByDetachedCriteria(criteria);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public List getEntities() {\n"
                + "        return Dao().getEntities();\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public List getEntitiesTop(int top, String campo) {\n"
                + "        return Dao().getEntitiesTop(top, campo);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public List getEntitiesByDetachetCriteria(DetachedCriteria criteria) {\n"
                + "        return Dao().getEntitiesByDetachetCriteria(criteria);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public List getEntitiesByQuery(String query) {\n"
                + "        return Dao().getEntitiesByQuery(query);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public void commit(Session session) {\n"
                + "        Dao().commit(session);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public void rollback(Session session) {\n"
                + "        Dao().rollback(session);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public void begin(Session session) {\n"
                + "        Dao().begin(session);\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public Session getSession() {\n"
                + "       return Dao().getSession();\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public List getTop(int totalRest, String query) {\n"
                + "       return Dao().getTop(totalRest, query);\n"
                + "    }\n"
                + "    \n"
                + "}";
        
 //       String caminho =System.getProperty("user.dir").concat(Config.getPATH_JAVA()+pacoteRaiz.replace(".", "\\").concat("\\").concat(pacote).concat("\\"));
//        System.out.println(caminho);
        String caminho = Config.getPACOTE_APLICACAO().concat(pacote).concat("\\");
        new CriarArquivoJava().gerarFileJava(caminho, codigo, o.getClass().getSimpleName().concat("Suport"));
        
    }
}
