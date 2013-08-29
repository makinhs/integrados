package model.data.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import model.data.dao.PessoaDAO;
import model.data.business.Grupo;
import model.data.business.Pessoa;

public class PessoaDAOImpl implements PessoaDAO {

    private EntityManager em = null;
    
    public PessoaDAOImpl(EntityManager em) {
        this.em = em;
    }

	@Override
	public List<Pessoa> findAll() {
		// TODO Auto-generated method stub
		return null;
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
