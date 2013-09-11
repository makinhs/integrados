package model.data;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import model.data.business.Evento;
import model.data.business.Pessoa;
import model.data.dao.EventoDAO;
import model.data.dao.PessoaEventoDAO;
import model.data.dao.impl.EventoDAOImpl;
import model.data.dao.impl.PessoaEventoDAOImpl;
import model.jpa.JpaController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventoService extends JpaController {

	private EntityManager em = null;
	private final Logger log = LoggerFactory.getLogger(EventoService.class);
	private EventoDAO eventoDAO;
	private PessoaEventoDAO pessoaEventoDAO;

	public EventoService() {
		em = this.getEntityManager();
		eventoDAO = new EventoDAOImpl(em);
		pessoaEventoDAO = new PessoaEventoDAOImpl(em);
	}

	public ArrayList<Evento> findAll() {
		try {
			return (ArrayList<Evento>) eventoDAO.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Evento findById(Long id) {
		try {
			return eventoDAO.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Evento save(Evento evento) {
		try {
			return eventoDAO.save(evento);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void delete(Evento evento) {
		try {
			eventoDAO.delete(evento);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Evento> pesquisarEventosDePessoa(Pessoa pessoa) {
		try {
			return (ArrayList<Evento>) pessoaEventoDAO
					.listEventoOfPessoa(pessoa);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
