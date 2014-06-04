package dds.comunicacionales.continuation;

import org.junit.Test;

public class EvenTest {

	@Test
	public void test() {
		NumbersAsync.even(2, isEven -> {
			System.out.println("Es Par: " + isEven);
		});
	}
	
	@Test
	public void testAsyncComplejo() {
		NumbersAsync.sum(2, 3, n -> {
			System.out.println("Suma: " + n);
			NumbersAsync.even(n, isEven -> {
				System.out.println("Es Par: " + isEven);
			});
		});
	}
}
