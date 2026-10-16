import java.util.*;
public class ATM_Withdrwal {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
    int balance = 1000;
    while (balance>0) {
    	System.out.println("Current balance is:"+" "+balance); 
    	// show balance
    	System.out.println("Enter value to withdraw");
    	 int withdraw = sc.nextInt() ; // User enter amount 570 --> true loop exits 
    	 
    if(withdraw< balance) {
    	System.out.println("withdraw Succesfully : "+ withdraw);
    	balance = balance - withdraw ; // Update the balance 
    }else 
    {
    	System.out.println("nsufficent Balance");
    }
    System.out.println("---------------------------------");
    }
    
    
    System.out.println("Your account Balance is :" +" "+balance); // updated balace will show
    sc.close();
   
	}

}
