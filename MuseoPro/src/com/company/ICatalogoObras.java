package com.company;

public interface ICatalogoObras
{
    public void addObra(Obra obra);
    public void delObra(int nInventario);
    public Obra buscaObra(int nInventario);
    public double superficie();
    public int cuentaMaterial(String material);
    public String muestraObrasCatalogo();
    public String muestraObra(Obra obra);
}
