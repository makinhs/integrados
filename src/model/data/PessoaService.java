package model.data;

import javax.persistence.EntityManager;

import model.data.business.Pessoa;
import model.data.dao.PessoaDAO;
import model.data.dao.impl.PessoaDAOImpl;
import model.jpa.JpaController;

public class PessoaService extends JpaController {

	private EntityManager em = null;
	private PessoaDAO pessoaDAO;

	public PessoaService() {
		em = this.getEntityManager();
		pessoaDAO = new PessoaDAOImpl(em);
	}

	public void savePessoa(Pessoa pessoa) {
		try {
			pessoaDAO.save(pessoa);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteByCpf(String cpf) {
		try {
			pessoaDAO.deleteByCpf(cpf);
		} catch (Exception e) {
			return;
		}
	}
}
