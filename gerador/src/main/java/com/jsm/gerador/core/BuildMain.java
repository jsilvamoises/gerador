/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core;

import com.jsm.gerador.core.interfaces.GenerateInterfaceDao;
import com.jsm.gerador.core.interfaces.GenerateInterfaceBean;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MOISES
 */
public class BuildMain {

    private final String nomePacoteRais = Config.getPACOTE_RAIZ();

    Scanner sc = new Scanner(System.in);
    private int op;
    private List<Class> classes;

    public void GerarBase() {
        //CRIA TODOS OS PACOTES DA CLASSE
       // criarPacotes();
        //CRIA INTERFACES
        
        new GenerateInterfaceBean().gerar();
        new GenerateInterfaceDao().gerar();
        //CRIA CLASSE DE UTILITARIOS
        new GenerateFacesUtil().gerar();
        new GenerateHibernateUtil().gerar();
        new GenerateMascara().gerar();
        new GenerateDao().gerarDao();//Gera o dao
        //

    }

//    public void criarPacotes() {
//        String pacote[] = null;
//        //CreateFolder folder = new CreateFolder();
//        pacote[0] = Config.getPACOTE_APLICACAO().concat("model").concat("\\");
//        pacote[1] = Config.getPACOTE_APLICACAO().concat("controler").concat("\\");
//        pacote[2] = Config.getPACOTE_APLICACAO().concat("suport").concat("\\");
//        pacote[3] = Config.getPACOTE_APLICACAO().concat("filter").concat("\\");
//        pacote[4] = Config.getPACOTE_APLICACAO().concat("enums").concat("\\");
//        pacote[5] = Config.getPACOTE_APLICACAO().concat("interfaces").concat("\\");
//        pacote[6] = Config.getPACOTE_APLICACAO().concat("util").concat("\\");
//        pacote[7] = Config.getPACOTE_APLICACAO().concat("forge").concat("\\");
//        pacote[8] = Config.getPACOTE_APLICACAO().concat("dao").concat("\\");
//        pacote[9] = Config.getPACOTE_APLICACAO().concat("converter").concat("\\");
//        pacote[10] = Config.getPACOTE_APLICACAO().concat("sql").concat("\\");
//        pacote[11] = Config.getPACOTE_APLICACAO().concat("modeller").concat("\\");
//        
//        
//        for(String s: pacote){
//            criaDiretorio(s);
//        }
//    }
//
//    public static void main(String[] args) {
//        new BuildMain().GerarBase();
//        System.gc();
//        System.exit(0);
//    }
}
