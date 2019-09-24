package com.company;

import java.util.ArrayList;

public class Persona
{
    //Atributos
    private String dni;
    private ArrayList<Cuenta> arrayCuentas = new ArrayList<Cuenta>();
    private boolean moroso = false;

    //Constructores
    public Persona(String dni)
    {
        this.dni = dni;
        this.arrayCuentas = arrayCuentas;
        this.moroso = moroso;
    }

    //Getter && Setter
    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public boolean isMoroso()
    {
        //Buscamos en array cuentas si tiene alguna en negativo ( moroso = true )
        for (int i = 0; i < this.arrayCuentas.size(); i++)
        {
            if(this.arrayCuentas.get(i).getSaldo() < 0)
            {
                setMoroso(true);
            }
        }
        return moroso;
    }

    public void setMoroso(boolean moroso)
    {
        this.moroso = moroso;
    }

    public void addCuenta(Cuenta cuenta) throws Exception
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

    public void delCuenta(Cuenta cuenta) throws Exception
    {
        if(this.arrayCuentas.contains(cuenta))
        {
            arrayCuentas.remove(cuenta);
        }
    }

    public String consultaCuenta(Cuenta cuenta) throws Exception
    {
        String res = "";

        if(this.arrayCuentas.contains(cuenta))
        {
            res = cuenta.toString();
        }

        return res;
    }

    public void recibeAbonos(int abonos, Cuenta cuenta) throws Exception
    {
        //int saldo = cuenta.getSaldo();
        int saldo = 0;

        //Comprobamos que exista la cuenta
        if(this.arrayCuentas.contains(cuenta))
        {
            //Guardo el saldo actual
            saldo = cuenta.getSaldo();
            //Sumamos el abono al saldo
            saldo = saldo + abonos;

            //Establecemos nuevo saldo
            cuenta.setSaldo(saldo);
        }
    }

    public void pagaRecibo(int recibo, Cuenta cuenta) throws Exception
    {
        int saldo;

        //Comprobamos siempre que exista la cuenta
        if(this.arrayCuentas.contains(cuenta) && cuenta.getSaldo() >= 0)
        {
            //Restamos el recibo del saldo de la cuenta
            saldo = cuenta.getSaldo() - recibo;

            //Establecemos nuevo valor a la cuenta
            cuenta.setSaldo(saldo);
        }
        else
        {
            setMoroso(true);
        }
    }
}
