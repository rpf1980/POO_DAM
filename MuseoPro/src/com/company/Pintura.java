package com.company;

public class Pintura extends Obra
{
    //Atributos
    private double dimensiones;

    public Pintura(String titulo, int nInventario, String autor, double dimensiones)
    {
        super(titulo, nInventario, autor);
        this.setDimensiones(dimensiones);
    }

    public double getDimensiones()
    {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones)
    {
        this.dimensiones = dimensiones;
    }

    @Override
    public String toString()
    {
        return "Título: " 						+ getTitulo() + "\n" +
                "Número de inventario: "		+ getnInventario() + "\n" +
                "Autor: "						+ getAutor() + "\n" +
                "Dimensiones: "					+ getDimensiones();
    }
}
