package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.Campeonato;

@Repository
@Transactional
public class CampeonatoRepoImpl implements ICampeonatoRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Campeonato consultarPorId(Integer id) {
        TypedQuery<Campeonato> myQuery = this.em.createQuery("SELECT c FROM Campeonato c WHERE c.id = :id", Campeonato.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarCampeonato(Campeonato campeonato) {
        this.em.persist(campeonato);
    }

    @Override
    public void actualizarCampeonato(Campeonato campeonato) {
        this.em.merge(campeonato);
    }

    @Override
    public void eliminarCampeonato(Integer id) {
        Campeonato campeonatoBorrado = this.consultarPorId(id);
        this.em.remove(campeonatoBorrado);
    }
}