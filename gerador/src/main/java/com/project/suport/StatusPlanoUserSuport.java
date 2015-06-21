package com.project.suport;

import com.project.dao.Dao;
import com.project.interfaces.InterfaceDao;
import com.project.model.StatusPlanoUser;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author MOISES
 */
public class StatusPlanoUserSuport implements InterfaceDao {
    
    private InterfaceDao<StatusPlanoUser> Dao() {
        InterfaceDao<StatusPlanoUser> dao = new Dao<>(StatusPlanoUser.class);
        return dao;
    }

    @Override
    public boolean save(Object entity) {
        return Dao().save((StatusPlanoUser) entity);
    }

    @Override
    public boolean saveOrUpdate(Object entity) {
        return Dao().saveOrUpdate((StatusPlanoUser) entity);
    }

    @Override
    public boolean update(Object entity) {
        return Dao().update((StatusPlanoUser) entity);
    }

    @Override
    public boolean remove(Object entity) {
        return Dao().remove((StatusPlanoUser) entity);
    }

    @Override
    public boolean merge(Object entity) {
        return Dao().merge((StatusPlanoUser) entity);
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