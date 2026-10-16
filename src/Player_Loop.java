import java.util.Scanner;
public class Player_Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	for (int Player =1 ; Player <=3 ;Player++) { // loop first for 1st player acco. all 3 players 
		System.out.println("enter the number");
		int Enter	= sc.nextInt(); // Allows all users to enter their choice number
	
		switch (Enter)
		{
		  case 1 -> System.out.println("paper");
		  case 2 -> System.out.println("Rock");
		  case 3 -> System.out.println("Scissor");
		  default -> System.out.println("Invalid");
		
	}
	
	}
}
}
