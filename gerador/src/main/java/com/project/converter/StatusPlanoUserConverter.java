package com.project.converter;


import com.project.bean.BeanStatusPlanoUser;
import com.project.model.StatusPlanoUser;
import com.project.suport.StatusPlanoUserSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = StatusPlanoUser.class)
public class StatusPlanoUserConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        StatusPlanoUser statusplanouser = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new StatusPlanoUserSuport().getEntityById(id);
        }
        return statusplanouser;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((StatusPlanoUser)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}