import java.io.IOException;
import java.util.List;

public class Test extends A implements B, C, D {

	private Integer a, b;
	public final String c;
	protected short s;

	public <T> A(int i, final char[][] c, double... d) {

	}

	public <T> double f(final T t) throws IOException {

	}

	private static final class E<T extends V, U> extends F<T, U> implements G {

		public static void h(char[] arr, final int NUM, List<T> list, long... moreParams) {

		}

	}

}

protected interface OtherI<T> extends Some1I, Some2I, Some3I {

	public final int NUM1, NUM2;

	static byte[] someMethod(boolean b, T... params);

}

private enum SomethingE implements SomethingElseI {
	A, B, C, D, E;
}
