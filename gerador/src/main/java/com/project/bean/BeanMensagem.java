package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Mensagem;
import com.project.suport.MensagemSuport;
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
public class BeanMensagem implements InterfaceBean{
    @Inject
    private MensagemSuport suport;
    
    private Mensagem mensagem;
    
    private List<Mensagem> mensagems = new ArrayList<>();

    public BeanMensagem() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        mensagem = new Mensagem();
    }
    @Override
    public void save() {
         if(suport.save(mensagem)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(mensagem);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(mensagem);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(mensagem);
        listAll();
    }

    @Override
    public void  listAll() {
       mensagems = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( mensagem.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 mensagem = ( Mensagem) suport.getEntityById( mensagem.getId());
                if ( mensagem == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public List<Mensagem> getMensagems() {
        return mensagems;
    }

    public void setMensagem(List<Mensagem> mensagems) {
        this.mensagems = mensagems;
    }
    
}
