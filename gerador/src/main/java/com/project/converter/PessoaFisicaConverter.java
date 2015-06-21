package com.project.converter;


import com.project.bean.BeanPessoaFisica;
import com.project.model.PessoaFisica;
import com.project.suport.PessoaFisicaSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = PessoaFisica.class)
public class PessoaFisicaConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        PessoaFisica pessoafisica = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new PessoaFisicaSuport().getEntityById(id);
        }
        return pessoafisica;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((PessoaFisica)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}