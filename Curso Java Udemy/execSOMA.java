import java.util.Scanner;
public class execSOMA {

	public static void main(String[] args) {

	int a, b;
	
	Scanner sc = new Scanner (System.in);
	
	a = sc.nextInt();
	b = sc.nextInt();
	
	int soma = a + b; 
	
	System.out.printf ("A Soma de %d + %d é igual a %d",a, b, soma  );
	
	sc.close();
	
	} 
}
