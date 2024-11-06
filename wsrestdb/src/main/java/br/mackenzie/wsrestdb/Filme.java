package br.mackenzie.wsrestdb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Filme {
    @Id @GeneratedValue
    private long id;
    private String titulo;
    private int ano;
    @ManyToOne
    private Streaming streaming;
    public Filme() {}

    public long getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getAno() { return ano; }
    public Streaming getStreaming() { return streaming; }

    public void setId(long id) { this.id = id; }
    public void setTitulo(String t) { titulo = t; }
    public void setAno(int a) { ano = a; }
    public void setStreaming(Streaming s){streaming = s;}
}
