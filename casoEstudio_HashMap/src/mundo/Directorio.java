package mundo;

import java.util.*;

public class Directorio 
{
	/**
	 * Colección clave - valor donde la clave es el nombre y el valor es el telefono
	 */
	private HashMap <String, String> directorio;
	
	/**
	 * El directorio inicia vacío (sin elementos)
	 */
	public Directorio( )
	{
		directorio = new HashMap<String, String> ( );
	}
	
	/**
	 * Agrega un elemento a la coleccion directorio
	 * @param nombre Clave - Nombre de la persona 
	 * @param telefono Valor - Telefono de la persona
	 */
	public void agregarEntrada( String nombre, String telefono )
	{
		directorio.put( nombre, telefono );
	}
	
	/**
	 * Obtiene el valor del telefono almacenado en la coleccion directorio a partir de 
	 * la clave nombre
	 * @param nombre Clave utilizada para buscar el telefono
	 * @return El telefono si la clave existe, o null en caso contrario
	 */
	public String obtenerTelefono( String nombre )
	{
		String telefono = directorio.get( nombre );
		return telefono;
	}
	
	
	/**
	 * Elimina la entrada almacenada en la coleccion directorio a partir de la clave nombre
	 * @param nombre Clave utilizada para buscar la entrada por eliminar
	 * @return El telefono si la entrada fue eliminada, o null en caso contrario
	 */
	public String eliminarEntrada( String nombre )
	{
		String telefono = directorio.remove( nombre );
		return telefono;
	}
	
	/**
	 * Recorre la coleccion directorio e imprime cada una de las entradas
	 */
	public void imprimirDirectorio( )
	{
		for( HashMap.Entry <String, String> entry : directorio.entrySet( ) ) {
			System.out.println( entry.getKey( ) + " -> " + entry.getValue( ) );
		}
	}	
		/*
		for( Empleado e : empleados )
		{
			System.out.println( e );
		}
		*/
	
	/**
	 * Modifica en una entrada de la colección directorio su teléfono, si existe.
	 * @param nombre Clave por buscar
	 * @param nuevoTelefono Nuevo valor de la entrada con la clave dada
	 * @return True si se hace la actualizacion, o False en caso contrario 
	 */
	public boolean actualizarEntrada( String nombre, String nuevoTelefono )
	{
		boolean actualizado = false;
		
		if( directorio.containsKey( nombre ) )
		{
			directorio.put( nombre, nuevoTelefono );
			actualizado = true;
		}
		
		return actualizado;
	}
	
	
	
}
