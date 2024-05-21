package uce.edu.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uce.edu.cloud.model.Rol;
import uce.edu.cloud.service.IRolService;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private IRolService rolService;

    @GetMapping("/{id}")
    public ResponseEntity<Rol> getById(@PathVariable Integer id) {
        Rol rol = rolService.consultarPorId(id);
        if (rol != null) {
            return ResponseEntity.ok(rol);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Rol> create(@RequestBody Rol rol) {
        rolService.insertarRolService(rol);
        return ResponseEntity.status(HttpStatus.CREATED).body(rol);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rol> update(@PathVariable Integer id, @RequestBody Rol rol) {
        Rol rolExistente = rolService.consultarPorId(id);
        if (rolExistente != null) {
            rol.setId(id);
            rolService.actualizarRolService(rol);
            return ResponseEntity.ok(rol);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        Rol rolExistente = rolService.consultarPorId(id);
        if (rolExistente != null) {
            rolService.eliminarRolService(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
