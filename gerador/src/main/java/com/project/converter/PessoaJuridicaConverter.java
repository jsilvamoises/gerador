package com.project.converter;


import com.project.bean.BeanPessoaJuridica;
import com.project.model.PessoaJuridica;
import com.project.suport.PessoaJuridicaSuport;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Moises
 */
@FacesConverter(forClass = PessoaJuridica.class)
public class PessoaJuridicaConverter implements javax.faces.convert.Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        PessoaJuridica pessoajuridica = null;
        
        if(value!=null){
            Long id = new Long(value);
            return new PessoaJuridicaSuport().getEntityById(id);
        }
        return pessoajuridica;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value!= null){
            Long id = ((PessoaJuridica)value).getId();
            return String.valueOf(id);
        }
        return "";
    }

}