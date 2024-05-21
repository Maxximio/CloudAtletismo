package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.CalendarioCompetencia;

@Repository
@Transactional
public class CalendarioCompetenciaRepoImpl implements ICalendarioCompetenciaRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public CalendarioCompetencia consultarPorId(Integer id) {
        TypedQuery<CalendarioCompetencia> myQuery = this.em.createQuery("SELECT c FROM CalendarioCompetencia c WHERE c.id = :id", CalendarioCompetencia.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarCalendarioCompetencia(CalendarioCompetencia calendarioCompetencia) {
        this.em.persist(calendarioCompetencia);
    }

    @Override
    public void actualizarCalendarioCompetencia(CalendarioCompetencia calendarioCompetencia) {
        this.em.merge(calendarioCompetencia);
    }

    @Override
    public void eliminarCalendarioCompetencia(Integer id) {
        CalendarioCompetencia calendarioBorrado = this.consultarPorId(id);
        this.em.remove(calendarioBorrado);
    }
}