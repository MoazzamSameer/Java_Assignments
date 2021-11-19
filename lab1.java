import java.awt.*;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double rad = input.nextDouble();
        double ar = 3.14 * (rad*rad);
        System.out.println("area = "+ar);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number1: ");
        int n1 = input.nextInt();
        System.out.println("Enter an number2: ");
        int n2 = input.nextInt();

        if (n1 > n2){
            System.out.println("Largest number is "+n1);
        }
        else if (n2>n1){
            System.out.println("Largest Number is "+n2);
        }
        else
            System.out.println("Numbers are equal");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int n = input.nextInt();
        int i=0;
        while (i<=n){
            System.out.println("Printing even numbers upto "+n);
            System.out.println(i);
            i = i+ 2;
        }

        public static void main(String[] args){
            Scanner input  = new Scanner(System.in);
            System.out.print("Enter an positive integer: ");
            long x = input.nextInt();
            long a = 1;
            int i = (int)(n);
            if (x==0)
            {
                System.out.println(x+"! = "+a);
                return;
            }
            while(i!=0)
            {
                a = a * i;
                i--;
            }
            System.out.println(x+"! = "+a);
    
    
        }

        public static long a(long x) {
            if (x <= 1)
               return 1;
            else
               return x * a(x - 1);
         }
         public static void main(String args[]) {
            System.out.println("The factorial of 6 is: " + a(6));
            System.out.println("The factorial of 0 is: " + a(0));
         }


         public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an positive integer: ");
            double n = input.nextInt();
            int i = 1,j;
            while(i*i<=n){
                if(n%i==0){
                    j = (int)(n/i);
                    if(i==j)
                        System.out.print(j);
                    else
                        System.out.print(i+" "+j+" ");
                }
                i++;
            }
        }

        public static int fibonacciRecursion(int x){
            if(x == 0){
                return 0;
            }
            if(x == 1 || x == 2){
                    return 1;
                }
            return fibonacciRecursion(x-2) + fibonacciRecursion(x-1);
            }
            public static void main(String args[]) {
            int nn = 10;
            System.out.print("Fibonacci Series of "+nn+" numbers: ");
            for(int i = 0; i < nn; i++){
                    System.out.print(fibonacciRecursion(i) +" ");
                }
            }

            public static void main(String[] args) {
                int pnum =0,cnum = 1,nnum,n;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter an number: ");
                n = input.nextInt();
                int i = 1;
                System.out.println(pnum);
                System.out.println(cnum);
                while(i<=n){
                    nnum = pnum + cnum;
                    System.out.println(nnum)w;
                    pnum = cnum;
                    cnum = nnum;
                    i+=1;
                }
        
        
            }


            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter year: ");
                long y = input.nextInt();
                if(((y%4==0)&&(y%100!=0))||(y%400==0)){
                    System.out.println(y+" is a leap year");
                }
                else
                    System.out.println(y+" is not a leap year");
        
            }

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter an number1: ");
                int num1 = in.nextInt();
                System.out.println("Enter an number2: ");
                int num2 = in.nextInt();
                if (num1 > num2) {
                    System.out.println("Largest number is " + num1);
                } else {
                    System.out.println("Largest number is " + num2);
                }
            }

            public static void main(String args[])  
   {  
      String or, rev = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      or = in.nextLine();   
      int l = or.l();   
      for ( int i = l - 1; i >= 0; i-- )  
         reverse = rev + or.charAt(i);  
      if (or.equals(rev))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  

   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer to check prime or not: ");
    int nu = input.nextInt();
    int i = 2;
    if (nu <= 1){
        System.out.println("Neither prime nor composite");
        return;
    }
    while( i * i <= nu ){
        if( nu % i == 0){
            System.out.println("Integer " + nu + " is not Prime!");
            return;
        }
        i++;
    }
    if(i*i>nu)
        System.out.println("Integer " + nu + " is Prime!");


}

public static void main(String[] args) {
    for(int i = 1;i<=10;i++){
        for (int j = 0;j<=i;j++){
            System.out.print('*');
            System.out.print(' ');
        }
        System.out.println();
    }

}

}
