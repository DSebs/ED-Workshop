package interfaz;

import mundo.*;

public class InterfazCola 
{

	public static void main(String[] args) 
	{
		Curso curso = new Curso( );
		
		// Se agregan nodos a la lista tipo cola
		curso.enqueue( 1, "Juan", 3.2 );
		curso.enqueue( 2, "Maria", 4.5 );
		curso.enqueue( 3, "Pedro", 2.5 );
		curso.enqueue( 4, "Rosa", 3.7 );
		curso.enqueue( 5, "Carlos", 1.8 );

		// Se imprime la lista tipo cola
		curso.imprimirCola( );
		
		curso.intercambiarPrimeroUltimo();
		
		System.out.println("");
		curso.imprimirCola( );
	}

}
