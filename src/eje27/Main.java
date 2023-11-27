package eje27;

public class Main {
	public static void main(String[] args) {
		Profesor p = new Profesor();
		Alumno a = new Alumno();
		p.setNombre("bobo");
		System.out.println(p.getNombre());
		
		a.setNombre("asdfew");
		System.out.println(a.getNombre());
	}
}
class Profesor implements IPersona{
	String nombre;
	int salario;
	
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
class Alumno implements IPersona{
	String nombre;
	String curso;
	
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}

interface IPersona{
	public String getNombre();
	public void setNombre(String nombre);
}