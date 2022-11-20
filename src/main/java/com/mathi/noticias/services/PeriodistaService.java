package com.mathi.noticias.services;

import com.mathi.noticias.entidades.Periodista;
import com.mathi.noticias.entidades.Rol;
import com.mathi.noticias.repositorios.PeriodistaRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Service
public class PeriodistaService {
@Autowired
PeriodistaRepositorio periodistaRepositorio;

    public void crearPeriodista(String nombre, String password, Integer sueldo) {
        Periodista p = new Periodista();
        p.setNombreUsuario(nombre);
        p.setPassword(password);
        p.setSueldo(sueldo);
        p.setRol(Rol.PERIODISTA);
        p.setActivo(true);
        p.setFechaDeAlta(new Date());
        periodistaRepositorio.save(p);
    }
}
