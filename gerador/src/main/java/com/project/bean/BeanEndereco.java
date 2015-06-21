package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Endereco;
import com.project.suport.EnderecoSuport;
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
public class BeanEndereco implements InterfaceBean{
    @Inject
    private EnderecoSuport suport;
    
    private Endereco endereco;
    
    private List<Endereco> enderecos = new ArrayList<>();

    public BeanEndereco() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        endereco = new Endereco();
    }
    @Override
    public void save() {
         if(suport.save(endereco)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(endereco);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(endereco);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(endereco);
        listAll();
    }

    @Override
    public void  listAll() {
       enderecos = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( endereco.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 endereco = ( Endereco) suport.getEntityById( endereco.getId());
                if ( endereco == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEndereco(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
}
