/**
 * EmptyInstruction shows error sources through empty instructions
 * Example program
 * @author Alexander
 * @version 10/31/2024
 */

public final class EmptyInstruction {
	private EmptyInstruction() {}
	

	/** main is the start of the program
	 * @param args is not used
	 */
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40};
		for(int i = 0; i < a.length; i++);
		System.out.println(a[i]); // Compile error because of the
					  // program not knowing what [i] is
	}
}
