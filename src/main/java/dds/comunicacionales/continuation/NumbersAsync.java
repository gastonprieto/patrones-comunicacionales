package dds.comunicacionales.continuation;

import java.util.function.Consumer;

public class NumbersAsync {

	public static void even(int elem, Consumer<Boolean> continuation) {
		continuation.accept(elem % 2 == 0);
	}

	public static void sum(int x, int y, Consumer<Integer> continuation) {
		continuation.accept(x + y);
	}

}
