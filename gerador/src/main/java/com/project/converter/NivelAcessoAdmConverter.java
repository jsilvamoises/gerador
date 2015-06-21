package com.project.converter;


import com.project.bean.BeanNivelAcessoAdm;
import com.project.model.NivelAcessoAdm;
import com.project.suport.NivelAcessoAdmSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = NivelAcessoAdm.class)
public class NivelAcessoAdmConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        NivelAcessoAdm nivelacessoadm = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new NivelAcessoAdmSuport().getEntityById(id);
        }
        return nivelacessoadm;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((NivelAcessoAdm)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}