package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Comentarios;
import com.project.suport.ComentariosSuport;
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
public class BeanComentarios implements InterfaceBean{
    @Inject
    private ComentariosSuport suport;
    
    private Comentarios comentarios;
    
    private List<Comentarios> comentarioss = new ArrayList<>();

    public BeanComentarios() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        comentarios = new Comentarios();
    }
    @Override
    public void save() {
         if(suport.save(comentarios)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(comentarios);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(comentarios);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(comentarios);
        listAll();
    }

    @Override
    public void  listAll() {
       comentarioss = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( comentarios.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 comentarios = ( Comentarios) suport.getEntityById( comentarios.getId());
                if ( comentarios == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Comentarios getComentarios() {
        return comentarios;
    }

    public void setComentarios(Comentarios comentarios) {
        this.comentarios = comentarios;
    }

    public List<Comentarios> getComentarioss() {
        return comentarioss;
    }

    public void setComentarios(List<Comentarios> comentarioss) {
        this.comentarioss = comentarioss;
    }
    
}
