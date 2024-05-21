package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.Competidor;

@Repository
@Transactional
public class CompetidorRepoImpl implements ICompetidorRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Competidor consultarPorId(Integer id) {
        TypedQuery<Competidor> myQuery = this.em.createQuery("SELECT c FROM Competidor c WHERE c.id = :id", Competidor.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarCompetidor(Competidor competidor) {
        this.em.persist(competidor);
    }

    @Override
    public void actualizarCompetidor(Competidor competidor) {
        this.em.merge(competidor);
    }

    @Override
    public void eliminarCompetidor(Integer id) {
        Competidor competidorBorrado = this.consultarPorId(id);
        this.em.remove(competidorBorrado);
    }
}