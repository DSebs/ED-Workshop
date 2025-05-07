package interfaz;

import mundo.*;

public class TestHashMap {

	public static void main(String[] args) 
	{
		// 1. Creación del objeto con a colección de tipo HashMap
		Directorio directorio = new Directorio( );
		
		// 2. Agregar entradas a la colección HashMap
		directorio.agregarEntrada( "Juan", "1234" );
		directorio.agregarEntrada( "Maria", "5678" );
		directorio.agregarEntrada( "Pedro", "9012" );
		directorio.agregarEntrada( "Rosa", "3456" );
		directorio.agregarEntrada( "Carlos", "7890" );
		directorio.agregarEntrada( "Camila", "9876" );
		
		System.out.println( "Lista inicial de entradas: " );
		directorio.imprimirDirectorio( );
		System.out.println( );
		
		// 3. Consultar entradas de la colección
		System.out.println( "Consulta: Pedro - " + directorio.obtenerTelefono( "Pedro" ) );
		System.out.println( "Consulta: Camila - " + directorio.obtenerTelefono( "Camila" ) );
		System.out.println( "Consulta: Jorge - " + directorio.obtenerTelefono( "Jorge" ) );
		System.out.println( );
		
		// 4. Eliminacion de entradas
		String eliminado;
		eliminado = directorio.eliminarEntrada( "Pedro" );
		if( eliminado != null ) 
			System.out.println( "Entrada eliminada: Pedro " + eliminado );
		else
			System.out.println( "No se encontro una entrada con la clave 'Pedro' " );
		
		System.out.println( "Consulta: Pedro - " + directorio.obtenerTelefono( "Pedro" ) );
		System.out.println( );
		
		System.out.println( "Lista despues de eliminar la entrada con clave 'Pedro': " );
		directorio.imprimirDirectorio( );
		System.out.println( );	
		
		// 5. Actualización de entradas
		if ( directorio.actualizarEntrada( "Rosa", "6543" ) )
			directorio.imprimirDirectorio();
		else
			System.out.println( "No se actualiza la entrada. No existe la clave 'Rosa'");
		
		if ( directorio.actualizarEntrada( "Pedro", "2109" ) )
			directorio.imprimirDirectorio();
		else
			System.out.println( "No se actualiza la entrada. No existe la clave 'Pedro'");
		
	}

}
