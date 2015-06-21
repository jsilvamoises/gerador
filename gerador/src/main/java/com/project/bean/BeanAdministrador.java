package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Administrador;
import com.project.suport.AdministradorSuport;
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
public class BeanAdministrador implements InterfaceBean{
    @Inject
    private AdministradorSuport suport;
    
    private Administrador administrador;
    
    private List<Administrador> administradors = new ArrayList<>();

    public BeanAdministrador() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        administrador = new Administrador();
    }
    @Override
    public void save() {
         if(suport.save(administrador)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(administrador);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(administrador);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(administrador);
        listAll();
    }

    @Override
    public void  listAll() {
       administradors = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( administrador.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 administrador = ( Administrador) suport.getEntityById( administrador.getId());
                if ( administrador == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public List<Administrador> getAdministradors() {
        return administradors;
    }

    public void setAdministrador(List<Administrador> administradors) {
        this.administradors = administradors;
    }
    
}
