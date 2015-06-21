/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.gerador.imports.main;

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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MOISES
 */
public class AddModels {

    private List<Object> objeto = new ArrayList<>();

    public AddModels() {
        iniciar();
    }

    private void iniciar() {
        objeto.add(new Administrador());
        objeto.add(new Comentarios());
        objeto.add(new ContasReceber());
        objeto.add(new Endereco());
        objeto.add(new Estado());
        objeto.add(new FormaPagamento());
        objeto.add(new Imagem());
        objeto.add(new Login());
        objeto.add(new Mensagem());
        objeto.add(new NivelAcessoAdm());
        objeto.add(new Pais());
        objeto.add(new PessoaFisica());
        objeto.add(new PessoaJuridica());
        objeto.add(new Plano());
        objeto.add(new PlanoUsuario());
        objeto.add(new StatusPlanoUser());
        objeto.add(new Venda());

    }

    

    public List<Object> getObjeto() {
        return objeto;
    }

    public void setObjeto(List<Object> objeto) {
        this.objeto = objeto;
    }

    
}
