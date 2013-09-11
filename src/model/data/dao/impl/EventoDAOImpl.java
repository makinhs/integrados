package model.data.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import model.data.business.Evento;
import model.data.dao.EventoDAO;

public class EventoDAOImpl implements EventoDAO {

    private EntityManager em = null;
    private final String EVENTO_ID = "eventoId";
    private final String NOME = "nome";

    public EventoDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Evento> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Evento> cq = cb.createQuery(Evento.class);
        Root<Evento> rt = cq.from(Evento.class);
        cq.select(rt);
        return em.createQuery(cq).getResultList();
    }

    @Override
    public Evento findById(Long id) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Evento> cq = cb.createQuery(Evento.class);
        Root<Evento> rt = cq.from(Evento.class);
        cq.where(cb.equal(rt.get(EVENTO_ID), id));
        return em.createQuery(cq).getSingleResult();
    }

    @Override
    public Evento save(Evento entidade) {
        em.getTransaction().begin();
        Evento e = em.merge(entidade);
        em.getTransaction().commit();
        return e;
    }

    @Override
    public void delete(Evento entidade) {
        em.getTransaction().begin();
        em.remove(entidade);
        em.getTransaction().commit();
    }

    @Override
    public List<Evento> findByNome(String nome) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Evento> cq = cb.createQuery(Evento.class);
        Root<Evento> rt = cq.from(Evento.class);
        cq.where(cb.like(rt.<String> get(NOME), nome + "%"));
        return em.createQuery(cq).getResultList();
    }

}
