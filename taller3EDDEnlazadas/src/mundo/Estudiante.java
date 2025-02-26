package mundo;

/**
 * Representa un estudiante como un nodo en una lista enlazada
 */
public class Estudiante 
{
	// ----------------------------------------------------
	// Atributos 
	// ----------------------------------------------------
	
	/**
	 * Codigo del estudiante
	 */
	private int codigo;
	
	/**
	 * Nombre del estudiante
	 */
	private String nombre;
	
	/**
	 * Nota final del estudiante
	 */
	private double nota;
	
	/**
	 * Referencia al siguiente estudiante de la lista
	 */
	private Estudiante siguiente;

	/**
	 * Referencia al anterior estudiante de la lista
	 */
	private Estudiante anterior;

	
	// ----------------------------------------------------
	// Constructor 
	// ----------------------------------------------------
		
	/**
	 * Inicializa los atributos con los parametros recibidos. 
	 * La referencia al siguiente estudiante no existe.
	 * @param codigo Codigo del estudiante
	 * @param nombre Nombre del estudiante
	 * @param nota Nota final del estudiante
	 */
	public Estudiante( int codigo, String nombre, double nota ) 
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.nota = nota;
		this.siguiente = null;
		this.anterior = null;
	}


	// ----------------------------------------------------
	// Metodos 
	// ----------------------------------------------------
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() 
	{
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}


	/**
	 * @return the nota
	 */
	public double getNota() 
	{
		return nota;
	}


	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) 
	{
		this.nota = nota;
	}


	/**
	 * @return the siguiente
	 */
	public Estudiante getSiguiente() 
	{
		return siguiente;
	}


	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(Estudiante siguiente) 
	{
		this.siguiente = siguiente;
	}
	
	
	/**
	 * @return the anterior
	 */
	public Estudiante getAnterior() 
	{
		return anterior;
	}


	/**
	 * @param anterior the anterior to set
	 */
	public void setAnterior(Estudiante anterior) 
	{
		this.anterior = anterior;
	}


	/**
	 * Representacion textual de un estudiante
	 */
	@Override
	public String toString( )
	{
		return codigo + ": "  + nombre + " - " + nota;
	}
	
}
