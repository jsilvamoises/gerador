package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.StatusPlanoUser;
import com.project.suport.StatusPlanoUserSuport;
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
public class BeanStatusPlanoUser implements InterfaceBean{
    @Inject
    private StatusPlanoUserSuport suport;
    
    private StatusPlanoUser statusplanouser;
    
    private List<StatusPlanoUser> statusplanousers = new ArrayList<>();

    public BeanStatusPlanoUser() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        statusplanouser = new StatusPlanoUser();
    }
    @Override
    public void save() {
         if(suport.save(statusplanouser)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(statusplanouser);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(statusplanouser);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(statusplanouser);
        listAll();
    }

    @Override
    public void  listAll() {
       statusplanousers = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( statusplanouser.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 statusplanouser = ( StatusPlanoUser) suport.getEntityById( statusplanouser.getId());
                if ( statusplanouser == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public StatusPlanoUser getStatusPlanoUser() {
        return statusplanouser;
    }

    public void setStatusPlanoUser(StatusPlanoUser statusplanouser) {
        this.statusplanouser = statusplanouser;
    }

    public List<StatusPlanoUser> getStatusPlanoUsers() {
        return statusplanousers;
    }

    public void setStatusPlanoUser(List<StatusPlanoUser> statusplanousers) {
        this.statusplanousers = statusplanousers;
    }
    
}
