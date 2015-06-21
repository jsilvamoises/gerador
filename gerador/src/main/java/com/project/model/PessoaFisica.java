package com.project.model;

import java.io.Serializable;
import com.project.enums.Sexo;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class PessoaFisica extends Pessoa implements Serializable {

    @Basic
    private boolean aceitaTermosUso;
    @Lob
    @Basic
    private String[] disponibilidadoTrabalho;
    @Basic
    private String RG;
    @OneToOne(targetEntity = PlanoUsuario.class)
    private PlanoUsuario planoUsuario;
    @Basic
    private String CPF;
    @Lob
    @Basic
    private String apresentacao;
    @Basic
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public PessoaFisica() {

    }
    
    public boolean isAceitaTermosUso() {
        return this.aceitaTermosUso;
    }

    public void setAceitaTermosUso(boolean aceitaTermosUso) {
        this.aceitaTermosUso = aceitaTermosUso;
    }
   
    public String[] getDisponibilidadoTrabalho() {
        return this.disponibilidadoTrabalho;
    }

    public void setDisponibilidadoTrabalho(String[] disponibilidadoTrabalho) {
        this.disponibilidadoTrabalho = disponibilidadoTrabalho;
    }
   
    public String getRG() {
        return this.RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
   
    public PlanoUsuario getPlanoUsuario() {
        return this.planoUsuario;
    }

    public void setPlanoUsuario(PlanoUsuario planoUsuario) {
        this.planoUsuario = planoUsuario;
    }
   
    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
   
    public String getApresentacao() {
        return this.apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }
   
    public Sexo getSexo() {
        return this.sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
