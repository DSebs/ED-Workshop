package mundo;

/**
 * Representa un estudiante como nodo en una lista enlazada
 */

public class Estudiante {

	private int codigo;

	private String nombre;
	
	private double nota;
	
	private Estudiante siguiente;

	
	public Estudiante(int codigo, String nombre, double nota) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nota = nota;
		this.siguiente = null;
	}

	
	//-----------------------------------------------------------------
	// Metodos (Getters and setters)
	//-----------------------------------------------------------------


	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}



	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the nota
	 */
	public double getNota() {
		return nota;
	}



	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}



	/**
	 * @return the siguiente
	 */
	public Estudiante getSiguiente() {
		return siguiente;
	}



	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(Estudiante siguiente) {
		this.siguiente = siguiente;
	}
	
	/**
	 * Representacion textual del estudiante
	 */
	@Override
	public String toString() {
		
		return codigo + ": " + nombre +" - " + nota;  
	}
	
	
	
}
