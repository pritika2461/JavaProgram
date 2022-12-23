public class Functions
{
 void addition()
{
 int a=12,b=34;
int c= a+b;
System.out.println(c);
} 

void substraction(int a, int b)
{
  int c = a-b;
System.out.println("Sub "+c);
}

int mul(int a, int b)
{
int c= a*b;
return c;
}

public static void main(String[] args)
{
 Functions f1 = new Functions();
 f1.addition();
f1.substraction(40,20);
System.out.println(f1.mul(30,3));
}
}