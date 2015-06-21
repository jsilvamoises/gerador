/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.core;

import com.project.model.FormaPagamento;
import com.project.model.Login;
import com.project.model.Imagem;
import com.project.model.NivelAcessoAdm;
import com.project.model.PessoaJuridica;
import com.project.model.Mensagem;
import com.project.model.Comentarios;
import com.project.model.Endereco;
import com.project.model.StatusPlanoUser;
import com.project.model.Administrador;
import com.project.model.ContasReceber;
import com.project.model.Pais;
import com.project.model.PessoaFisica;
import com.project.model.Venda;
import com.project.model.Plano;
import com.project.model.Estado;
import com.project.model.PlanoUsuario;

/**
 *
 * @author MOISES
 */
public class BuildClasses {

    private Object[] objeto = new Object[17];

    public static void main(String[] args) {
        new BuildClasses().build();
    }

    private void build() {
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

        for (Object object : objeto) {
            new CriarPacotes().criarPacotes();
            new GenerateFilterForClass(object).gerar();
            new GenerateConverterForObject(object).gerar();
            new GenerateUsuarioSuport(object).gerar();
            new GenerateBeanForClass(object).gerar();
        }

    }

}
