package com.u_tad.dawe.model;

public class JugadorBalonMano {
	
	String Nombre;
	int Dorsal;
	int Anotación;
	int Bloqueo;
	int TiempoJugado;
	
	
	public JugadorBalonMano(String nombre, int dorsal) {
		Nombre = nombre;
		Dorsal = dorsal;
	}


	public void setAnotación(int anotación) {
		Anotación = anotación;
	}


	public void setBloqueo(int bloqueo) {
		Bloqueo = bloqueo;
	}


	public void setTiempoJugado(int tiempoJugado) {
		TiempoJugado = tiempoJugado;
	}
	
	public int getAnotación() {
		return Anotación;
	}


	public int getBloqueo() {
		return Bloqueo;
	}


	public int getTiempoJugado() {
		return TiempoJugado;
	}
	
	public String getNombre() {
		return Nombre;
	}


	@Override
	public String toString() {
		return "JugadorBalonMano [Nombre=" + Nombre + ", Dorsal=" + Dorsal + ", Anotación=" + Anotación + ", Bloqueo="
				+ Bloqueo + ", TiempoJugado=" + TiempoJugado + "]";
	}



	
	
	
	
	
	
}
	
	
	
	


