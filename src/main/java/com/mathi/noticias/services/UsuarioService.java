package com.mathi.noticias.services;

import com.mathi.noticias.entidades.Rol;
import com.mathi.noticias.entidades.Usuario;
import com.mathi.noticias.repositorios.UsuarioRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Service
public class UsuarioService {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public void crearUsuario(String nombre, String password) {
        Usuario u = new Usuario();
        u.setNombreUsuario(nombre);
        u.setPassword(password);
        u.setRol(Rol.USER);
        u.setActivo(true);
        u.setFechaDeAlta(new Date());
        usuarioRepositorio.save(u);
        System.out.println(u.getFechaDeAlta());
    }

}
