package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo) { //cambiamos el contructor a un solo parametro y ademas este debe ser privado
		this.codigo = codigo;
		//this.nombre = nombre;
	}
}
