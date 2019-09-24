package com.company;

public class Cuenta
{
    //Atributos
    private int numeroCuenta;
    private int saldo;

    //Constructores
    public Cuenta(int numeroCuenta, int saldo)
    {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Getter && Setter
    public int getNumeroCuenta()
    {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta)
    {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }

    //Métodos
    @Override
    public String toString()
    {
        return "Número CC: "        + getNumeroCuenta() + "\n" +
                "Saldo: "           + getSaldo();
    }
}
