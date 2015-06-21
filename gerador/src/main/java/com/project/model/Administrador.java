package com.project.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Administrador extends Pessoa implements Serializable {

    
    
    @OneToMany(targetEntity = NivelAcessoAdm.class)
    private Collection<NivelAcessoAdm> nivelAcessoAdm;

    public Administrador() {

    }
   
   
   
    public Collection<NivelAcessoAdm> getNivelAcessoAdm() {
        return this.nivelAcessoAdm;
    }

    public void setNivelAcessoAdm(Collection<NivelAcessoAdm> nivelAcessoAdm) {
        this.nivelAcessoAdm = nivelAcessoAdm;
    }
}
