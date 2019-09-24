package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CatalogoObras implements ICatalogoObras
{
    // Atributos
    private ArrayList<Obra> arrayCatalogo;

    // Constructor
    public CatalogoObras(ArrayList<Obra> arrayCatalogo)
    {
        this.arrayCatalogo = arrayCatalogo;
    }

    // Métodos
    @Override
    public void addObra(Obra obra)
    {
        // Recorremos el arrayCatalogo buscando la obra
        if (!this.arrayCatalogo.contains(obra)) // Si no la contiene
        {
            this.arrayCatalogo.add(obra); // Añade la obra
        } else
        {
            MisExcepciones e = new MisExcepciones();
            e.getMessage();
        }
    }

    @Override
    public void delObra(int nInventario)
    {
        // Recorremos el catálogo buscando la obra por su número de inventario
        for (int i = 0; i < this.arrayCatalogo.size(); i++)
        {
            if (this.arrayCatalogo.get(i).getnInventario() == nInventario)
            {
                this.arrayCatalogo.remove(i);
            }
        }
    }

    @Override
    public Obra buscaObra(int nInventario)
    {
        Obra obra = null;

        for (int i = 0; i < this.arrayCatalogo.size(); i++)
        {
            if (this.arrayCatalogo.get(i).getnInventario() == nInventario)
            {
                obra = (Obra) this.arrayCatalogo.get(i);
            }
        }

        return obra;
    }

    @Override
    public double superficie()
    {
        double res = 0;

        // Recorremos el catálogo para buscar las pinturas

        for (int i = 0; i < this.arrayCatalogo.size(); i++)
        {

            if (this.arrayCatalogo.get(i) instanceof Pintura)
            {

                // Parseamos la instancia de ese objeto a un objeto Pinturas
                Pintura pintura = (Pintura) this.arrayCatalogo.get(i);

                res += pintura.getDimensiones();
            }
        }

        return res;
    }

    @Override
    public int cuentaMaterial(String material)
    {
        int nEsculturas = 0;

        for (int i = 0; i < arrayCatalogo.size(); i++)
        {
            if (this.arrayCatalogo.get(i) instanceof Escultura)
            {
                Escultura escultura = (Escultura) this.arrayCatalogo.get(i);

                if (escultura.getMaterial().equalsIgnoreCase(material))
                {
                    nEsculturas = nEsculturas + 1;
                }
            }
        }

        return nEsculturas;
    }

    @Override
    public String muestraObrasCatalogo()
    {
        String res = "";

        for (int i = 0; i < this.arrayCatalogo.size(); i++)
        {
            if(this.arrayCatalogo.get(i) instanceof Pintura)
            {
                res += this.arrayCatalogo.get(i).toString() + "\n";
            }
            else
            {
                if(this.arrayCatalogo.get(i) instanceof Escultura)
                {
                    res += this.arrayCatalogo.get(i).toString() + "\n";
                }
            }
        }
        return res;
    }

    @Override
    public String muestraObra(Obra obra)
    {
        String res = "";

        for (int i = 0; i < this.arrayCatalogo.size(); i++)
        {
            if(this.arrayCatalogo.get(i) instanceof Pintura)
            {
                res = this.arrayCatalogo.get(i).toString();
            }
            else
            {
                if(this.arrayCatalogo.get(i) instanceof Escultura)
                {
                    res = this.arrayCatalogo.get(i).toString();
                }
            }
        }
        return res;
    }
}
