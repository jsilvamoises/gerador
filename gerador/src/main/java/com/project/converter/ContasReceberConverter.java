package com.project.converter;


import com.project.bean.BeanContasReceber;
import com.project.model.ContasReceber;
import com.project.suport.ContasReceberSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = ContasReceber.class)
public class ContasReceberConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        ContasReceber contasreceber = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new ContasReceberSuport().getEntityById(id);
        }
        return contasreceber;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((ContasReceber)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}