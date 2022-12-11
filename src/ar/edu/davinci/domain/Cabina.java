package ar.edu.davinci.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cabina {

	private Integer id;
	private MedioDePago medioDePago;
	private List<Registro> registros;

	public Cabina(Integer id, MedioDePago medioDePago) {
		this.id = id;
		this.medioDePago = medioDePago;
		this.registros = new ArrayList<>();
	}

	// Se usa para las búsquedas
	public Cabina(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(MedioDePago medioDePago) {
		this.medioDePago = medioDePago;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	public void addRegistro(Registro registro) {
		this.registros.add(registro);
	}

	public void addRegistro(Integer hora, Vehiculo vehiculo) {
		Registro registro = new Registro(hora, vehiculo);
		addRegistro(registro);
	}

	public void addRegistro(Vehiculo vehiculo) {
		Registro registro = new Registro(Estacion.dameHoraActual(), vehiculo);
		addRegistro(registro);
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cabina other = (Cabina) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Cabina [id=" + id + ", medioDePago=" + medioDePago + ", registros=" + registros + "]";
	}


}
