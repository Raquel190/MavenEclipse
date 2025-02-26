package com.u_tad.dawe.app;

import com.u_tad.dawe.model.JugadorBalonMano;

public class Equipo {
    public static void main(String[] args) {
        JugadorBalonMano jugador1 = new JugadorBalonMano("Juan", 10);
        JugadorBalonMano jugador2 = new JugadorBalonMano("Carlos", 15);

        // Simulando datos para 10 jornadas
        jugador1.setAnotación(20);
        jugador1.setBloqueo(5);
        jugador1.setTiempoJugado(3600);
        jugador2.setAnotación(15);
        jugador2.setBloqueo(3);
        jugador2.setTiempoJugado(3200);

        System.out.println(jugador1);
        System.out.println(jugador2);

        // Métodos adicionales para calcular estadísticas
        mostrarEstadisticas(jugador1, 5);
        mostrarEstadisticas(jugador1, 10);
    }

    public static void mostrarEstadisticas(JugadorBalonMano jugador, int jornada) {
        System.out.println("Estadísticas del jugador " + jugador.getNombre() + " en la jornada " + jornada + ":");
        System.out.println("Anotaciones: " + jugador.getAnotación());
        System.out.println("Bloqueos: " + jugador.getBloqueo());
        System.out.println("Tiempo jugado (segundos): " + jugador.getTiempoJugado());
    }
}
