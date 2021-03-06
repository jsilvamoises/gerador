package com.project.converter;


import com.project.bean.BeanEstado;
import com.project.model.Estado;
import com.project.suport.EstadoSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Estado.class)
public class EstadoConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Estado estado = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new EstadoSuport().getEntityById(id);
        }
        return estado;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Estado)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}