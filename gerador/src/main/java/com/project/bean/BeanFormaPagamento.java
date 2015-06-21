package com.project.bean;

import com.project.interfaces.InterfaceBean;
import com.project.model.FormaPagamento;
import com.project.suport.FormaPagamentoSuport;
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
public class BeanFormaPagamento implements InterfaceBean{
    @Inject
    private FormaPagamentoSuport suport;
    
    private FormaPagamento formapagamento;
    
    private List<FormaPagamento> formapagamentos = new ArrayList<>();

    public BeanFormaPagamento() {
        clear();
    }
    
    
    
    @Override
    public void clear(){
        formapagamento = new FormaPagamento();
    }
    @Override
    public void save() {
         if(suport.save(formapagamento)){
              clear();
              listAll();
          }
    }

    @Override
    public void saveOrUpdate() {
        suport.saveOrUpdate(formapagamento);
        listAll();
    }

    @Override
    public void delete() {
        suport.remove(formapagamento);
        listAll();
    }

   

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        suport.update(formapagamento);
        listAll();
    }

    @Override
    public void  listAll() {
       formapagamentos = suport.getEntities();
    }

@Override
    public void inicializar() {
        try {
            if ( formapagamento.getId()>0) {
                //FacesUtil.showDialogMessageInfo("",login);
                 formapagamento = ( FormaPagamento) suport.getEntityById( formapagamento.getId());
                if ( formapagamento == null) {
                }
            } else {

                clear();
            }
        } catch (Exception e) {
            clear();
        }
       
        listAll();
    }
    public FormaPagamento getFormaPagamento() {
        return formapagamento;
    }

    public void setFormaPagamento(FormaPagamento formapagamento) {
        this.formapagamento = formapagamento;
    }

    public List<FormaPagamento> getFormaPagamentos() {
        return formapagamentos;
    }

    public void setFormaPagamento(List<FormaPagamento> formapagamentos) {
        this.formapagamentos = formapagamentos;
    }
    
}
