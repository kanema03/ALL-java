import java.util.Scanner;
public class testscores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Double score1, score2, score3, avg;
		
		
		System.out.println("please enter your first score");
		score1 = input.nextDouble();
		 
	    System.out.println("please enter your second score");
		score2 = input.nextDouble();
		
		 System.out.println("please enter your third score");
			score3 = input.nextDouble();
			
			avg = score1 + score2 + score3;
			System.out.println("your avg is:" + avg);
			
			
			
					

	}

}
