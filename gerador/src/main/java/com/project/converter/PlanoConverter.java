package com.project.converter;


import com.project.bean.BeanPlano;
import com.project.model.Plano;
import com.project.suport.PlanoSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Plano.class)
public class PlanoConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Plano plano = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new PlanoSuport().getEntityById(id);
        }
        return plano;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Plano)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}