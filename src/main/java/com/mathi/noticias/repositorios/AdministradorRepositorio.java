/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mathi.noticias.repositorios;

import com.mathi.noticias.entidades.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Repository
public interface AdministradorRepositorio extends JpaRepository<Administrador, Long> {
    
}
