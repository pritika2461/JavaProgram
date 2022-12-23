interface BankLone
{
   public void lone();
}
class Bank1 implements BankLone
{
  public void lone()
  {
    System.out.println("SBI");
  }
}


class Bank2 implements BankLone
{
  public void lone()
  {
    System.out.println("BOI");
  }
}


class Bank3 implements BankLone
{
  public void lone()
  {
    System.out.println("HDFC");
  }
}


public class UseBankLone
{
  public static void main(String[] args)
  {
     BankLone b= new Bank2();
	 b.lone();
  }
}