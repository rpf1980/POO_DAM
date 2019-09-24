package com.company;

public class Obra
{
    //Atributos
    private String titulo;
    private int nInventario;
    private String autor;

    //Constructores
    public Obra() {}

    public Obra(String titulo, int nInventario, String autor)
    {
        this.titulo = titulo;
        this.nInventario = nInventario;
        this.autor = autor;
    }

    //Getter && Setter
    public String getTitulo()
    {
        return titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    public int getnInventario()
    {
        return nInventario;
    }
    public void setnInventario(int nInventario)
    {
        this.nInventario = nInventario;
    }
    public String getAutor()
    {
        return autor;
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
}
