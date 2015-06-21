package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.PlanoUsuario;
import com.project.suport.PlanoUsuarioSuport;
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
public class BeanPlanoUsuario implements InterfaceBean{
    @Inject
    private PlanoUsuarioSuport suport;
    
    private PlanoUsuario planousuario;
    
    private List<PlanoUsuario> planousuarios = new ArrayList<>();

    public BeanPlanoUsuario() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        planousuario = new PlanoUsuario();
    }
    @Override
    public void save() {
         if(suport.save(planousuario)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(planousuario);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(planousuario);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(planousuario);
        listAll();
    }

    @Override
    public void  listAll() {
       planousuarios = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( planousuario.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 planousuario = ( PlanoUsuario) suport.getEntityById( planousuario.getId());
                if ( planousuario == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public PlanoUsuario getPlanoUsuario() {
        return planousuario;
    }

    public void setPlanoUsuario(PlanoUsuario planousuario) {
        this.planousuario = planousuario;
    }

    public List<PlanoUsuario> getPlanoUsuarios() {
        return planousuarios;
    }

    public void setPlanoUsuario(List<PlanoUsuario> planousuarios) {
        this.planousuarios = planousuarios;
    }
    
}
