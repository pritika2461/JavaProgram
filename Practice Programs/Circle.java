public class Circle
{
int r=4;
static final double  pi= 3.14;
double area;
public void method1()
{
 area = pi*r*r;
}
public static void main(String[] args)
{
 Circle c1 = new Circle();
c1.method1();
System.out.println(c1.area);
}
}