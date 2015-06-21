package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.PessoaJuridica;
import com.project.suport.PessoaJuridicaSuport;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author MOISES
 */
@ManagedBean
@ViewScoped
public class BeanPessoaJuridica implements InterfaceBean{
    @Inject
    private PessoaJuridicaSuport suport;
    
    private PessoaJuridica pessoajuridica;
    
    private List<PessoaJuridica> pessoajuridicas = new ArrayList<>();

    public BeanPessoaJuridica() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        pessoajuridica = new PessoaJuridica();
    }
    @Override
    public void save() {
         if(suport.save(pessoajuridica)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(pessoajuridica);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(pessoajuridica);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(pessoajuridica);
        listAll();
    }

    @Override
    public void  listAll() {
       pessoajuridicas = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( pessoajuridica.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 pessoajuridica = ( PessoaJuridica) suport.getEntityById( pessoajuridica.getId());
                if ( pessoajuridica == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public PessoaJuridica getPessoaJuridica() {
        return pessoajuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoajuridica) {
        this.pessoajuridica = pessoajuridica;
    }

    public List<PessoaJuridica> getPessoaJuridicas() {
        return pessoajuridicas;
    }

    public void setPessoaJuridica(List<PessoaJuridica> pessoajuridicas) {
        this.pessoajuridicas = pessoajuridicas;
    }
    
}
