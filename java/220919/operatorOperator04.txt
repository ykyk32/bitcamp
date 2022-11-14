package operator;

public class Operator04 {

	public static void main(String[] args) {
		int a= 5;
		a += 2; //a = a + 2
		a *= 3; //a= a * 3
		System.out.println("a = " + a); // a = 21
		
		a++;
		System.out.println("a = " + a); // a = 22
		
		int b = a++;// int b =a; a++; 
		System.out.println("a = "+ a + " b = " + b);//a = 23 b = 22
		
		int c = ++a - b--; //++a; int c = a + b; b--;
		System.out.println("c = " + c + " a = "+ a + " b = " + b);//c = 2 a = 24 b = 21
		
		System.out.println("a++ = " + a++);//24, a++ = a; a++
		System.out.println("a = " + a);  //25
	

	}

}
