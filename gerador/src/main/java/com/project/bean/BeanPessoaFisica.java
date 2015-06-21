package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.PessoaFisica;
import com.project.suport.PessoaFisicaSuport;
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
public class BeanPessoaFisica implements InterfaceBean{
    @Inject
    private PessoaFisicaSuport suport;
    
    private PessoaFisica pessoafisica;
    
    private List<PessoaFisica> pessoafisicas = new ArrayList<>();

    public BeanPessoaFisica() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        pessoafisica = new PessoaFisica();
    }
    @Override
    public void save() {
         if(suport.save(pessoafisica)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(pessoafisica);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(pessoafisica);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(pessoafisica);
        listAll();
    }

    @Override
    public void  listAll() {
       pessoafisicas = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( pessoafisica.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 pessoafisica = ( PessoaFisica) suport.getEntityById( pessoafisica.getId());
                if ( pessoafisica == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public PessoaFisica getPessoaFisica() {
        return pessoafisica;
    }

    public void setPessoaFisica(PessoaFisica pessoafisica) {
        this.pessoafisica = pessoafisica;
    }

    public List<PessoaFisica> getPessoaFisicas() {
        return pessoafisicas;
    }

    public void setPessoaFisica(List<PessoaFisica> pessoafisicas) {
        this.pessoafisicas = pessoafisicas;
    }
    
}
