package dds.comunicacionales.callreturn;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import callreturn.Pila;

public class PilaCallReturnTest {
	
	@Test
	public void pilaVaciaSinElementos() {
		Pila pila = Pila.empty();
		
		System.out.println(pila);
		assertEquals(0, pila.size());
	}
	
	@Test
	public void testPilaCon1Elemento() {
		Pila pila = Pila.empty().poner(1);
		
		System.out.println(pila);
		assertEquals(1, pila.size());
	}
	
	@Test
	public void testPilaConNElemento() {
		Pila pila = Pila
				.empty()
				.poner(1)
				.poner(2)
				.poner(3);
		
		System.out.println(pila);
		assertEquals(3, pila.size());
	}
	
	@Test
	public void testPilaSacarElemento() {
		Pila pila = Pila
				.empty()
				.poner(10)
				.poner(20)
				.poner(82)
				.sacar();
		
		System.out.println(pila);
		assertEquals(2, pila.size());
		assertEquals(new Integer(0), pila.tope());
	}
	
}
