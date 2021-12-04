import java.util.Scanner;
import java.util.*;

public class NestedSwitch
{
   public static void main(String[] args)
   {
      int year = 3;
      int marks = 80;
      switch(year) 
      {
         
         case 1:
         System.out.println("First year students are not eligible for scholarship ");
         break;
         case 2:
         System.out.println("Second year students are not eligible for scholarship");
         break;
         case 3:
         switch(marks)
         {
            case 50:
            System.out.println("You are not eligible for scholarship");
            break;
            case 80:
            System.out.println("Congrats!!!!! you are eligible for scholarship");
            break;
         }
         break;
         
         default: System.out.println("Please enter valid year");
     }
   }
}
