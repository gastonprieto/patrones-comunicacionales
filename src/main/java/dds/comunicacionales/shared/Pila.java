package dds.comunicacionales.shared;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pila {
	private List<Integer> elementos = new ArrayList<>();

	public void poner(Integer elemento) {
		elementos.add(elemento);
	}

	public Integer sacar() {
		Integer tope = tope();
		elementos.remove(tope);
		return tope;
	}

	public Integer tope() {
		if (!elementos.isEmpty()) {
			return elementos.get(elementos.size() - 1);
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "Pila" + Arrays.toString(elementos.toArray()) + "";
	}

	public int size() {
		return elementos.size();
	}
	
	
}
