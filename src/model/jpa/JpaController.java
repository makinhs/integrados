package model.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaController {

    protected static EntityManagerFactory emf = null;

    public JpaController() {
    }

    public EntityManagerFactory getEMFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("SistemaPU");
        }
        return emf;
    }

    public EntityManager getEntityManager() {
        return getEMFactory().createEntityManager();
    }
}