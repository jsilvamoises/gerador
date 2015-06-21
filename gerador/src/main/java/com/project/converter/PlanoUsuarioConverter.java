package com.project.converter;


import com.project.bean.BeanPlanoUsuario;
import com.project.model.PlanoUsuario;
import com.project.suport.PlanoUsuarioSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = PlanoUsuario.class)
public class PlanoUsuarioConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        PlanoUsuario planousuario = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new PlanoUsuarioSuport().getEntityById(id);
        }
        return planousuario;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((PlanoUsuario)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}