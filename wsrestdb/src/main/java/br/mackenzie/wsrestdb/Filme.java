package br.mackenzie.wsrestdb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Filme {
    @Id @GeneratedValue
    private long id;
    private String titulo;
    private int ano;
    public Filme() {}
    public Filme(long id, String t, int a) {
        this.id = id;
        titulo = t;
        ano = a;
    }
    public long getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getAno() { return ano; }
    public void setId(long id) { this.id = id; }
    public void setTitulo(String t) { titulo = t; }
    public void setAno(int a) { ano = a; }
}
