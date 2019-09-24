package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Obra> arrayCatalogo = new ArrayList<Obra>();

        // Instanciamos la clase que gestiona el catálogo
        CatalogoObras catalogo = new CatalogoObras(arrayCatalogo);

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0)
        {
            System.out.println("===============");
            System.out.println("Menú de pruebas");
            System.out.println("===============");
            System.out.println("[1] Añade obra");
            System.out.println("[2] Borra obra");
            System.out.println("[3] Busca obra");
            System.out.println("[4] Superficies de las pinturas");
            System.out.println("[5] Cuenta material de las esculturas");
            System.out.println("[6] Muestra las obras del catálogo");
            System.out.println("[0] SALIR");

            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                {
                    // [1] Añade obra

                    //Variables
                    Obra obra = null;
                    String titulo = "";
                    int nInventario = 0;
                    String autor = "";

                    //Pide datos de la obra
                    System.out.println("------------------");
                    System.out.println("ELIGE TIPO DE OBRA");
                    System.out.println("------------------");
                    System.out.println("[1] Pinturas");
                    System.out.println("[2] Esculturas");
                    System.out.println();
                    int tipObra = sc.nextInt();
                    sc.nextLine();

                    switch (tipObra)
                    {
                        case 1:
                        {
                            System.out.println("TIPO DE OBRA - PINTURA");
                            System.out.print("Título: ");
                            titulo = sc.nextLine();
                            System.out.print("Número de inventario: ");
                            nInventario = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Autor: ");
                            autor = sc.nextLine();
                            System.out.print("Dimensiones: ");
                            double dimensiones = sc.nextDouble();

                            obra = new Pintura(titulo,nInventario,autor,dimensiones);
                            catalogo.addObra(obra);
                        }
                        break;
                        case 2:
                        {
                            System.out.println("TIPO DE OBRA - ESCULTURA");
                            System.out.print("Título: ");
                            titulo = sc.nextLine();
                            System.out.print("Número de inventario: ");
                            nInventario = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Autor: ");
                            autor = sc.nextLine();
                            System.out.print("Material: ");
                            String material = sc.nextLine();

                            obra = new Escultura(titulo,nInventario,autor,material);
                            catalogo.addObra(obra);
                        }
                        break;
                        default:break;
                    }
                }
                break;

                case 2:
                {
                    // [2] Borra obra

                    //catalogo.delObra(110);

                }
                break;

                case 3:
                {
                    // [3] Busca obra

                    //Variables
                    Obra obra = null;
                    String res = "";

                    //Busca la obra
                    obra = catalogo.buscaObra(34);

                    //Muestra la obra
                    res = catalogo.muestraObra(obra);

                }
                break;

                case 4:
                {
                    // [4] Superficies de las pinturas
                    double totalSuperficies = catalogo.superficie();
                    DecimalFormat df = new DecimalFormat("###.##");

                    System.out.println("Total superficies: " + df.format(String.valueOf(totalSuperficies)));
                }
                break;

                case 5:
                {
                    // [5] Cuenta material de las esculturas

                    /*System.out.print("Material buscado: ");
                    String material = sc.nextLine();*/
                    int obrasDsMaterial = catalogo.cuentaMaterial("Marmol");
                    System.out.println("Total obras con ese material: " + obrasDsMaterial);
                }
                break;

                case 6:
                {
                    // [6] Muestra las obras del catálogo

                    String res = catalogo.muestraObrasCatalogo();

                    System.out.println(res);
                }
                break;

                default:
                    break;
            }
        }
    }
}
