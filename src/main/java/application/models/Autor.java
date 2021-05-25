package application.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

@Entity
@Table(name="autores")
public class Autor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nome;

    @OneToMany(mappedBy="autor")
    private List<Livro> livros;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setLivros(List livros) {
        this.livros = livros;
    }
    public List getLivros(){
        return this.livros;
    }
}