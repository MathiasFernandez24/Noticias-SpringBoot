package com.mathi.noticias.controladores;

import com.mathi.noticias.services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Controller
@RequestMapping("/")
public class NoticiaControlador {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/crear")
    public String crear() {
        return "crear.html";
    }

    @PostMapping("/crearPost")
    public String crearPost(@RequestParam String titulo, String cuerpo, String foto) {
        try {
            noticiaService.crearNoticia(titulo, cuerpo, foto);
        } catch (Exception e) {
            System.out.println("ERROR en /crearPost");
        }

        return "index.html";
    }

    @GetMapping("/modificar")
    public String modificar() {
        return "modificar.html";
    }

    @GetMapping("/borrar")
    public String eliminar() {
        return "borrar.html";
    }

    @GetMapping("/consultar")
    public String consultar() {
        return "consultar.html";
    }
}
