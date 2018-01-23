//largest between given n no.
import java.util.*;
public class biggest2 
{
public static void main(String[] args)
    {
        int large=0; 
        int num;
        System.out.println("how many no. you want to enter");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("enter "+n+" no");
        for(int i=0;i<n;i++)
        {
          num=input.nextInt();
          if(num>large)
          {
           large=num;
          }
        }
          System.out.println("the largest is:"+large);
    }

}
