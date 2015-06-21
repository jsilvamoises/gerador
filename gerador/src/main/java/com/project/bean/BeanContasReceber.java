package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.ContasReceber;
import com.project.suport.ContasReceberSuport;
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
public class BeanContasReceber implements InterfaceBean{
    @Inject
    private ContasReceberSuport suport;
    
    private ContasReceber contasreceber;
    
    private List<ContasReceber> contasrecebers = new ArrayList<>();

    public BeanContasReceber() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        contasreceber = new ContasReceber();
    }
    @Override
    public void save() {
         if(suport.save(contasreceber)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(contasreceber);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(contasreceber);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(contasreceber);
        listAll();
    }

    @Override
    public void  listAll() {
       contasrecebers = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( contasreceber.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 contasreceber = ( ContasReceber) suport.getEntityById( contasreceber.getId());
                if ( contasreceber == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public ContasReceber getContasReceber() {
        return contasreceber;
    }

    public void setContasReceber(ContasReceber contasreceber) {
        this.contasreceber = contasreceber;
    }

    public List<ContasReceber> getContasRecebers() {
        return contasrecebers;
    }

    public void setContasReceber(List<ContasReceber> contasrecebers) {
        this.contasrecebers = contasrecebers;
    }
    
}
