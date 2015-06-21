/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.imports.main;

import com.jsm.gerador.core.CriarPacotes;
import com.jsm.gerador.core.GenerateDao;
import com.jsm.gerador.core.GenerateFacesUtil;
import com.jsm.gerador.core.GenerateHibernateUtil;
import com.jsm.gerador.core.GenerateMascara;
import com.jsm.gerador.core.interfaces.GenerateInterfaceBean;
import com.jsm.gerador.core.interfaces.GenerateInterfaceDao;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MOISES
 */
public class Main {

    List<Object> objetos;
    private int opMenu;
    private int opSubMenuInterfaces;
    private Scanner sc;

    public Main() {
        objetos = new AddModels().getObjeto();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Main().menuIniciar();

    }

    private void menuIniciar() {
        do {
            System.out.println("*************MENU************************");
            System.out.println(" [0] - Sair");
            System.out.println(" [1] - Gerar Pacotes Default");
            System.out.println(" [2] - Gerar Hibernate Util");
            System.out.println(" [3] - Gerar FacesUtil");
            System.out.println(" [4] - Gerar Dao");
            System.out.println(" [5] - Gerar Criar todas classes de base");
            System.out.println(" [6] - Gerar Interfaces");
            System.out.println(" [7] - Gerar Mascaras");
            System.out.println(" [8] - Gerar Hibernate.cfg");
            System.out.print("Digite a Opção desejada : ");
            try {
                opMenu = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida!!!" + e.getStackTrace());
                break;
            }

            if (opMenu > 0 && opMenu < 10) {
                executeOpMenuIniciar();
            }
        } while (opMenu != 0);

    }

    public void subMenuInterfaces() {
        
        do {
            System.out.println(" [0] - Sair");
            System.out.println(" [1] - Criar Interface Dao");
            System.out.println(" [2] - Criar Interface Bean");
            System.out.println(" [3] - Gerar Todas Ingerfaces");
            System.out.print("Digite a Opção desejada : ");
            try {
               opSubMenuInterfaces = sc.nextInt(); 
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            if (opSubMenuInterfaces > 0 && opSubMenuInterfaces < 10) {
                executeSubMenuInterfaces();
            }
            
        } while (opSubMenuInterfaces != 0);

    }
    
    private void executeSubMenuInterfaces(){
        switch(opSubMenuInterfaces){
            case 0 :
                break;
            case 1 :
                new GenerateInterfaceDao().gerar();
                break;
            case 2 :
                new GenerateInterfaceBean().gerar();
                break;
            case 3 :
                criarTodasInterfaces();
                break;
                
        }
    }

    private void executeOpMenuIniciar() {
        switch (opMenu) {
            case 0:
                System.exit(0);
                break;
            case 1:
                new CriarPacotes().criarPacotes();
                break;
            case 2:
                new GenerateHibernateUtil().gerar();
                break;
            case 3:
                new GenerateFacesUtil().gerar();
                break;
            case 4:
                new GenerateDao().gerarDao();
                break;
            case 5:
                criarTodasClassesBase();
                break;
            case 6:
                subMenuInterfaces();
                break;
            case 7 : 
                new GenerateMascara().gerar();
                break;

        }
    }

    private void criarTodasClassesBase() {
        System.err.println("###############################################################################################");
        System.err.println("####################### GERANDO CLASSES DE BASE ###############################################");
        System.err.println("###############################################################################################\n");
        for (int i = 1; i <= 4; i++) {
            opMenu = i;
            executeOpMenuIniciar();
        }
        System.err.println("###############################################################################################");
        System.err.println("####################### CONCLUIDO #############################################################");
        System.err.println("###############################################################################################\n");
    }
    
    private void criarTodasInterfaces() {
        System.out.println("###############################################################################################");
        System.out.println("####################### GERANDO INTERFACES ###############################################");
        System.out.println("###############################################################################################\n");
        for (int i = 1; i <= 2; i++) {
            opSubMenuInterfaces = i;
            executeSubMenuInterfaces();
        }
        System.out.println("###############################################################################################");
        System.out.println("####################### CONCLUIDO #############################################################");
        System.out.println("###############################################################################################\n");
    }
}
