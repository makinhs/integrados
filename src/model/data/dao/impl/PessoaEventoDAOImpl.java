package model.data.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import model.data.business.Evento;
import model.data.business.Permissao;
import model.data.business.Pessoa;
import model.data.business.PessoaEvento;
import model.data.dao.PessoaEventoDAO;

public class PessoaEventoDAOImpl implements PessoaEventoDAO {

    private EntityManager em = null;
    private final int MAX_RESULTS = 10;
    private final String EVENTO = "evento";
    private final String PESSOA = "pessoa";
    private final String PERMISSAO = "tipoPermissao";

    public PessoaEventoDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<PessoaEvento> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PessoaEvento findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PessoaEvento save(PessoaEvento entidade) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(PessoaEvento entidade) {
        em.getTransaction().begin();
        em.remove(entidade);
        em.getTransaction().commit();
    }

    @Override
    public List<Pessoa> listPessoaFromEvento(Evento evento) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Pessoa> cq = cb.createQuery(Pessoa.class);
        Root<PessoaEvento> rt = cq.from(PessoaEvento.class);
        cq.where(cb.equal(rt.get(EVENTO), evento));
        return em.createQuery(cq).getResultList();
    }

    @Override
    public List<Evento> listEventoOfPessoa(Pessoa pessoa) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Evento> cq = cb.createQuery(Evento.class);
        Root<PessoaEvento> rt = cq.from(PessoaEvento.class);
        cq.where(cb.equal(rt.get(PESSOA), pessoa));
        return em.createQuery(cq).getResultList();
    }

    @Override
    public List<Permissao> findByPermissao(Permissao permissao) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Permissao> cq = cb.createQuery(Permissao.class);
        Root<PessoaEvento> rt = cq.from(PessoaEvento.class);
        cq.where(cb.equal(rt.get(PERMISSAO), permissao));
        return em.createQuery(cq).getResultList();
    }

}
