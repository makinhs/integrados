package model.data;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import model.data.business.Evento;
import model.data.business.Grupo;
import model.data.business.Pessoa;
import model.data.dao.PessoaDAO;
import model.data.dao.PessoaEventoDAO;
import model.data.dao.impl.PessoaDAOImpl;
import model.data.dao.impl.PessoaEventoDAOImpl;
import model.jpa.JpaController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PessoaService extends JpaController {

    private EntityManager em = null;
    private final Logger log = LoggerFactory.getLogger(PessoaService.class);
    private PessoaDAO pessoaDAO;
    private PessoaEventoDAO pessoaEventoDAO;

    public PessoaService() {
        em = this.getEntityManager();
        pessoaDAO = new PessoaDAOImpl(em);
        pessoaEventoDAO = new PessoaEventoDAOImpl(em);
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

    public void delete(Pessoa pessoa) {
        try {
            pessoaDAO.delete(pessoa);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    public Pessoa findByCpf(String cpf) {
        try {
            Pessoa p = pessoaDAO.findByCpf(cpf);
            return p;
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

    public ArrayList<Pessoa> findByNome(String nome) {
        try {
            ArrayList<Pessoa> list = (ArrayList<Pessoa>) pessoaDAO.findByNome(nome);
            return list;
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

    public ArrayList<Pessoa> findByGrupo(Grupo grupo) {
        try {
            ArrayList<Pessoa> list = (ArrayList<Pessoa>) pessoaDAO.findByGrupo(grupo);
            return list;
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

    public ArrayList<Pessoa> findByEvento(Evento evento) {
        try {
            ArrayList<Pessoa> list = (ArrayList<Pessoa>) pessoaEventoDAO.listPessoaFromEvento(evento);
            return list;
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

    public void deleteByCpf(String cpf) {
        try {
            pessoaDAO.deleteByCpf(cpf);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    public void deletebyGrupo(Grupo grupo) {
        try {
            pessoaDAO.deleteByGrupo(grupo);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
