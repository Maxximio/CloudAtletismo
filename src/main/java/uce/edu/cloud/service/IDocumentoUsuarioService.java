package uce.edu.cloud.service;

import uce.edu.cloud.model.DocumentoUsuario;

public interface IDocumentoUsuarioService {
    DocumentoUsuario consultarPorId(Integer id);
    void insertarDocumentoUsuarioService(DocumentoUsuario documentoUsuario);
    void actualizarDocumentoUsuarioService(DocumentoUsuario documentoUsuario);
    void eliminarDocumentoUsuarioService(Integer id);
}