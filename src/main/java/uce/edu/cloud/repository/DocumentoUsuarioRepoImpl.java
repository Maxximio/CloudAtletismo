package uce.edu.cloud.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.cloud.model.DocumentoUsuario;

@Repository
@Transactional
public class DocumentoUsuarioRepoImpl implements IDocumentoUsuarioRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public DocumentoUsuario consultarPorId(Integer id) {
        TypedQuery<DocumentoUsuario> myQuery = this.em.createQuery("SELECT d FROM DocumentoUsuario d WHERE d.id = :id", DocumentoUsuario.class);
        myQuery.setParameter("id", id);
        return myQuery.getSingleResult();
    }

    @Override
    public void insertarDocumentoUsuario(DocumentoUsuario documentoUsuario) {
        this.em.persist(documentoUsuario);
    }

    @Override
    public void actualizarDocumentoUsuario(DocumentoUsuario documentoUsuario) {
        this.em.merge(documentoUsuario);
    }

    @Override
    public void eliminarDocumentoUsuario(Integer id) {
        DocumentoUsuario documentoBorrado = this.consultarPorId(id);
        this.em.remove(documentoBorrado);
    }
}