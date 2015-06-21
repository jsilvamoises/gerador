package com.project.converter;


import com.project.bean.BeanAdministrador;
import com.project.model.Administrador;
import com.project.suport.AdministradorSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Administrador.class)
public class AdministradorConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Administrador administrador = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new AdministradorSuport().getEntityById(id);
        }
        return administrador;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Administrador)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}