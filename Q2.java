import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner jk= new Scanner(System.in);

		System.out.println("Enter the mass");

		double mass = jk.nextDouble();

		double weight = calWeight(mass);

		System.out.println("The weigth is "+weight);

		}

		static double calWeight(double mass){

		double weight = mass*9.8; 
		// assume a = accelation due to gravity = 9.8N

		if(weight>1000){

		System.out.println("Too Heavy");

		}

		else if(weight<10){

		System.out.println("Too Light");

		}

		return weight;

			

	}

}
