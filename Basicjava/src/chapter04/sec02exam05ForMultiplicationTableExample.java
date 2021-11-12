package chapter04;

public class sec02exam05ForMultiplicationTableExample {
public static void main(String[] args) {
	// nested loop
	for (int m=2; m<=9; m++) {
		System.out.println(" ");
		System.out.println("*** " + m + "단***");
		
		for (int n=1; n<=9; n++) {
			System.out.println(m + " X " + n + " = " + (m*n));
		}
	}		
}
}
