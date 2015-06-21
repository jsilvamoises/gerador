package com.project.converter;


import com.project.bean.BeanFormaPagamento;
import com.project.model.FormaPagamento;
import com.project.suport.FormaPagamentoSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = FormaPagamento.class)
public class FormaPagamentoConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        FormaPagamento formapagamento = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new FormaPagamentoSuport().getEntityById(id);
        }
        return formapagamento;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((FormaPagamento)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}