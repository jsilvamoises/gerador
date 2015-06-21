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
public class GenerateBeanForClass {

    private String pacote = "bean";
    private Object o;

    public GenerateBeanForClass(Object o) {
        this.o = o;
    }

    public void gerar() {
        String codigo
                = "package " + Config.getPACOTE_RAIZ().concat(".").concat(pacote) + ";\n"
                + "\n"
                + "import " + Config.getPACOTE_RAIZ() + ".interfaces.InterfaceBean;\n"
                + "import " + Config.getPACOTE_RAIZ() + ".model." + o.getClass().getSimpleName() + ";\n"
                + "import " + Config.getPACOTE_RAIZ() + ".suport." + o.getClass().getSimpleName() + "Suport;\n"
                + "import java.util.ArrayList;\n"
                + "import java.util.List;\n"
                + "import javax.faces.bean.ManagedBean;\n"
                + "import javax.faces.bean.ViewScoped;\n"
                + "import javax.inject.Inject;\n"
                + "\n"
                + "/**\n"
                + " *\n"
                + " * @author MOISES\n"
                + " */\n"
                + "@ManagedBean\n"
                + "@ViewScoped\n"
                + "public class Bean" + o.getClass().getSimpleName() + " implements InterfaceBean{\n"
                + "    @Inject\n"
                + "    private " + o.getClass().getSimpleName() + "Suport suport;\n"
                + "    \n"
                + "    private " + o.getClass().getSimpleName() + " " + o.getClass().getSimpleName().toLowerCase() + ";\n"
                + "    \n"
                + "    private List<" + o.getClass().getSimpleName() + "> " + o.getClass().getSimpleName().toLowerCase() + "s = new ArrayList<>();\n"
                + "\n"
                + "    public Bean" + o.getClass().getSimpleName() + "() {\n"
                + "        clear();\n"
                + "    }\n"
                + "    \n"
                + "    \n"
                + "    \n"
                + "    @Override\n"
                + "    public void clear(){\n"
                + "        " + o.getClass().getSimpleName().toLowerCase() + " = new " + o.getClass().getSimpleName() + "();\n"
                + "    }\n"
                + "    @Override\n"
                + "    public void save() {\n"
                + "         if(suport.save(" + o.getClass().getSimpleName().toLowerCase() + ")){\n"
                + "              clear();\n"
                + "              listAll();\n"
                + "          }\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public void saveOrUpdate() {\n"
                + "        suport.saveOrUpdate(" + o.getClass().getSimpleName().toLowerCase() + ");\n"
                + "        listAll();\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public void delete() {\n"
                + "        suport.remove(" + o.getClass().getSimpleName().toLowerCase() + ");\n"
                + "        listAll();\n"
                + "    }\n"
                + "\n"
                + "   \n"
                + "\n"
                + "    @Override\n"
                + "    public void edit() {\n"
                + "        throw new UnsupportedOperationException(\"Not supported yet.\"); //To change body of generated methods, choose Tools | Templates.\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public void update() {\n"
                + "        suport.update(" + o.getClass().getSimpleName().toLowerCase() + ");\n"
                + "        listAll();\n"
                + "    }\n"
                + "\n"
                + "    @Override\n"
                + "    public void  listAll() {\n"
                + "       " + o.getClass().getSimpleName().toLowerCase() + "s = suport.getEntities();\n"
                + "    }\n"
                + "\n"
                + "@Override\n"
                + "    public void inicializar() {\n"
                + "        try {\n"
                + "            if ( " + o.getClass().getSimpleName().toLowerCase() + ".getId()>0) {\n"
                + "                //FacesUtil.showDialogMessageInfo(\"\",login);\n"
                + "                 " + o.getClass().getSimpleName().toLowerCase() + " = ( " + o.getClass().getSimpleName() + ") suport.getEntityById( " + o.getClass().getSimpleName().toLowerCase() + ".getId());\n"
                + "                if ( " + o.getClass().getSimpleName().toLowerCase() + " == null) {\n"
                + "                }\n"
                + "            } else {\n"
                + "\n"
                + "                clear();\n"
                + "            }\n"
                + "        } catch (Exception e) {\n"
                + "            clear();\n"
                + "        }\n"
                + "       \n"
                + "        listAll();\n"
                + "    }"
                + "\n"
                + "    public " + o.getClass().getSimpleName() + " get" + o.getClass().getSimpleName() + "() {\n"
                + "        return " + o.getClass().getSimpleName().toLowerCase() + ";\n"
                + "    }\n"
                + "\n"
                + "    public void set" + o.getClass().getSimpleName() + "(" + o.getClass().getSimpleName() + " " + o.getClass().getSimpleName().toLowerCase() + ") {\n"
                + "        this." + o.getClass().getSimpleName().toLowerCase() + " = " + o.getClass().getSimpleName().toLowerCase() + ";\n"
                + "    }\n"
                + "\n"
                + "    public List<" + o.getClass().getSimpleName() + "> get" + o.getClass().getSimpleName() + "s() {\n"
                + "        return " + o.getClass().getSimpleName().toLowerCase() + "s;\n"
                + "    }\n"
                + "\n"
                + "    public void set" + o.getClass().getSimpleName() + "(List<" + o.getClass().getSimpleName() + "> " + o.getClass().getSimpleName().toLowerCase() + "s) {\n"
                + "        this." + o.getClass().getSimpleName().toLowerCase() + "s = " + o.getClass().getSimpleName().toLowerCase() + "s;\n"
                + "    }\n"
                + "    \n"
                + "}\n"
                + "";

        String caminho = Config.getPACOTE_APLICACAO().concat(pacote).concat("\\");
        new CriarArquivoJava().gerarFileJava(caminho, codigo, "Bean" + o.getClass().getSimpleName());

        // System.out.println(codigo);
    }

}
