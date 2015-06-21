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
public class GenerateHibernateUtil {

    private final String pacote = "util";
    private final String pacoteRaiz = Config.getPACOTE_RAIZ();

    public void gerar() {
        System.out.println("//###############################################################################################");
        System.out.println("//####################### GERANDO CLASSE HIBERNATE UTIL #########################################");
        System.out.println("//###############################################################################################\n");
        String codigo
                = "package " + pacoteRaiz.concat(".").concat(pacote) + ";\n"
                + "\n"
                + "import javax.enterprise.context.ApplicationScoped;\n"
                + "\n"
                + "import org.hibernate.SessionFactory;\n"
                + "import org.hibernate.boot.registry.StandardServiceRegistryBuilder;\n"
                + "import org.hibernate.cfg.Configuration;\n"
                + "import org.hibernate.service.ServiceRegistry;\n"
                + "\n"
                + "/**\n"
                + " * Hibernate Utility class with a convenient method to get Session Factory\n"
                + " * object.\n"
                + " *\n"
                + " * @author Moises\n"
                + " */\n"
                + "@ApplicationScoped\n"
                + "public class HibernateUtil {\n"
                + "\n"
                + "    private static SessionFactory sessionFactory = buildSessionFactory();\n"
                + "\n"
                + "    private static SessionFactory buildSessionFactory() {\n"
                + "        try {\n"
                + "            // Create the SessionFactory from hibernate.cfg.xml\n"
                + "            Configuration configuration = new Configuration();\n"
                + "            configuration.configure();\n"
                + "            \n"
                + "            ServiceRegistry serviveRegistre =  new StandardServiceRegistryBuilder()\n"
                + "                    .applySettings(configuration.getProperties()).build();\n"
                + "            sessionFactory = configuration.buildSessionFactory(serviveRegistre);\n"
                + "          \n"
                + "            return sessionFactory;\n"
                + "        }\n"
                + "        catch (Throwable ex) {\n"
                + "            // Make sure you log the exception, as it might be swallowed\n"
                + "            System.err.println(\"Initial SessionFactory creation failed.\" + ex);\n"
                + "            throw new ExceptionInInitializerError(ex);\n"
                + "        }\n"
                + "        \n"
                + "    }\n"
                + "\n"
                + "    public static SessionFactory getSessionFactory() {\n"
                + "        return sessionFactory;\n"
                + "    }\n"
                + "\n"
                + "}";

        String caminho = System.getProperty("user.dir").concat(Config.getPATH_JAVA() + pacoteRaiz.replace(".", "\\").concat("\\").concat(pacote).concat("\\"));
//        System.out.println(caminho);
        new CriarArquivoJava().gerarFileJavaSubstituir(caminho, codigo, "HibernateUtil");
        System.out.println("//###############################################################################################");
        System.out.println("//####################### CONCLUÍDO #############################################################");
        System.out.println("//###############################################################################################\n");

//        System.out.println(codigo);
    }

}
