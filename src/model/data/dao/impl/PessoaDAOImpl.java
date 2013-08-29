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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pessoa findByCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pessoa> findByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pessoa> findByGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByCpf(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByGrupo(Grupo grupo) {
		// TODO Auto-generated method stub
		
	}

   
}
