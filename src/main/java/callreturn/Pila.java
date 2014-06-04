package callreturn;

import static java.util.Arrays.asList;

import java.util.LinkedList;
import java.util.List;

public class Pila {
	
	private List<Integer> elementos  = new LinkedList<>();

	public Pila(Integer... elementosAgregar) {
		this.elementos = asList(elementosAgregar);
	}

	public static Pila empty() {
		return new Pila();
	}

	public int size() {
		return elementos.size();
	}

	public Pila poner(int elemento) {
		return new Pila(elementos.stream().);
	}

}
