package uce.edu.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.cloud.model.DocumentoUsuario;
import uce.edu.cloud.repository.IDocumentoUsuarioRepo;

@Service
public class DocumentoUsuarioServiceImpl implements IDocumentoUsuarioService{
    
    @Autowired
    private IDocumentoUsuarioRepo documentoUsuarioRepo;

    @Override
    public DocumentoUsuario consultarPorId(Integer id) {
        return this.documentoUsuarioRepo.consultarPorId(id);
    }

    @Override
    public void insertarDocumentoUsuarioService(DocumentoUsuario documentoUsuario){
        this.documentoUsuarioRepo.insertarDocumentoUsuario(documentoUsuario);
    }

    @Override
    public void actualizarDocumentoUsuarioService(DocumentoUsuario documentoUsuario){
        this.documentoUsuarioRepo.actualizarDocumentoUsuario(documentoUsuario);
    }

    @Override
    public void eliminarDocumentoUsuarioService (Integer id){
        this.documentoUsuarioRepo.eliminarDocumentoUsuario(id);
    }

}
