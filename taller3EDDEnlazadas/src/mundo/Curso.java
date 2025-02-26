package mundo;

/**
 * Representa una lista doblemente encadenada
 */
public class Curso 
{
	
	// ----------------------------------------------------
	// Atributos 
	// ----------------------------------------------------

	/**
	 * Primer elemento de la lista enlazada doble
	 */
	private Estudiante cabeza;

	
	// ----------------------------------------------------
	// Constructor 
	// ----------------------------------------------------

	/**
	 * La lista enlazada doble inicia vacia (sin nodos)
	 */
	public Curso( )
	{
		cabeza = null;
	}
	
	
	// ----------------------------------------------------
	// Metodos 
	// ----------------------------------------------------

	// TODO agregarEstudianteInicio( )
	
	/**
	 * Agrega un nodo de tipo Estudiante al final de la lista enlazada doble
	 * @param codigo Codigo del estudiante
	 * @param nombre Nombre del estudiante
	 * @param nota Nota final del estudiante
	 */
	public void agregarEstudianteFinal( int codigo, String nombre, double nota )
	{
		Estudiante nuevo = new Estudiante( codigo, nombre, nota );
		
		if( cabeza == null ) {		// Se agrega el primer nodo de la lista
			cabeza = nuevo;
		}
		else {
			Estudiante ultimo = cabeza;
			
			while( ultimo.getSiguiente( ) != null ) {
				ultimo = ultimo.getSiguiente( );
			}
			
			// Se enlaza el nuevo nodo al ultimo
			ultimo.setSiguiente( nuevo );		// El siguiente del ultimo es el nuevo
			nuevo.setAnterior( ultimo );		// El nuevo pasa a ser el ultimo, por tanto, 
												// referencia como anterior al que lo era
		}
			
	}
	
	public void eliminarPorCodigo(int codigo) {
	    if (cabeza == null) return; // Lista vacía

	    Estudiante actual = cabeza;
	    
	    // Buscar el nodo con el código
	    while (actual != null && actual.getCodigo() != codigo) {
	        actual = actual.getSiguiente();
	    }

	    if (actual == null) return; // No encontrado

	    // Caso 1: Eliminar la cabeza
	    if (actual == cabeza) {
	        cabeza = actual.getSiguiente();
	        if (cabeza != null) {
	            cabeza.setAnterior(null);
	        }    
	    } 
	    
	   // Caso 2: Nodo intermedio o final
	    else {
	        Estudiante anterior = actual.getAnterior();
	        Estudiante siguiente = actual.getSiguiente();

	        if (anterior != null) {
	            anterior.setSiguiente(siguiente);
	        }
	        if (siguiente != null) {
	            siguiente.setAnterior(anterior);
	        }
	    }
	}
	
	
	
}
