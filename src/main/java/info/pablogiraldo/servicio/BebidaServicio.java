package info.pablogiraldo.servicio;

import java.util.List;

import info.pablogiraldo.modelo.Bebida;

public interface BebidaServicio {

	public List<Bebida> getLista();

	public Bebida getBebida(int i);
}
