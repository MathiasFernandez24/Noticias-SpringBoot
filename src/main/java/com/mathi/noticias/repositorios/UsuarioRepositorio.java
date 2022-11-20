package com.mathi.noticias.repositorios;

import com.mathi.noticias.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
