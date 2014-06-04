package dds.comunicacionales.shared;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PilaSharedTest {

	@Test
	public void test() {
		Pila p = new Pila();
		p.poner(10);
		p.poner(20);
		Integer elem = p.sacar();
		
		System.out.println(p);
		assertEquals(1, p.size());
		assertEquals(new Integer(20), elem);
	}
}
