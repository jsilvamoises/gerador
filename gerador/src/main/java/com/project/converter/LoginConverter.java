package com.project.converter;


import com.project.bean.BeanLogin;
import com.project.model.Login;
import com.project.suport.LoginSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Login.class)
public class LoginConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Login login = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new LoginSuport().getEntityById(id);
        }
        return login;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Login)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}