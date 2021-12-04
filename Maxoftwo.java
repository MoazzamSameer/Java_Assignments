import java.util.*;
import java.util.Scanner;


public class Maxoftwo
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();;
        
        if(i> j)
            System.out.println(i+" is greater than "+j);
        else
            System.out.println(j+" is greater than "+i);
    }
}
