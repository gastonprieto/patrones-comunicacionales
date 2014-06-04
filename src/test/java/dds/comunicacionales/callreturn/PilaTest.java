package dds.comunicacionales.callreturn;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import callreturn.Pila;

public class PilaTest {
	
	@Test
	public void pilaVaciaSinElementos() {
		assertEquals(0, Pila.empty().size());
	}
	
	@Test
	public void testPilaCon1Elemento() {
		assertEquals(1, Pila.empty().poner(1).size());
	}
	
}
