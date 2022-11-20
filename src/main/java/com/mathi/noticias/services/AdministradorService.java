package com.mathi.noticias.services;

import com.mathi.noticias.entidades.Administrador;
import com.mathi.noticias.entidades.Rol;
import com.mathi.noticias.repositorios.AdministradorRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Service
public class AdministradorService {
    @Autowired
    AdministradorRepositorio administradorRepositorio;
    
    public void crearAdministrador(String nombre, String password) {
        Administrador admin = new Administrador();
        admin.setNombreUsuario(nombre);
        admin.setPassword(password);
        admin.setActivo(true);
        admin.setFechaDeAlta(new Date());
        admin.setRol(Rol.ADMIN);
        administradorRepositorio.save(admin);
    }
}
