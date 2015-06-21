package com.project.converter;


import com.project.bean.BeanPais;
import com.project.model.Pais;
import com.project.suport.PaisSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Pais.class)
public class PaisConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Pais pais = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new PaisSuport().getEntityById(id);
        }
        return pais;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Pais)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}