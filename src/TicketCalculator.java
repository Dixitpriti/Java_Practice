import java.util.*;
public class TicketCalculator {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  //  Ask the total people of group
    System.out.println("Tell me the total no. people ");
         int totalPeople = sc.nextInt(); //3 people 
         int GroupPrice =0;
         // hold basic price
         for(int i=1; i<=totalPeople; i++){
        	 System.out.println("enter the Age of person" + i);
        	 int Age = sc.nextInt();
        	 int IndividualPrice =0;
        	 if(Age < 5) {
        		 IndividualPrice =0;
        		 System.out.println("Free entry");
        	 }else if(Age<=12) {
        		 IndividualPrice = 20;
        	 }else if(Age<=65) {
        		 IndividualPrice = 40;

        	 }else {
        		 IndividualPrice = 60;

        	 }
         
               	 
        	 
        	 GroupPrice = GroupPrice + IndividualPrice;
             System.out.println("Running Total so far: $" + GroupPrice);
             System.out.println("-----------------------------------");
         } // <--- The loop ends here now!
          
         // Moved the GRAND TOTAL print statements outside the loop
         System.out.println("=========================================");
         System.out.println("GRAND TOTAL for the group of " + totalPeople + " is: $" + GroupPrice);
         System.out.println("=========================================");
          
         sc.close();
         
	}
}
        	 
        	 
