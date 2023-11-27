package eje25;

public class Main {
	public static void main(String[] args) {
		Empleado e = new Empleado();
		Operario o1 = new Operario();
		Directivo d = new Directivo();
		Oficial o2 = new Oficial();
		Tecnico t = new Tecnico();
	}
}

class Empleado{
	String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
}
class Operario extends Empleado{
	@Override
	public String toString() {
		return "Operario [nombre=" + nombre + ", getNombre()=" + getNombre() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
class Directivo extends Empleado{
	@Override
	public String toString() {
		return "Directivo [nombre=" + nombre + ", getNombre()=" + getNombre() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
class Oficial extends Operario{
	@Override
	public String toString() {
		return "Oficial [nombre=" + nombre + ", toString()=" + super.toString() + ", getNombre()=" + getNombre()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
class Tecnico extends Operario{
	@Override
	public String toString() {
		return "Tecnico [nombre=" + nombre + ", toString()=" + super.toString() + ", getNombre()=" + getNombre()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
