/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core;

import com.project.model.Administrador;
import com.project.model.Comentarios;
import com.project.model.ContasReceber;
import com.project.model.Endereco;
import com.project.model.Estado;
import com.project.model.FormaPagamento;
import com.project.model.Imagem;
import com.project.model.Login;
import com.project.model.Mensagem;
import com.project.model.NivelAcessoAdm;
import com.project.model.Pais;
import com.project.model.PessoaFisica;
import com.project.model.PessoaJuridica;
import com.project.model.Plano;
import com.project.model.PlanoUsuario;
import com.project.model.StatusPlanoUser;
import com.project.model.Venda;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MOISES
 */
public class GenerateXHTMLPage {

    Map<String, String> mapa;
    private String corpo;
    private String nomeBean;

    public GenerateXHTMLPage() {
    }

    private Object[] objeto = new Object[17];

    public static final String HEADER_COMPLETE_PAGE = "<?xml version='1.0' encoding='UTF-8' ?>\n"
            + "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
            + "<html xmlns=\"http://www.w3.org/1999/xhtml\"\n"
            + "      xmlns:h=\"http://xmlns.jcp.org/jsf/html\"\n"
            + "      xmlns:p=\"http://primefaces.org/ui\""
            + "      xmlns:ui=\"http://xmlns.jcp.org/jsf/facelets\"\n"
            + "      xmlns:f=\"http://xmlns.jcp.org/jsf/core\">\n";

    public static final String HEADER_UI_COMPOSITION_PAGE = "<?xml version='1.0' encoding='UTF-8' ?>\n"
            + "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
            + "<ui:composition xmlns=\"http://www.w3.org/1999/xhtml\"\n"
            + "      xmlns:h=\"http://xmlns.jcp.org/jsf/html\"\n"
            + "      xmlns:p=\"http://primefaces.org/ui\""
            + "      xmlns:ui=\"http://xmlns.jcp.org/jsf/facelets\"\n"
            + "      xmlns:f=\"http://xmlns.jcp.org/jsf/core\">\n";

    public String HEADER
            = "    <h:head>\n"
            + "        <title>Title</title>\n"
            + "        <link rel=\"stylesheet\" href=\"resources/css/fulo.css\"/>\n"
            + "        <f:event listener=\"#{" + nomeBean + ".inicializar()}\" type=\"preRenderView\"\n/>"
            + "        <f:param  name=\"statusplanouser\" value=\"#{beanStatusPlanoUser.statusPlanoUser}\"/>"
            + "    </h:head>\n"
            + "            <h:body>\n"
            + "               <h:form>\n";

    public static String RODAPE
            = "               </h:form>\n"
            + "            </h:body>\n"
            + "</html>";
    public static String RODAPE_UI_COMPOSITION
            = "</ui:composition>";

    private static final String PARENTESES = "\"";

    public void criarXHTML(Object objetct) {

        //System.out.println(HEADER_COMPLETE_PAGE);
        System.out.println(HEADER);
        GenerateXHTMLPage.this.gerarTags(objetct);
        System.out.println(corpo);
        System.out.println(RODAPE);
    }

    private void gerarTags(Object o) {
        nomeBean = "bean" + o.getClass().getSimpleName();
        corpo = "";

        corpo += HEADER_UI_COMPOSITION_PAGE;
        // corpo += HEADER;
        System.out.println("//###############################################################################################");
        System.out.println("//####################### GERANDO PAGINA XHTML ##################################################");
        System.out.println("//###############################################################################################\n");
        //Field[] campos = o.getClass().getDeclaredFields();
        //Method[] metrodos = o.getClass().getMethods();
        Method[] m = o.getClass().getDeclaredMethods();
        Field[] f = o.getClass().getDeclaredFields();
        corpo+= generateToolBar(o);
        corpo += "               <p:fieldset >\n";
        corpo += "                 <section id=" + PARENTESES + o.getClass().getName().toUpperCase().replace(".", "-") + PARENTESES + ">\n";
        corpo += "                    <p:panelGrid columns=" + PARENTESES + "2" + PARENTESES + ">\n";

//        for (Method mm : m) {
//            if (mm.getName().contains("set")) {
//
//                String objeto = o.getClass().getSimpleName().toLowerCase().substring(0, 1).toLowerCase();
//                objeto += o.getClass().getSimpleName().substring(1, o.getClass().getSimpleName().length());
//                
//                String nomeCampo =  mm.getName().replace("set", "");
//                nomeCampo = o.getClass().getSimpleName().toLowerCase().substring(0, 1).toLowerCase();
//                nomeCampo += o.getClass().getSimpleName().substring(1, o.getClass().getSimpleName().length());
//
//                corpo += "                       <p:outputLabel value=" + PARENTESES + mm.getName().toUpperCase().replace("SET", "") + PARENTESES + " for=" + PARENTESES + mm.getName().toLowerCase().replace("set", "") + PARENTESES + "/>\n";
//                corpo += "                       <p:inputText id=" + PARENTESES + mm.getName().toLowerCase().replace("set", "") + PARENTESES + "value=\"#{bean" + o.getClass().getSimpleName().concat(".").concat(objeto).concat(".").concat(nomeCampo) + "}\"" + "/>\n";
//                // System.out.println("                       <p:inputText id=" + PARENTESES + mm.getName().toLowerCase().replace("set", "") + PARENTESES + " value=" + PARENTESES +"#{bean"+ o.getClass().getSimpleName()+"."+o.getClass().getSimpleName().toLowerCase()+"."+mm.getName().replace("set", "")+"}" + PARENTESES + "/>");
//            }
//
//        }
        for (Field ff : f) {
            //if (mm.getName().contains("set")) {

            String objeto = o.getClass().getSimpleName().toLowerCase().substring(0, 1).toLowerCase();
            objeto += o.getClass().getSimpleName().substring(1, o.getClass().getSimpleName().length());

            String nomeCampo = ff.getName().replace("set", "");
            nomeCampo = o.getClass().getSimpleName().toLowerCase().substring(0, 1).toLowerCase();
            nomeCampo += o.getClass().getSimpleName().substring(1, o.getClass().getSimpleName().length());

            corpo += "                       <p:outputLabel value=" + PARENTESES + ff.getName().toUpperCase().replace("SET", "") + PARENTESES + " for=" + PARENTESES + ff.getName().toLowerCase().replace("set", "") + PARENTESES + "/>\n";
            corpo += "                       <p:inputText id=" + PARENTESES + ff.getName().toLowerCase().replace("set", "") + PARENTESES + " value=\"#{bean" + o.getClass().getSimpleName().concat(".").concat(objeto).concat(".").concat(ff.getName()) + "}\"" + "/>\n";
            // System.out.println("                       <p:inputText id=" + PARENTESES + mm.getName().toLowerCase().replace("set", "") + PARENTESES + " value=" + PARENTESES +"#{bean"+ o.getClass().getSimpleName()+"."+o.getClass().getSimpleName().toLowerCase()+"."+mm.getName().replace("set", "")+"}" + PARENTESES + "/>");
            //}

        }

        corpo += "                     </p:panelGrid>\n";
        corpo += "                   </section> \n";
        corpo += "                 </p:fieldset>\n";
        corpo += RODAPE_UI_COMPOSITION;

        String caminho = Config.getPACOTE_WEB().concat("forge").concat("\\");
        new CriarArquivoJava().gerarFileXHTML(caminho.concat(o.getClass().getSimpleName().toLowerCase().concat("\\")), corpo, o.getClass().getSimpleName().toLowerCase());
        System.out.println(corpo);
        System.gc();
    }

    public static void main(String[] args) {
        //new GenerateXHTMLPage().gerarTags(new PessoaFisica());
        new GenerateXHTMLPage().gerar();
    }

    private void gerar() {
        objeto[0] = new Administrador();
        objeto[1] = new Comentarios();
        objeto[2] = new ContasReceber();
        objeto[3] = new Endereco();
        objeto[4] = new Estado();
        objeto[5] = new PessoaFisica();
        objeto[6] = new Imagem();
        objeto[7] = new FormaPagamento();
        objeto[8] = new PessoaJuridica();
        objeto[9] = new Login();
        objeto[10] = new Mensagem();
        objeto[11] = new NivelAcessoAdm();
        objeto[12] = new Pais();
        objeto[13] = new Venda();
        objeto[14] = new PlanoUsuario();
        objeto[15] = new Plano();
        objeto[16] = new StatusPlanoUser();
        gerarView();
        gerarTable();

    }

    public void gerarView() {

        for (Object object : objeto) {
            GenerateXHTMLPage.this.gerarTags(object);

//            new GenerateFilterForClass(object).gerarTags();
//            new GenerateConverterForObject(object).gerarTags();
//            new GenerateUsuarioSuport(object).gerarTags();
//            new GenerateBeanForClass(object).gerarTags();
        }
    }

    public void gerarTable() {
        nomeBean = "bean" + objeto.getClass().getSimpleName();
        mapa = new HashMap<>();
        Method[] m = objeto.getClass().getDeclaredMethods();

        System.out.println("Iniciando captura dos nomes dos metodos");
//        for (Method met : m) {
////            mapa.put(met.getName().toUpperCase(), met.getName());
////            System.out.println(">>" + met.getName());
////        }
////        for (Field fie : f) {
////            mapa.put(fie.getName(), fie.getName());
////        }

        for (Object o : objeto) {

            String nomeObj = o.getClass().getSimpleName().toLowerCase().substring(0, 1).toLowerCase();
            nomeObj += o.getClass().getSimpleName().substring(1, o.getClass().getSimpleName().length());

            String variavelLista = o.getClass().getSimpleName().toLowerCase();
            String obj = o.getClass().getName();
            nomeBean = "bean" + o.getClass().getSimpleName();
            corpo = "";
            corpo += HEADER_COMPLETE_PAGE;

            corpo
                    += "    <h:head>\n"
                    + "        <title>Title</title>\n"
                    + "        <link rel=\"stylesheet\" href=\"resources/css/fulo.css\"/>\n"
                    + "        <f:metadata>\n"
                    + "            <f:event listener=\"#{" + nomeBean + ".inicializar()}\" type=\"preRenderView\"/>\n"
                    + "            <f:viewParam  name=\"" + o.getClass().getSimpleName().toLowerCase() + "\" value=\"#{" + nomeBean + "." + nomeObj + "}\"/>\n"
                    + "        </f:metadata>"
                    + "    </h:head>\n"
                    + "            <h:body>\n"
                    + "               <h:form>\n"
                    + "               <p:growl id=\"growl\" showDetail=\"true\" sticky=\"true\" /> \n";

            // corpo += HEADER;
            System.out.println("//###############################################################################################");
            System.out.println("//####################### GERANDO TABELA XHTML ##################################################");
            System.out.println("//###############################################################################################\n");
            //inclui a pagina de cadastro acima da tabelan
            corpo += "                      <p:fieldset>\n";

            corpo += "                            <ui:include src=\"../" + o.getClass().getSimpleName().toLowerCase() + "/" + o.getClass().getSimpleName().toLowerCase() + ".xhtml\"/>\n";
            corpo += "                       </p:fieldset>\n";

            //gera os botoes de comando
            corpo += generateDefautButons(o);

//            corpo += "                      <p:fieldset>\n";
//            corpo += "                           <p:commandButton value=\"Add\"/>\n";
//            corpo += "                       </p:fieldset>\n";
            String nomeLista = o.getClass().getSimpleName().toLowerCase().substring(0, 1).toLowerCase();
            nomeLista += o.getClass().getSimpleName().substring(1, o.getClass().getSimpleName().length());

            Field[] f = o.getClass().getDeclaredFields();

            corpo += "                     <p:dataTable value=\"#{bean" + o.getClass().getSimpleName() + "." + nomeLista + "s}\" var=\"" + variavelLista + "\">\n";
            for (Field ff : f) {
                corpo += "                          <p:column headerText=\"" + ff.getName().toLowerCase() + "\">\n";
                corpo += "                                <h:outputText value=\"#{" + variavelLista + "." + ff.getName() + "}\"/>\n";
                corpo += "                          </p:column>\n";
            }
            corpo += "                                <p:column headerText=\"*\">\n";
            corpo += "                                      <p:button icon=\"ui-icon-pencil\" outcome=\"" + o.getClass().getSimpleName().toLowerCase() + "_lista.html\">\n";
            corpo += "                                            <f:param name=\"" + o.getClass().getSimpleName().toLowerCase() + "\" value=\"#{" + variavelLista + ".id}\"/>\n";
            corpo += "                                      </p:button>\n";

            corpo += "                                </p:column>\n";

            corpo += "                    </p:dataTable>\n";

            corpo += "       ";
            corpo += RODAPE;

            String caminho = Config.getPACOTE_WEB().concat("forge").concat("\\");
            new CriarArquivoJava().gerarFileXHTML(caminho.concat(o.getClass().getSimpleName().toLowerCase().concat("\\")), corpo, o.getClass().getSimpleName().toLowerCase().concat("_lista"));
            System.out.println(corpo);
            System.gc();
        }

    }

    private String getMapKey(String key) {
        return mapa.get(key).replace("GET", "");
    }

    public void gerarComandos() {
    }

    private String generateToolbarPage(Object o) {
        String xtml = "";
        return xtml;
    }

    public String generateDefautButons(Object o) {
        String buttons = "";
        buttons += "                      <p:fieldset>\n";
        buttons += "                           <p:commandButton value=\"Salvar\" action=\"#{bean" + o.getClass().getSimpleName() + ".save()}\" update=\"@form growl\"/>\n";
        buttons += "                           <p:commandButton value=\"Limpar\" action=\"#{bean" + o.getClass().getSimpleName() + ".clear()}\" update=\"@form growl\"/>\n";
        buttons += "                           <p:commandButton value=\"Excluir\" action=\"#{bean" + o.getClass().getSimpleName() + ".delete()}\" update=\"@form growl\"/>\n";
        buttons += "                       </p:fieldset>\n";

        return buttons;
    }

    public String generateToolBar(Object o) {
        String titulo = TitleForToolbar(o.getClass().getSimpleName());
        String xhtml = "";
        xhtml = "              <p:toolbar>\n"
                + "                <f:facet name=\"left\">\n"
                + "                    <h:outputText value=\""+titulo+"\"/>\n"
                + "                </f:facet>\n"
                + "                <f:facet name=\"right\">\n"
                + "                    <p:button value=\"Home\" outcome=\"/index.xhtml\"/>\n"
                + "                </f:facet>\n"
                + "            </p:toolbar>\n";
        return xhtml;
    }
    
    
    public String TitleForToolbar(String m) {
        String palavra = "";
        //String m = "moisesJuvenalDaSilva";
        int size = m.length();
//        char[] palavra = new char[size];
        for (int i = 0; i < size; i++) {
            if (m.substring(i, i + 1).equals(upper(m.substring(i, i + 1))) || i==0) {
                palavra+=" " + m.substring(i, i + 1).toUpperCase();
               // System.out.print(" " + m.substring(i, i + 1).toUpperCase());
            } else {
                palavra+=m.substring(i, i + 1);
                //System.out.print(m.substring(i, i + 1));
            }
        }
        
        //System.out.println(palavra);
        return palavra;
    }

    public String upper(String s) {
        return s.toUpperCase();
    }

}
