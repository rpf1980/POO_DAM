package com.company;

public interface IPersona
{
    public void addCuenta(Cuenta cuenta);
    public void delCuenta(Cuenta cuenta);
    public String consultaCuenta(Cuenta cuenta);
    public void recibeAbonos(int abonos);
    public void pagaRecibo();
}
