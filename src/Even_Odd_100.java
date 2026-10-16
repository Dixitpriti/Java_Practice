import java.util.Scanner;
public class Even_Odd_100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to vierfy even or Odd");
             int Number = sc.nextInt();
             if(Number%2==0) {
            	 System.out.println(Number +"- "+ "Enter number is even");
             }else {
            	 System.out.println(Number + "Enter number is Odd");
             }
             
             
             
	}

}
