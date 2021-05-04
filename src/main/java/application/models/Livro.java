package application.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="livros")
public class Livro {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name="id_genero")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name="id_autor")
    private Autor autor;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Genero getGenero() {
        return this.genero;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Autor getAutor() {
        return this.autor;
    }
}