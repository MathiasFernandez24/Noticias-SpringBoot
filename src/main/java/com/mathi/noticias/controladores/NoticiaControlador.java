package com.mathi.noticias.controladores;

import com.mathi.noticias.services.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        return "redirect:/";
    }

    @GetMapping("/consultar/modificar/{id}")
    public String modificar(@PathVariable String id) {
        return "modificar.html";
    }

    @PostMapping("/consultar/modificar")
    public String modificarPost(@RequestParam String id, String titulo, String cuerpo, String foto) {

        try {
            noticiaService.modificarNoticia(id, titulo, cuerpo, foto);

        } catch (Exception e) {
        }
        return "redirect:/consultar";
    }

    @GetMapping("/consultar/eliminar/{id}")
    public String eliminar(@PathVariable String id, ModelMap modelo) {
        modelo.addAttribute("id", id);
        return "borrar.html";
    }

    @GetMapping("/consultar/eliminar4ever/{id}")
    public String eliminar4ever(@PathVariable String id, ModelMap modelo) {
        modelo.addAttribute("id2", id);
        System.out.println("Eliminar Controlador");
        noticiaService.eliminarNoticia(id);
        return "redirect:/consultar";
    }

    @GetMapping("/consultar")
    public String consultar(ModelMap modelo) {
        modelo.addAttribute("listaNoticias", noticiaService.listarNoticias());

        return "consultar.html";
    }
}
