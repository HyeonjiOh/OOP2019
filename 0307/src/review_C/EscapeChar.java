package review_C;

public class EscapeChar {
	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'C'); // AC // line¿Ãπ«∑Œ «— ¡Ÿ ∂ŸæÓ¡‹
		System.out.println("AB" + '\t' + 'C'); // AB	C
		System.out.println("AB" + '\n' + 'C'); // AB \n C
		System.out.println("AB" + '\r' + 'C'); // CB
	}
}
