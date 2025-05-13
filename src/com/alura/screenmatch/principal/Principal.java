package com.alura.screenmatch.principal;
import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.herramientas.LimpiarConsola;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        LimpiarConsola clean = new LimpiarConsola();
        clean.start();
        Pelicula miPelicula = new Pelicula("Encanto",2001);
        miPelicula.setDuracionEnMinutos(180);
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());

        Serie lost = new Serie("Lost",2000);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracion de la série: " + lost.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Avatar",2003);
        otraPelicula.setDuracionEnMinutos(200);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);
        /*
         * Diferencias clave entre var y el uso explícito de tipos en Java:
         * >Con var:
         *      El tipo de la variable se determina automáticamente por el valor que se le
         *  asigna. Es más compacto y mejora la legibilidad cuando el tipo es evidente a
         *  partir del contexto.
         * 
         * >Sin var (tipo explícito):
         *      Tienes que declarar explícitamente el tipo de la variable, lo que es más
         *  detallado pero puede ser más largo. Sin embargo, algunos prefieren esta forma
         *  porque hace que el tipo de la variable sea más claro de inmediato.
         */
        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);

    }
}