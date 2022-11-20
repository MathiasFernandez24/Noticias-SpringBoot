package com.mathi.noticias.entidades;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;

/**
 * @author Mathias Fernandez <mathias_fernandez_24@hotmail.com>
 */
@Entity
public class Periodista extends Usuario {

    private ArrayList<Noticia> misNoticias;
    private Integer sueldo;

    public Periodista() {
    }

    public Periodista(ArrayList<Noticia> misNoticias, Integer sueldo) {
        this.misNoticias = misNoticias;
        this.sueldo = sueldo;
    }

    public ArrayList<Noticia> getMisNoticias() {
        return misNoticias;
    }

    public void setMisNoticias(ArrayList<Noticia> misNoticias) {
        this.misNoticias = misNoticias;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Periodista{" + "misNoticias=" + misNoticias + ", sueldo=" + sueldo + '}';
    }

}
