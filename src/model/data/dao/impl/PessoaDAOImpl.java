package model.data.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import model.data.business.Grupo;
import model.data.business.Pessoa;
import model.data.dao.PessoaDAO;

public class PessoaDAOImpl implements PessoaDAO {

	private EntityManager em = null;
	private final String CPF = "cpf";
	private final String GRUPO = "grupo";
	private final String NOME = "nome";

	public PessoaDAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Pessoa> findAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Pessoa> cq = cb.createQuery(Pessoa.class);
		Root<Pessoa> rt = cq.from(Pessoa.class);
		cq.select(rt);

		return em.createQuery(cq).getResultList();
	}

	@Override
	public Pessoa findById(Long id) {
		// método não utilizado por esta classe
		return null;
	}

	@Override
	public Pessoa save(Pessoa entidade) {
		Pessoa p = em.merge(entidade);
		em.getTransaction().begin();
		em.getTransaction().commit();
		return p;
	}

	@Override
	public void delete(Pessoa entidade) {
		em.remove(entidade);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

	@Override
	public Pessoa findByCpf(String cpf) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Pessoa> cq = cb.createQuery(Pessoa.class);
		Root<Pessoa> rt = cq.from(Pessoa.class);
		cq.where(cb.equal(rt.get(CPF), cpf));
		return em.createQuery(cq).getSingleResult();
	}

	@Override
	public List<Pessoa> findByNome(String nome) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Pessoa> cq = cb.createQuery(Pessoa.class);
		Root<Pessoa> rt = cq.from(Pessoa.class);
		cq.where(cb.like(rt.<String> get(NOME), (nome + "do*")));
		return em.createQuery(cq).getResultList();
	}

	@Override
	public List<Pessoa> findByGrupo(Grupo grupo) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Pessoa> cq = cb.createQuery(Pessoa.class);
		Root<Pessoa> rt = cq.from(Pessoa.class);
		cq.where(cb.equal(rt.get(GRUPO), grupo));
		return em.createQuery(cq).getResultList();
	}

	@Override
	public void deleteByCpf(String cpf) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Pessoa> cq = cb.createQuery(Pessoa.class);
		Root<Pessoa> rt = cq.from(Pessoa.class);
		cq.where(cb.equal(rt.get(CPF), cpf));
		Pessoa p = em.createQuery(cq).getSingleResult();
		em.remove(p);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

	@Override
	public void deleteByGrupo(Grupo grupo) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Pessoa> cq = cb.createQuery(Pessoa.class);
		Root<Pessoa> rt = cq.from(Pessoa.class);
		cq.where(cb.equal(rt.get(GRUPO), grupo));
		List<Pessoa> list = em.createQuery(cq).getResultList();

		for (Pessoa p : list) {
			em.remove(p);
		}
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}
