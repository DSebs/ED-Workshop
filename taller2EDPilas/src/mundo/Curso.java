package mundo;

/**
 * Representa una lista enlazada tipp PILA de nodos de tipo Estudiante
 */
public class Curso 
{
	// ----------------------------------------------------
	// Atributos 
	// ----------------------------------------------------

	/**
	 * Primer elemento de la pila
	 */
	private Estudiante tope;
	private Estudiante ultimoEliminado;
	
	
	// ----------------------------------------------------
	// Constructor 
	// ----------------------------------------------------

	/**
	 * La pila inicia vacia (sin nodos)
	 */
	public Curso( )
	{
		tope = null;
		ultimoEliminado = null;
	}
	
	
	// ----------------------------------------------------
	// Metodos 
	// ----------------------------------------------------

	/**
	 * Agrega un nodo de tipo Estudiante al inicio de la pila
	 * @param codigo Codigo del estudiante
	 * @param nombre Nombre del estudiante
	 * @param nota Nota final del estudiante
	 */
	public void push( int codigo, String nombre, double nota )
	{
		Estudiante nuevo = new Estudiante( codigo, nombre, nota );
		nuevo.setSiguiente( tope );
		tope = nuevo;
	}

	/**
	 * Elimina el primer nodo de la pila
	 * @return El Estudiante ubicado en el tope de la pila o null si esta vacia
	 */
	public Estudiante pop( )
	{
		Estudiante eliminado = tope;
		
		if( tope != null )
		{
			ultimoEliminado = tope;
			tope = tope.getSiguiente( );
		}
		
		return eliminado;
	}
	
	
	/**
	 * Recorre la pila e imprime todos los nodos de la misma
	 */
	public void imprimirPila( )
	{
		Estudiante actual = tope;
		
		while( actual != null )
		{
			System.out.println( actual );
			actual = actual.getSiguiente( );
		}
	}
	
	public void intercambiarUltimos() {
	    if (tope == null || tope.getSiguiente() == null) return;

	    Estudiante primero = pop();
	    Estudiante segundo = pop();

	    push(primero.getCodigo(), primero.getNombre(), primero.getNota());
	    push(segundo.getCodigo(), segundo.getNombre(), segundo.getNota());
	}
	
	 public void restaurarUltimo() {
	        if (ultimoEliminado != null) {
	            ultimoEliminado.setSiguiente(tope);
	            tope = ultimoEliminado;
	            ultimoEliminado = null; // Se limpia después de restaurar
	        }
	    }

		
}
