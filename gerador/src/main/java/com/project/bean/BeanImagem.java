package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Imagem;
import com.project.suport.ImagemSuport;
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
public class BeanImagem implements InterfaceBean{
    @Inject
    private ImagemSuport suport;
    
    private Imagem imagem;
    
    private List<Imagem> imagems = new ArrayList<>();

    public BeanImagem() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        imagem = new Imagem();
    }
    @Override
    public void save() {
         if(suport.save(imagem)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(imagem);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(imagem);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(imagem);
        listAll();
    }

    @Override
    public void  listAll() {
       imagems = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( imagem.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 imagem = ( Imagem) suport.getEntityById( imagem.getId());
                if ( imagem == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    public List<Imagem> getImagems() {
        return imagems;
    }

    public void setImagem(List<Imagem> imagems) {
        this.imagems = imagems;
    }
    
}
