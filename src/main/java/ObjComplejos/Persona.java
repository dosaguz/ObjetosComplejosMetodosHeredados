package ObjComplejos;

public class Persona {
	public String nombre;
	public String apellidos;
	public String dni;
	public int anyoDeNacimiento;
	private String apodo;

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getAnyoDeNacimiento() {
		return anyoDeNacimiento;
	}

	public void setAnyoDeNacimiento(int anyoDeNacimiento) {
		this.anyoDeNacimiento = anyoDeNacimiento;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Persona(String nombre, String apellidos, String dni, int anyoDeNacimiento, String apodo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.anyoDeNacimiento = anyoDeNacimiento;
		this.apodo = apodo;
	}
	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.dni = p.dni;
		this.anyoDeNacimiento = p.anyoDeNacimiento;
		this.apodo = p.apodo;
	}
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Persona p= new Persona(this.nombre, this.apellidos,this.dni,this.anyoDeNacimiento,this.apodo);
		return p;
	}

}
