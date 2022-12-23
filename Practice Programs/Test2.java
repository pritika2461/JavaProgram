import lombok.*;
@Data
@AllArgsConstructor
@NorgsConstructor
class Student1
{
  private int roll;
  private String name;
  private String address;
  private int mobile;
  private String college;
}
public class Test2
{	
    public static void main(String arg[])
	{
		 Student1 s1 = new Student1();
		 Student1 s= new Student(11,"Prit","Yeola",876543,"SND");
		 
		    s1.setRoll(10);
			s1.setName("Pritika");
			s1.setAddress("Waghale");
			s1.setMobile(58885);
			s1.setCollege("SND");
			System.out.print(s1.toString());
		 
	}
}