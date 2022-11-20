package com.mathi.noticias.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.GenericGenerator;
//import lombok.Getter;   --> revisar


/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Entity
//@NoArgsConstructor      --> no hace falta usar constructor vacio
public class Noticia {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String titulo;
    private String cuerpo;
    private String foto;
    @ManyToOne
    private Periodista creador;

    public Noticia() {
    }

    public Noticia(String id, String titulo, String cuerpo, String foto, Periodista creador) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.foto = foto;
        this.creador = creador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Periodista getCreador() {
        return creador;
    }

    public void setCreador(Periodista creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Noticia{" + "id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", foto=" + foto + ", creador=" + creador + '}';
    }
    
    
    
    
}
