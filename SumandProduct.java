import java.util.Scanner;
import java.util.*;

class SumandProduct
{
	public static void main(String args[]) {
	  Scanner in = new Scanner(System.in); 
	  System.out.println("Digits Sum and Product");
	
	  System.out.print("Enter Number: ");
    
	  int number = in.nextInt();
    
	  int remainder, temp, sum=0, product=1;
	  temp = n;
	  while (temp!=0){
		  remainder = temp % 10;
		  sum = sum + remainder;
		  product = product * remainder;
		  temp = temp / 10;
	  }
	  System.out.println("Sum of digits of Number '"+n+"'': "+sum);
	  System.out.println("Product of digits of Number '"+n+"'': "+product);
	}
 } 
