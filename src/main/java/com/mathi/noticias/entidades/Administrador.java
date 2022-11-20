package com.mathi.noticias.entidades;

import java.util.Date;
import javax.persistence.Entity;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Entity
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(Long id, String nombreUsuario, String password, Date fechaDeAlta, Rol rol, Boolean activo) {
        super(id, nombreUsuario, password, fechaDeAlta, rol, activo);
    }

}
