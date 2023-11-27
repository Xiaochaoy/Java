package eje32;

public class Main {
	public static void main(String[] args) {
		Developer d1 = new Developer("superman", "asdq", "1231155A", Profesion.Full_Stack_Developer, 20000 );
		Developer d2 = new Developer("batman", "sfgye", "7436826A",Profesion.Back_End_Developer, 20);
		Developer d3 = new Developer("spiderman", "gfhyu", "8942536A", Profesion.Front_End_Developer, 18);
		Developer[] ds = {d1,d2,d3};
		
		for (Developer developer : ds) {
			if(developer.getRolTecnologico().equals(Profesion.Full_Stack_Developer)){
				System.out.println("Soy "+ developer.getNombre() + ": Viva el Back");
			}else if(developer.getRolTecnologico().equals(Profesion.Back_End_Developer)){
				System.out.println("Soy "+ developer.getNombre() + ": Viva el Back");
			}else if (developer.getRolTecnologico().equals(Profesion.Front_End_Developer)){
				System.out.println("Soy "+ developer.getNombre() + ": JS es una 💩, es mejor usar TypeScript");
			}
		}
	}
}

enum Profesion{
	Back_End_Developer,
	Front_End_Developer,
	Full_Stack_Developer
}
class Developer{
	private String nombre, apellido, dni;
	private Profesion rolTecnologico;
	private int edad;
	
	public Developer(String nombre, String apellido, String dni, Profesion rolTecnologico, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.rolTecnologico = rolTecnologico;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Profesion getRolTecnologico() {
		return rolTecnologico;
	}
	public void setRolTecnologico(Profesion fullStackDeveloper) {
		this.rolTecnologico = fullStackDeveloper;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}