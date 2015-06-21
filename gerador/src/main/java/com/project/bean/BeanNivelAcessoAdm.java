package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.NivelAcessoAdm;
import com.project.suport.NivelAcessoAdmSuport;
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
public class BeanNivelAcessoAdm implements InterfaceBean{
    @Inject
    private NivelAcessoAdmSuport suport;
    
    private NivelAcessoAdm nivelacessoadm;
    
    private List<NivelAcessoAdm> nivelacessoadms = new ArrayList<>();

    public BeanNivelAcessoAdm() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        nivelacessoadm = new NivelAcessoAdm();
    }
    @Override
    public void save() {
         if(suport.save(nivelacessoadm)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(nivelacessoadm);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(nivelacessoadm);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(nivelacessoadm);
        listAll();
    }

    @Override
    public void  listAll() {
       nivelacessoadms = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( nivelacessoadm.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 nivelacessoadm = ( NivelAcessoAdm) suport.getEntityById( nivelacessoadm.getId());
                if ( nivelacessoadm == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public NivelAcessoAdm getNivelAcessoAdm() {
        return nivelacessoadm;
    }

    public void setNivelAcessoAdm(NivelAcessoAdm nivelacessoadm) {
        this.nivelacessoadm = nivelacessoadm;
    }

    public List<NivelAcessoAdm> getNivelAcessoAdms() {
        return nivelacessoadms;
    }

    public void setNivelAcessoAdm(List<NivelAcessoAdm> nivelacessoadms) {
        this.nivelacessoadms = nivelacessoadms;
    }
    
}
