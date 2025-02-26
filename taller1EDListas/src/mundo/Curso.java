package mundo;

/**
 * Representa una lista enlazada de nodos de la clase Estudiante
 */

public class Curso {
	
	private Estudiante cabeza;

	public Curso() {
		
		cabeza = null;
	}
	
	public void agregarEstudianteInicio(int codigo, String nombre, double nota){
		
		Estudiante nuevo = new Estudiante(codigo, nombre, nota);
		nuevo.setSiguiente(cabeza);
		cabeza = nuevo;
	}
	
	/**
	 * Agrega un nodo de tipo Estudiante al final de la lista
	 * @param codigo Codigo del estudiante
	 * @param nombre Nombre del estuiante
	 * @param nota Nota final del estudiante
	 */
	public void agregarEstudianteFinal(int codigo, String nombre, double nota){
		
		Estudiante nuevo = new Estudiante(codigo, nombre, nota);
		
		if (cabeza == null) {
			cabeza= nuevo;
		}
		else {
			Estudiante actual = cabeza;
			
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
		}
	}
	
	
	/**
	 * Recorre la lista de estudiantes e imprime cada uno
	 */
	public void listarEstudiantes() {
		
		Estudiante actual = cabeza;
		
		while(actual != null) {
			System.out.println(actual);
			actual = actual.getSiguiente();
		}
	}
	
	
	/**
	 * Busca un estudiante en la lista enlazada con el codigo recibido por parametro.
	 * @param codigo Codigo del estudiante por buscar
	 * @return El estudiante encontrado o null si no existe
	 */
	
	public Estudiante buscarEstudiante(int codigo) {
		Estudiante actual = cabeza;
		
		while(actual != null) {
			if(actual.getCodigo() == codigo) {
				return actual;
				
			}
			
			actual = actual.getSiguiente();
		}
		//No encontro el estudiante con el codigo dado
		return null;
		
	}
	
	/**
	 * Modifica el estudiante actual con la informacion recibida por parametro
	 * @param codigo Codigo del estudiante por modificar
	 * @param nombre Nuevo nombre del estuiante
	 * @param nota Nueva nota final del estudiante
	 * @return True si se realizo la modificacion, False en caso contrario
	 */
	public boolean editarEstudiante(int codigo, String nombre, double nota) {
		
		boolean modificado = false;
		Estudiante encontrado = buscarEstudiante(codigo);
		
		if(encontrado != null) {
			
			encontrado.setNombre(nombre);
			encontrado.setNota(nota);
			modificado = true;
		}
		return modificado;
	}
	
	
	
	
	public Estudiante estudianteDelMedio() {
		
		 Estudiante lentin = cabeza;
		 Estudiante rapidin = cabeza;

	        while (rapidin != null && rapidin.getSiguiente() != null) {
	        	lentin = lentin.getSiguiente();         
	        	rapidin = rapidin.getSiguiente().getSiguiente();    
	        }

	        return lentin; 
	    }
	
	
	public Estudiante estudianteMayorNota() {
		
		Estudiante puntero = cabeza;
		Estudiante mayorNota = cabeza;
		
		while(puntero != null) {
			if(puntero.getNota() > mayorNota.getNota()) {
				mayorNota = puntero;
			}
			puntero = puntero.getSiguiente();
		}

		return mayorNota;
	}
	
	
public int estudianteConInicial(String inicial) {
		
		Estudiante puntero = cabeza;
		int contador = 0;
		
		while(puntero != null) {
			if(puntero.getNombre().startsWith(inicial)) {
				contador++;
			}
			puntero = puntero.getSiguiente();
		}

		return contador;
	}
	
public void eliminarEstudiantesPorNota(double umbral) {
	
    while (cabeza != null && cabeza.getNota() < umbral) {
        cabeza = cabeza.getSiguiente();
    }
    if (cabeza == null) return;

    Estudiante actual = cabeza;
    while (actual != null && actual.getSiguiente() != null) {
        if (actual.getSiguiente().getNota() < umbral) {
            actual.getSiguiente().setSiguiente(actual.getSiguiente().getSiguiente()); // Saltamos el nodo a eliminar
        } else {
            actual = actual.getSiguiente(); // Avanzamos en la lista
        }
    }
}

}


