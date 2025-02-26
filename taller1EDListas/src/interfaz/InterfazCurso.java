package interfaz;

import mundo.*;

public class InterfazCurso {

	public static void main(String[] args) {
		
		//Creacion de la lista enlazada
		Curso curso = new Curso();
		
		/*
		//Agregar elementos a la lista enlazada
		curso.agregarEstudianteInicio(1, "Juan", 3.5);
		curso.agregarEstudianteInicio(2, "Maria", 4.3);
		curso.agregarEstudianteInicio(3, "Pedro", 2.5);
		curso.agregarEstudianteInicio(4, "Rosa", 3.8);
		*/
		
		
		curso.agregarEstudianteFinal(1, "Juan", 3.5);
		curso.agregarEstudianteFinal(2, "Maria", 4.3);
		curso.agregarEstudianteFinal(3, "Pedro", 2.5);
		curso.agregarEstudianteFinal(4, "Rosa", 3.8);
		
		//Imprimir la lista enlazada
		curso.listarEstudiantes();
		
		
		//Busqueda de un estudiante
		Estudiante encontrado;
		
		encontrado = curso.buscarEstudiante(3);
		if(encontrado !=null) {
			System.out.println("Estudiante encontrado: \n"+ encontrado);
		}
		else {
			System.out.println("No existe el estudiante con el codigo dado");
		}
		
		//TODO Verificar un codigo de estudiante que no exista
		
		//Edicion
		boolean modificado;
		modificado = curso.editarEstudiante(3, "Carlos", 1.8);
		if (modificado) {
			System.out.println("Estudiante modificado con exito");
		}
		else {
			System.out.println("Estudiante no existe");
		}
		
		//Verificacion
		curso.listarEstudiantes();
		
		Estudiante estuDelMedio;
		estuDelMedio = curso.estudianteDelMedio();
		System.out.println("Estudiante del medio: \n"+ estuDelMedio);
		
		
		Estudiante mayorNota;
		mayorNota = curso.estudianteMayorNota();
		System.out.println("Estudiante mas nota: \n"+ mayorNota);
		
	}

}
