import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		 sumar();

	}
	
	public static void sumar() {
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Introduzca el primer numero: ");
		num1 = input.nextInt();
		
		System.out.print("Introduzca el primer numero: ");
		num2 = input.nextInt();
		
		System.out.println("El resultado es " + (num1 + num2));
	}

}
