package com.mathi.noticias.repositorios;

import com.mathi.noticias.entidades.Noticia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, String> {

    @Query("SELECT n FROM NOTICIA n WHERE n.titulo LIKE :%titulo%")
    //  @Query("SELECT n FROM NOTICIA n WHERE n.titulo LIKE %:titulo%")
    //  @Query("SELECT n FROM NOTICIA n WHERE n.titulo LIKE :titulo")
    public List<Noticia> buscarNoticiaPorTitulo(@Param("titulo") String titulito);
}
