package com.project.converter;


import com.project.bean.BeanImagem;
import com.project.model.Imagem;
import com.project.suport.ImagemSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = Imagem.class)
public class ImagemConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Imagem imagem = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new ImagemSuport().getEntityById(id);
        }
        return imagem;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((Imagem)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}