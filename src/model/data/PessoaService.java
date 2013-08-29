package model.data;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import model.data.business.Pessoa;
import model.data.dao.PessoaDAO;
import model.data.dao.impl.PessoaDAOImpl;
import model.jpa.JpaController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PessoaService extends JpaController {

	private EntityManager em = null;
	private final Logger log = LoggerFactory.getLogger(PessoaService.class);
	private PessoaDAO pessoaDAO;

	public PessoaService() {
		em = this.getEntityManager();
		pessoaDAO = new PessoaDAOImpl(em);
	}

	public ArrayList<Pessoa> findAll() {
		try {
			ArrayList<Pessoa> list = (ArrayList<Pessoa>) pessoaDAO.findAll();
			return list;
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}

	public void savePessoa(Pessoa pessoa) {
		try {
			pessoaDAO.save(pessoa);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	public void deleteByCpf(String cpf) {
		try {
			pessoaDAO.deleteByCpf(cpf);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
}
