import java.util.Scanner;  // Import the Scanner class

public class welcome {
  public static void main(String[] args) {
   
    
    Scanner josh = new Scanner(System.in);
    System.out.println("Enter username");
    String userName = josh.nextLine();
    System.out.println("Welcome: " + userName);
    
  }
}