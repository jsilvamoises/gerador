package com.project.converter;


import com.project.bean.BeanEndereco;
import com.project.model.Endereco;
import com.project.suport.EnderecoSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Endereco.class)
public class EnderecoConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Endereco endereco = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new EnderecoSuport().getEntityById(id);
        }
        return endereco;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Endereco)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}