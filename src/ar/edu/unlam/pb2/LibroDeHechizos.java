package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;

public class LibroDeHechizos {

	private HashSet<Hechizo> hechizos;

	public LibroDeHechizos() {
		this.hechizos = new HashSet<Hechizo>();
	}

	@Override
	public int hashCode() {
		return Objects.hash(hechizos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibroDeHechizos other = (LibroDeHechizos) obj;
		return Objects.equals(hechizos, other.hechizos);
	}

	public Integer getHechizos() {
		return hechizos.size();
	}

	public void setHechizos(HashSet<Hechizo> hechizos) {
		this.hechizos = hechizos;
	}

	public void agregarHechizo(Hechizo hechizo) {
		this.hechizos.add(hechizo);

	}

	public Object buscar(Hechizo hechizo) {
		if (this.hechizos.contains(hechizo)) {
		}
		return hechizo;
	}
}
