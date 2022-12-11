package ar.edu.davinci.domain;

import java.util.Objects;

public class Registro {

	private Integer hora;
	private Vehiculo vehiculo;

	public Registro(Integer hora, Vehiculo vehiculo) {
		this.hora = hora;
		this.vehiculo = vehiculo;
	}

	public Integer getHora() {
		return hora;
	}


	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hora, vehiculo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registro other = (Registro) obj;
		return Objects.equals(hora, other.hora)
				&& Objects.equals(vehiculo, other.vehiculo);
	}

	@Override
	public String toString() {
		return "Registro [hora=" + hora + ", vehiculo=" + vehiculo + "]";
	}

}
