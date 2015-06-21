package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.Venda;
import com.project.suport.VendaSuport;
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
public class BeanVenda implements InterfaceBean{
    @Inject
    private VendaSuport suport;
    
    private Venda venda;
    
    private List<Venda> vendas = new ArrayList<>();

    public BeanVenda() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        venda = new Venda();
    }
    @Override
    public void save() {
         if(suport.save(venda)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(venda);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(venda);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(venda);
        listAll();
    }

    @Override
    public void  listAll() {
       vendas = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( venda.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 venda = ( Venda) suport.getEntityById( venda.getId());
                if ( venda == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVenda(List<Venda> vendas) {
        this.vendas = vendas;
    }
    
}
