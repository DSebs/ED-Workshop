package interfaz;

import mundo.*;

public class InterfazListaCircular 
{

	public static void main(String[] args) 
	{
		// Se crea la lista enlazada circular
		Curso curso = new Curso( );

		curso.agregarEstudianteInicio( 1, "Juan", 3.5 );
		curso.agregarEstudianteInicio( 2, "Maria", 4.3 );
		curso.agregarEstudianteInicio( 3, "Pedro", 2.5 );
		curso.agregarEstudianteInicio( 4, "Rosa", 3.8 );
		curso.agregarEstudianteInicio( 5, "Carlos", 1.8 );
		curso.agregarEstudianteInicio( 6, "Camila", 3.2 );

		System.out.println( "Lista Circular Inicial:" );
		curso.imprimirLista( );
		
		
		// Eliminacion de nodos: Intermedio
		boolean resultado;
		resultado = curso.eliminarEstudiante( 3 );
		if( resultado ) {
			System.out.println( );
			System.out.println( "Nodo 3 eliminado" );
			System.out.println( "Nueva lista circular: " );
			curso.imprimirLista( );
		}
		else {
			System.out.println( "No se elimina el estudiante. Codigo no existe" );
			curso.imprimirLista( );
		}
		
		// Eliminacion del primer nodo
		resultado = curso.eliminarEstudiante( 6 );
		if( resultado ) {
			System.out.println( );
			System.out.println( "Nodo 6 eliminado" );
			System.out.println( "Nueva lista circular: " );
			curso.imprimirLista( );
		}
		else {
			System.out.println( "No se elimina el estudiante. Codigo no existe" );
			curso.imprimirLista( );
		}
		
		// Eliminacion del ultimo nodo
		resultado = curso.eliminarEstudiante( 1 );
		if( resultado ) {
			System.out.println( );
			System.out.println( "Nodo 1 eliminado" );
			System.out.println( "Nueva lista circular: " );
			curso.imprimirLista( );
		}
		else {
			System.out.println( "No se elimina el estudiante. Codigo no existe" );
			curso.imprimirLista( );
		}
		
		// Eliminacion de un nodo no existente
		resultado = curso.eliminarEstudiante( 7 );
		if( resultado ) {
			System.out.println( );
			System.out.println( "Nodo 7 eliminado" );
			System.out.println( "Nueva lista circular: " );
			curso.imprimirLista( );
		}
		else {
			System.out.println( );
			System.out.println( "No se elimina el estudiante. Codigo 7 no existe" );
			curso.imprimirLista( );
		}
	}

}
