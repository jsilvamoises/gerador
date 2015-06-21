package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Plano;
import com.project.suport.PlanoSuport;
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
public class BeanPlano implements InterfaceBean{
    @Inject
    private PlanoSuport suport;
    
    private Plano plano;
    
    private List<Plano> planos = new ArrayList<>();

    public BeanPlano() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        plano = new Plano();
    }
    @Override
    public void save() {
         if(suport.save(plano)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(plano);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(plano);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(plano);
        listAll();
    }

    @Override
    public void  listAll() {
       planos = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( plano.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 plano = ( Plano) suport.getEntityById( plano.getId());
                if ( plano == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public void setPlano(List<Plano> planos) {
        this.planos = planos;
    }
    
}
