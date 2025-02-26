package mundo;

/**
 * Representa una lista enlazada circular de nodos de tipo Estudiante
 */
public class Curso 
{
	// ----------------------------------------------------
	// Atributos 
	// ----------------------------------------------------

	/**
	 * Primer elemento de la lista circular
	 */
	private Estudiante cabeza;

	// ----------------------------------------------------
	// Constructor 
	// ----------------------------------------------------

	/**
	 * La lista circular inicia vacia (sin nodos)
	 */
	public Curso( )
	{
		cabeza = null;
	}

	// ----------------------------------------------------
	// Metodos 
	// ----------------------------------------------------

	/**
	 * Agrega un nodo de tipo Estudiante al inicio de la lista circular
	 * @param codigo Codigo del estudiante
	 * @param nombre Nombre del estudiante
	 * @param nota Nota final del estudiante
	 */
	public void agregarEstudianteInicio( int codigo, String nombre, double nota )
	{
		Estudiante nuevo = new Estudiante( codigo, nombre, nota );
		
		if( cabeza == null )		// Si no existe la lista
		{
			cabeza = nuevo;
			cabeza.setSiguiente( cabeza );
		}
		else 
		{
			Estudiante ultimo = cabeza;
			while( ultimo.getSiguiente( ) != cabeza )
			{
				ultimo = ultimo.getSiguiente( );
			}
			
			nuevo.setSiguiente( cabeza );
			cabeza = nuevo;
			ultimo.setSiguiente( cabeza );
		}
	}

	
	/**
	 * Recorre la lista circular e imprime todos los nodos de la misma
	 */
	public void imprimirLista( )
	{
		if( cabeza != null )
		{
			Estudiante actual = cabeza;
			do
			{
				System.out.println( actual );
				actual = actual.getSiguiente( );
			} while( actual != cabeza );
		}
		
	}
	
	/**
	 * Elimina un estudiante de la lista circular dado su codigo.
	 * @param codigo Codigo del estudiante por eliminar
	 * @return True si el nodo es eliminado, False en caso contrario
	 */
	public boolean eliminarEstudiante( int codigo )
	{
		boolean eliminado = false; 
		
		if( cabeza != null ) {
			// El nodo por eliminar es el primero de la lista
			if( cabeza.getCodigo( ) == codigo )	{
				// Si existe un unico nodo
				if( cabeza.getSiguiente( ) == cabeza ) {
					cabeza = null;		// La lista queda vacía
				}
				else {
					// Nos desplazamos al ultimo nodo (para referenciar a la nueva cabeza)
					Estudiante ultimo = cabeza;
					while( ultimo.getSiguiente( ) != cabeza ) {
						ultimo = ultimo.getSiguiente( );
					}
					
					// Se actualiza el enlace al nuevo primer nodo (el segundo)
					cabeza = cabeza.getSiguiente( );
					ultimo.setSiguiente( cabeza );
				}
				eliminado = true;
			}
			else {
				// Eliminacion de un nodo que no es la cabeza
				Estudiante anterior = cabeza;
				Estudiante actual = cabeza.getSiguiente( );
				
				while( actual != cabeza && !eliminado )
				{
					if( actual.getCodigo( ) == codigo ) {
						anterior.setSiguiente( actual.getSiguiente( ) );
						eliminado = true;
					}
					anterior = actual;
					actual = actual.getSiguiente( );
				}
			}
		}
		
		return eliminado;
	}
	
	
	public Estudiante encontrarMejorEstudiante() {
	    if (cabeza == null) {
	        return null;
	    }
	    
	    Estudiante mejor = cabeza;
	    Estudiante actual = cabeza.getSiguiente();
	    
	    while (actual != cabeza) {
	        if (actual.getNota() > mejor.getNota()) {
	            mejor = actual;
	        }
	        actual = actual.getSiguiente();
	    }
	    
	    return mejor;
	}

	
	
}
