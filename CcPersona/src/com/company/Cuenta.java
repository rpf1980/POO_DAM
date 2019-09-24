package com.company;

public class Cuenta
{
    //Atributos
    private String numeroCuenta;
    private int saldo;

    //Constructores
    public Cuenta(String numeroCuenta, int saldo)
    {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Getter && Setter
    public String getNumeroCuenta()
    {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta)
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
