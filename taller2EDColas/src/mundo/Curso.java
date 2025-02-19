package mundo;

/**
 * Representa una lista enlazada tipp COLA de nodos de tipo Estudiante
 */
public class Curso 
{

	// ----------------------------------------------------
	// Atributos 
	// ----------------------------------------------------

	/**
	 * Referencia al primer nodo de la cola
	 */
	private Estudiante primero;
	
	/**
	 * Referencia al ultimo elemento de la cola
	 */
	private Estudiante ultimo;
	
	
	// ----------------------------------------------------
	// Constructor 
	// ----------------------------------------------------

	/**
	 * La cola inicia sin nodos
	 */
	public Curso( )
	{
		primero = null;
		ultimo = null;
	}
	
	
	// ----------------------------------------------------
	// Metodos 
	// ----------------------------------------------------

	/**
	 * Agrega un nodo de tipo Estudiante al inicio de la cola
	 * @param codigo Codigo del estudiante
	 * @param nombre Nombre del estudiante
	 * @param nota Nota final del estudiante
	 */
	public void enqueue( int codigo, String nombre, double nota )
	{
		Estudiante nuevo = new Estudiante( codigo, nombre, nota );

		if( primero == null )		// No hay nodos
		{
			primero = nuevo;
			ultimo = nuevo;
		}
		else
		{
			ultimo.setSiguiente( nuevo );
			ultimo = nuevo;
		}
	}
	
	
	/**
	 * Recorre la lista tipo cola e imprime todos los nodos de la misma
	 */
	public void imprimirCola( )
	{
		Estudiante actual = primero;
		
		while( actual != null )
		{
			System.out.println( actual );
			actual = actual.getSiguiente( );
		}
	}
	
	
	/**
	 * Elimina el primer nodo de la lista tipo cola
	 * @return El primer Estudiante ubicado en lista tipo cola o null si esta vacia
	 */
	public Estudiante dequeue( )
	{
		Estudiante eliminado = primero;
		
		if( primero != null )
		{
			primero = primero.getSiguiente( );
		}
		
		return eliminado;
	}
	
	public boolean intercambiarPrimeroUltimo() {
	    // Verificar que haya al menos dos elementos
	    if(primero == null || primero == ultimo) {
	        return false;
	    }
	    
	    // Encontrar el penúltimo nodo
	    Estudiante actual = primero;
	    Estudiante penultimo = null;
	    while(actual.getSiguiente() != ultimo) {
	        actual = actual.getSiguiente();
	    }
	    penultimo = actual;
	    
	    // Realizar el intercambio
	    ultimo.setSiguiente(primero.getSiguiente());
	    penultimo.setSiguiente(primero);
	    primero.setSiguiente(null);
	    
	    // Actualizar referencias primero y ultimo
	    Estudiante temp = primero;
	    primero = ultimo;
	    ultimo = temp;
	    
	    return true;
	}


}
