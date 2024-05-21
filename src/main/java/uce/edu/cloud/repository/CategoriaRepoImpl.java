package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.Categoria;

@Repository
@Transactional
public class CategoriaRepoImpl implements ICategoriaRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Categoria consultarPorId(Integer id) {
        TypedQuery<Categoria> myQuery = this.em.createQuery("SELECT c FROM Categoria c WHERE c.id = :id", Categoria.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarCategoria(Categoria categoria) {
        this.em.persist(categoria);
    }

    @Override
    public void actualizarCategoria(Categoria categoria) {
        this.em.merge(categoria);
    }

    @Override
    public void eliminarCategoria(Integer id) {
        Categoria categoriaBorrada = this.consultarPorId(id);
        this.em.remove(categoriaBorrada);
    }
}
