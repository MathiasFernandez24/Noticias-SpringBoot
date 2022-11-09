package com.mathi.noticias.services;

import com.mathi.noticias.entidades.Noticia;
import com.mathi.noticias.repositorios.NoticiaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Service
public class NoticiaService {

     
    
    @Autowired
    private NoticiaRepositorio noticiarepositorio;

    @Transactional                                //--> ver funcionamiento
    public void crearNoticia(String titulo, String cuerpo, String foto) throws Exception {
        validar(titulo, cuerpo, foto);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFoto(foto);
        noticiarepositorio.save(noticia);
    }
    @Transactional
    public void modificarNoticia(String id, String titulo, String cuerpo, String foto) throws Exception {
        validar(titulo, cuerpo, foto);
        Noticia noticia = new Noticia();
        noticia = noticiarepositorio.findById(id).get();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFoto(foto);
        noticiarepositorio.save(noticia);
    }
    
    public Noticia consultaNoticia(String id) {
        if (id == null || id.isEmpty()) {
        } else {
            Noticia noticia = new Noticia();
            noticia = noticiarepositorio.findById(id).get();
            return noticia;
        }
        return null;
    }

//    public List<Noticia> consultaNoticiaPorTitulo(String palabraABuscar) {
//        if (palabraABuscar == null || palabraABuscar.isEmpty()) {
//        } else {
//            List<Noticia> listaNoticias = noticiarepositorio.buscarNoticiaPorTitulo(palabraABuscar);
//            return listaNoticias;
//        }
//        return null;
//    }

    @Transactional
    public void eliminarNoticia(String id) {
        if (id == null || id.isEmpty()) {
        } else {
            Noticia noticia = new Noticia();
            noticia = noticiarepositorio.findById(id).get();
            noticiarepositorio.delete(noticia); // ---> Ver delete por id
        }
    }

    private void validar(String titulo, String cuerpo, String foto) throws Exception {
        if (titulo.isEmpty() || cuerpo.isEmpty() || foto.isEmpty()) {
            throw new Exception("ERROR Validar Noticia");
        }
    }

}