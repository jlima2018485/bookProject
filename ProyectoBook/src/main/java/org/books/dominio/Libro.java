/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.books.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "libros")
public class Libro implements Serializable {

   // private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codigoLibro")
   //@GeneratedValue(strategy = GenerationType.AUTO)
    
    private int codigoLibro;
    @Column
    private String nombreLibro;
    @Column
    private String autorLibro;
    @Column
    private int paginasLibro;
    @Column
    private String editorialLibro;
    @Column
    private String categoriaLibro;
    @Column
    private Float precioLibro;

    public Libro() {
    }

    public Libro(int codigoLibro, String nombreLibro, String autorLibro, int paginasLibro, String editorialLibro, String categoriaLibro, Float precioLibro) {
        this.codigoLibro = codigoLibro;
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.paginasLibro = paginasLibro;
        this.editorialLibro = editorialLibro;
        this.categoriaLibro = categoriaLibro;
        this.precioLibro = precioLibro;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public int getPaginasLibro() {
        return paginasLibro;
    }

    public void setPaginasLibro(int paginasLibro) {
        this.paginasLibro = paginasLibro;
    }

    public String getEditorialLibro() {
        return editorialLibro;
    }

    public void setEditorialLibro(String editorialLibro) {
        this.editorialLibro = editorialLibro;
    }

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }

    public Float getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(Float precioLibro) {
        this.precioLibro = precioLibro;
    }
   

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigoLibro;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if (this.codigoLibro != other.codigoLibro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigoLibro=" + codigoLibro + ", nombreLibro=" + nombreLibro + ", autorLibro=" + autorLibro + ", paginasLibro=" + paginasLibro + ", editorialLibro=" + editorialLibro + ", categoriaLibro=" + categoriaLibro + ", precioLibro=" + precioLibro + '}';
    }

 
   
}
