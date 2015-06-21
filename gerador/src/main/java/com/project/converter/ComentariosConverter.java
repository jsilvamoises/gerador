package com.project.converter;


import com.project.bean.BeanComentarios;
import com.project.model.Comentarios;
import com.project.suport.ComentariosSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Comentarios.class)
public class ComentariosConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Comentarios comentarios = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new ComentariosSuport().getEntityById(id);
        }
        return comentarios;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Comentarios)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}