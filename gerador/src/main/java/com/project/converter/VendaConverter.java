package com.project.converter;


import com.project.bean.BeanVenda;
import com.project.model.Venda;
import com.project.suport.VendaSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Venda.class)
public class VendaConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Venda venda = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new VendaSuport().getEntityById(id);
        }
        return venda;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Venda)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}