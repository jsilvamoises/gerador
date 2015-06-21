/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core;

import java.io.File;

/**
 *
 * @author MOISES
 */
public class CriarPacotes {

    public void criarPacotes() {
        String pacote[] = new String[11];
       // CreateFolder folder = new CreateFolder();
        String caminho = Config.getPACOTE_APLICACAO().concat("");

        pacote[0] = caminho.concat("model").concat("");
        pacote[1] = caminho.concat("modeller").concat("");
        pacote[2] = caminho.concat("suport").concat("");
        pacote[3] = caminho.concat("filter").concat("");
        pacote[4] = caminho.concat("enums").concat("");
        pacote[5] = caminho.concat("interfaces").concat("");
        pacote[6] = caminho.concat("util").concat("");
        pacote[7] = caminho.concat("forge").concat("");
        pacote[8] = caminho.concat("dao").concat("");
        pacote[9] = caminho.concat("converter").concat("");
        pacote[10] = caminho.concat("sql").concat("");
        System.out.println("######################################################################################################");
        System.out.println("####################### CRIANDO PACOTES ##############################################################");
        System.out.println("######################################################################################################");

        for (String s : pacote) {
            System.out.println("####### Criando diretorio : "+s.intern());
            criaDiretorio(s.intern());
        }
        
        System.out.println("#####################################################################################################");
        System.out.println("####################### PACOTES PACOTES #############################################################");
        System.out.println("#####################################################################################################\n");

    }

    public void criaDiretorio(String nomeDiretorio) {

        String separador = java.io.File.separator;
        try {
          // nomeDiretorio = "C:" + separador + "jujuba"; 
            //System.err.println(">>>>"+nomeDiretorio);

            if (!new File(nomeDiretorio).exists()) { // Verifica se o diretório existe. 
                (new File(nomeDiretorio)).mkdir();   // Cria o diretório 
                System.out.println("Diretorio criado");
            }
        } catch (Exception ex) {
            System.out.println("Erro ao criar o diretório" + ex.toString());
        }
    }

//    public static void main(String[] args) {
//        new CriarPacotes().criarPacotes();
//    }
}
