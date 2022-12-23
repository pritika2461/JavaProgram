class Operation1
{
int a,b,c;
  public void add()
{
  c=a+b;   
}
}
class Operation2 extends Operation1
{
  public void add()
{
 c=a-b;
}

public class Operation3 extends Operation2
{
 public static void main(String[] args)
{
   Operation3 s = new Operation3();
  s.add();
}
}
}