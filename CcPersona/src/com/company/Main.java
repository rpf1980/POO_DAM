package com.company;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        ArrayList<Cuenta> arrayCuentas = new ArrayList<Cuenta>();

        //Instanciamos objeto Persona ( gestion de las cuentas )
        Persona persona = new Persona("55336622-K");

        //Instanciamos objetos Cuenta
        Cuenta cuenta1 = new Cuenta("IBAN519856865874568476", 0);
        Cuenta cuenta2 = new Cuenta("IBAN519800000000568476", 700);

        //Mostramos las cuentas
        System.out.println("DNI: " + persona.getDni());
        System.out.println("Cuenta Nº1: " + cuenta1.toString());
        System.out.println();
        System.out.println("Cuenta Nº2: " + cuenta2.toString());
        System.out.println();

        //Ingresamos 1100€ en la primera cuenta
        persona.recibeAbonos(1100, cuenta1);
        //Establecemos su el saldo de cuenta1

        //Mostramos las cuentas
        System.out.println("DNI: " + persona.getDni());
        System.out.println("Cuenta Nº1: " + cuenta1.toString());
        System.out.println();
        System.out.println("Cuenta Nº2: " + cuenta2.toString());
        System.out.println();

        //Paga 750€ alquiler con cuenta2
        persona.pagaRecibo(750, cuenta2);

        //Imprimimos valor variable moroso
        boolean moroso = persona.isMoroso();
        System.out.println(persona.getDni() + " : Moroso : " + moroso);

        //Hacemos una transferencia
        int transferenciaInterna = 50;
        //Restamos los 50 euros de la cuenta con saldo
        persona.pagaRecibo(transferenciaInterna, cuenta1);
        //Y añadimos el saldo restado a la otra cuenta
        persona.recibeAbonos(transferenciaInterna, cuenta2);

        //Mostramos las cuentas
        System.out.println("DNI: " + persona.getDni());
        System.out.println("Cuenta Nº1: " + cuenta1.toString());
        System.out.println();
        System.out.println("Cuenta Nº2: " + cuenta2.toString());
        System.out.println();
    }
}
