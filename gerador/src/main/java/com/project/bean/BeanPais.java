package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Pais;
import com.project.suport.PaisSuport;
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
public class BeanPais implements InterfaceBean{
    @Inject
    private PaisSuport suport;
    
    private Pais pais;
    
    private List<Pais> paiss = new ArrayList<>();

    public BeanPais() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        pais = new Pais();
    }
    @Override
    public void save() {
         if(suport.save(pais)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(pais);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(pais);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(pais);
        listAll();
    }

    @Override
    public void  listAll() {
       paiss = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( pais.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 pais = ( Pais) suport.getEntityById( pais.getId());
                if ( pais == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Pais> getPaiss() {
        return paiss;
    }

    public void setPais(List<Pais> paiss) {
        this.paiss = paiss;
    }
    
}
