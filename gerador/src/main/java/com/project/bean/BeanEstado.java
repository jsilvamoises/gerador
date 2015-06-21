package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Estado;
import com.project.suport.EstadoSuport;
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
public class BeanEstado implements InterfaceBean{
    @Inject
    private EstadoSuport suport;
    
    private Estado estado;
    
    private List<Estado> estados = new ArrayList<>();

    public BeanEstado() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        estado = new Estado();
    }
    @Override
    public void save() {
         if(suport.save(estado)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(estado);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(estado);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(estado);
        listAll();
    }

    @Override
    public void  listAll() {
       estados = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( estado.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 estado = ( Estado) suport.getEntityById( estado.getId());
                if ( estado == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstado(List<Estado> estados) {
        this.estados = estados;
    }
    
}
