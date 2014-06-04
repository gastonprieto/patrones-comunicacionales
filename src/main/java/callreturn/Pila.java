package callreturn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pila {
	
	private List<Integer> elementos  = new LinkedList<>();

	private Pila(List<Integer> elementosAgregar) {
		this.elementos.addAll(elementosAgregar);
	}
	
	private Pila() {
		super();
	}

	public static Pila empty() {
		return new Pila();
	}

	public int size() {
		return elementos.size();
	}

	public Pila poner(int elemento) {
		return new Pila(new LinkedList<Integer>() {{
			addAll(elementos);
			add(elemento);
		}});
	}

	@Override
	public String toString() {
		return "Pila" + Arrays.toString(elementos.toArray()) + "";
	}

	public Pila sacar() {
		return new Pila(new LinkedList<Integer>(){{
			addAll(elementos);
			remove(tope());
		}});
	}

	public Integer tope() {
		if (size() > 0) {
			return elementos.get(elementos.size() - 1);
		} else {
			return null;
		}
	}
	
	

}
