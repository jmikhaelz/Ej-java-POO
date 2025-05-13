package com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.alura.screenmatch.herramientas.LimpiarConsola;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

public class PrincipalConListas {
    public static void main(String[] args) {

        new LimpiarConsola().start();

        Pelicula miPelicula = new Pelicula("Encanto", 2001);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar", 2003);
        otraPelicula.evalua(7);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);
        lost.evalua(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(lost);

        /*
         * Metodos de imprimir Array-List
         * 1.- lista.forEach(System.out::println);
         * 2.- lista.forEach(ls -> System.out.println(ls));
         * 3.- for (Titulo item : lista) {
         * System.out.println(item);
         * }
         */

        System.out.println("\tTITULOS NO ORDENADOS");
        for (int i = 0; i < 50; i++)
            System.out.print("_");
        System.out.println("\n");
        for (Titulo item : lista) {
            System.out.print(item);
            /*
             * El operador *instanceof* se utiliza para verificar si un objeto es una
             * instancia de una clase específica o implementa una interfaz.
             */
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(" : " + pelicula.getClasificacion());
            }
        }
        System.out.println("");
        for (int i = 0; i < 50; i++)
            System.out.print("_");
        System.out.println("\n");

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        
        System.out.println("Lista No Ordenada:\n"+listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista Ordenada:\n"+listaDeArtistas);

        Collections.sort(lista);
        
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

        System.out.println("\n\tTITULOS ORDENADOS");
        for (int i = 0; i < 50; i++)
            System.out.print("_");
        System.out.println("\n");
        for (Titulo item : lista) {
            System.out.print("\n"+item);
            /*
             * El operador *instanceof* se utiliza para verificar si un objeto es una
             * instancia de una clase específica o implementa una interfaz.
             */
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.print(" : " + pelicula.getClasificacion());
            }
        }
        System.out.println("");
        for (int i = 0; i < 50; i++)
            System.out.print("_");
        System.out.println("\n");
    }
}
