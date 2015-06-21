package com.project.converter;


import com.project.bean.BeanMensagem;
import com.project.model.Mensagem;
import com.project.suport.MensagemSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Mensagem.class)
public class MensagemConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Mensagem mensagem = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new MensagemSuport().getEntityById(id);
        }
        return mensagem;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Mensagem)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}