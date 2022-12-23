public class Vehical
{
 int v_no;
 String name;
 String color;

public void getData(int v_no, String name, String color)
{
 this.v_no= v_no;
this.name= name;
this.color= color;
}
public static void main(String[] args)
{
 Vehical v1= new Vehical();
 v1.getData(7871, "Car", "White");
System.out.println(v1.v_no+" "+v1.name+" "+v1.color);
}
}