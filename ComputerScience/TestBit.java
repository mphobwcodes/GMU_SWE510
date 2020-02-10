package ComputerScience;

public class TestBit {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Normal: " + a);
		//Bitwise left shift (<<) is equivalent multiplication by two (and faster)
		System.out.println("Multiply by two: " +( a<< 1));
		//Butwise right shift (>>) is equivalent to division by two
		System.out.println("Divide by Two: " +( a>> 1));
		//Use xor(^) operator to quickly swap numbers without third variable
		System.out.println("a: " + a + ",b:" + b);
		a ^=b;
		b ^=a;
		a ^=b;
		System.out.println("a: " + a + ",b:" + b);

	}

}
