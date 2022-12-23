public class InnerFor
{
 public static void main(String[] args)
{
 loop:for(int i =1; i<=5; i++)
{
     for(int j=1; j<=i; j++)
     {
         if(j==4 )
         {
             break loop ;
         }
         System.out.print("*");
     }
System.out.println(" ");
}
}
}