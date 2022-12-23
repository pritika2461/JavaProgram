class PrintArea
{
     int l,b, s, area;
	 
     public void  area(int s)
	 {
	    this.s=s;
		area = s*s;
		System.out.println("Area of Square : "+area);
	 }
	 
	  public void  area(int l, int b)
	 {
	    this.l=l;
		this.b=b;
		area = l*b;
		System.out.println("Area of Reactangle : "+area);
	 }
}

public class UsePrintArea
{
   public static void main(String[] args)
   {
       PrintArea p =new PrintArea();
	   p.area(10);
	   p.area(10,20);
   }
}