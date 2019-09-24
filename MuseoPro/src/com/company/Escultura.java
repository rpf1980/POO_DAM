package com.company;

public class Escultura extends Obra
{
    //Atributos
    private String material;

    //Constructores
    public Escultura(){}

    public Escultura(String titulo, int nInventario, String autor, String material)
    {
        super(titulo, nInventario, autor);
        this.material = material;
    }

    //Getter && Setter
    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    //Métodos
    @Override
    public String toString()
    {
        return "Título: "                   + getTitulo() + "\n" +
                "Número de inventario: "    + getnInventario() + "\n" +
                "Autor: "                   + getAutor() + "\n" +
                "Material: "                + getMaterial();
    }
}

