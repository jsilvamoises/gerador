package com.project.suport;

import com.project.dao.Dao;
import com.project.interfaces.InterfaceDao;
import com.project.model.PessoaJuridica;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author MOISES
 */
public class PessoaJuridicaSuport implements InterfaceDao {
    
    private InterfaceDao<PessoaJuridica> Dao() {
        InterfaceDao<PessoaJuridica> dao = new Dao<>(PessoaJuridica.class);
        return dao;
    }

    @Override
    public boolean save(Object entity) {
        return Dao().save((PessoaJuridica) entity);
    }

    @Override
    public boolean saveOrUpdate(Object entity) {
        return Dao().saveOrUpdate((PessoaJuridica) entity);
    }

    @Override
    public boolean update(Object entity) {
        return Dao().update((PessoaJuridica) entity);
    }

    @Override
    public boolean remove(Object entity) {
        return Dao().remove((PessoaJuridica) entity);
    }

    @Override
    public boolean merge(Object entity) {
        return Dao().merge((PessoaJuridica) entity);
    }

    @Override
    public Object getEntityById(Serializable id) {
        return Dao().getEntityById(id);
    }

    @Override
    public Object getEntityByDetachedCriteria(DetachedCriteria criteria) {
        return Dao().getEntityByDetachedCriteria(criteria);
    }

    @Override
    public List getEntities() {
        return Dao().getEntities();
    }

    @Override
    public List getEntitiesTop(int top, String campo) {
        return Dao().getEntitiesTop(top, campo);
    }

    @Override
    public List getEntitiesByDetachetCriteria(DetachedCriteria criteria) {
        return Dao().getEntitiesByDetachetCriteria(criteria);
    }

    @Override
    public List getEntitiesByQuery(String query) {
        return Dao().getEntitiesByQuery(query);
    }

    @Override
    public void commit(Session session) {
        Dao().commit(session);
    }

    @Override
    public void rollback(Session session) {
        Dao().rollback(session);
    }

    @Override
    public void begin(Session session) {
        Dao().begin(session);
    }

    @Override
    public Session getSession() {
       return Dao().getSession();
    }

    @Override
    public List getTop(int totalRest, String query) {
       return Dao().getTop(totalRest, query);
    }
    
}