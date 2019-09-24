package com.company;

import java.util.ArrayList;

public abstract class Persona implements IPersona
{
    //Atributos
    private int dni;
    private ArrayList<Cuenta> arrayCuentas;
    private boolean moroso = false;

    //Constructores
    public Persona(int dni, ArrayList<Cuenta> arrayCuentas, boolean moroso)
    {
        this.dni = dni;
        this.arrayCuentas = arrayCuentas;
        this.moroso = moroso;
    }

    //Getter && Setter
    public int getDni()
    {
        return dni;
    }

    public void setDni(int dni)
    {
        this.dni = dni;
    }

    public boolean isMoroso()
    {
        //Buscamos en array cuentas si tiene alguna en negativo ( moroso = true )


        return moroso;
    }

    public void setMoroso(boolean moroso)
    {
        this.moroso = moroso;
    }

    @Override
    public void addCuenta(Cuenta cuenta)
    {
        //Nota: solo se pueden añadir hasta 3 cuentas

        //Recorremos el array de cuentas del usuario para comprobar que puede añadir cuentas
        for (int i = 0; i < this.arrayCuentas.size(); i++)
        {
            if(arrayCuentas.size() <= 3)
            {
                arrayCuentas.add(cuenta);
            }
            else
            {
                MisExcepciones e = new MisExcepciones();
                e.getMessage();
            }
        }
    }
}
