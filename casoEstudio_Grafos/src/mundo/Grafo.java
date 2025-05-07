package mundo;

import java.util.*;

public class Grafo <V>
{
	private HashMap< V, List<V> > listaAdyacencia;
	
	public Grafo( )
	{
		listaAdyacencia = new HashMap <> ( );
	}
	
	public void agregarVertice( V vertice )
	{
		listaAdyacencia.putIfAbsent(vertice, new ArrayList <> ( ) );
	}
	
	
}
