package uce.edu.cloud.repository;

import uce.edu.cloud.model.DocumentoUsuario;

public interface IDocumentoUsuarioRepo {
    DocumentoUsuario consultarPorId(Integer id);
    void insertarDocumentoUsuario(DocumentoUsuario documentoUsuario);
    void actualizarDocumentoUsuario(DocumentoUsuario documentoUsuario);
    void eliminarDocumentoUsuario(Integer id);
}
