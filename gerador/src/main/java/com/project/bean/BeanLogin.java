package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Login;
import com.project.suport.LoginSuport;
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
public class BeanLogin implements InterfaceBean{
    @Inject
    private LoginSuport suport;
    
    private Login login;
    
    private List<Login> logins = new ArrayList<>();

    public BeanLogin() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        login = new Login();
    }
    @Override
    public void save() {
         if(suport.save(login)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(login);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(login);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(login);
        listAll();
    }

    @Override
    public void  listAll() {
       logins = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( login.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 login = ( Login) suport.getEntityById( login.getId());
                if ( login == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<Login> getLogins() {
        return logins;
    }

    public void setLogin(List<Login> logins) {
        this.logins = logins;
    }
    
}
