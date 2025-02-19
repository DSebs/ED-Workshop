package interfaz;

import mundo.*;

public class InterfazPila 
{

	public static void main( String [] args) 
	{
		// Creacion de la pila
		Curso curso = new Curso( );
		
		// Se agregan nodos a la pila
		curso.push( 1, "Juan", 3.2 );
		curso.push( 2, "Maria", 4.5 );
		curso.push( 3, "Pedro", 2.5 );
		curso.push( 4, "Rosa", 3.7 );
		curso.push( 5, "Carlos", 1.8 );
		
		// Se imprime la pila
		curso.imprimirPila( );
		
		// Eliminar elementos de la pila
		Estudiante eliminado;
		
		eliminado = curso.pop( );
		
		System.out.println( );
		System.out.println( "Eliminado: " + eliminado );
		curso.imprimirPila( );
		
		curso.restaurarUltimo();
		
		System.out.println("");
		curso.imprimirPila( );
		
		curso.intercambiarUltimos();
		
		System.out.println("");
		curso.imprimirPila( );
		
		
	}

}
