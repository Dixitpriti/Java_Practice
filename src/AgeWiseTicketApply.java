import java.util.*;
public class AgeWiseTicketApply {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Age");
    int age = sc.nextInt();
    if(age<=5) {
    	System.out.println("entry is free");
    	//False then only else if check
    }else if (age <=12) {
    	System.out.println("entry fee is $10");
    }else if (age <=65) {
    	System.out.println("entry fee is $30");
    }else { //Default execution
    	System.out.println("entry fee is $50");
    }
      sc.close();
    }
    }


