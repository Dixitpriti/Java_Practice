import java.util.*;
public class Game_Pattern {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- Rock, Paper, Scissors Game Menu ---");
    System.out.println("Start the play and enter the number");
            int choice = sc.nextInt();
            switch (choice) {
            case 1 -> System.out.println("You choose Rock"); 
            case 2 -> System.out.println("You choose Paper"); 
            case 3 -> System.out.println("You choose Scissor"); 
            default -> System.out.println("Invalid choice try again"); 
            
            }
            sc.close();
	}
	

}
