package model.data;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import model.jpa.JpaController;
import model.data.dao.PessoaDAO;
import model.data.dao.impl.PessoaDAOImpl;

public class PessoaService extends JpaController {
    
    private EntityManager em = null;
    private PessoaDAO pessoaDAO;
    
    public PessoaService() {
        em = this.getEntityManager();
        pessoaDAO = new PessoaDAOImpl(em);
    }
    
    public void deleteByCpf(String cpf) {
        try {
            pessoaDAO.deleteByCpf(cpf);
        } catch (Exception e) {
            return;
        }
    }
}
